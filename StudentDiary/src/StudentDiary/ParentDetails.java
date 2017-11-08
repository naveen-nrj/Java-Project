package StudentDiary;

import java.io.*;
import java.util.Scanner;

public class ParentDetails implements Serializable {
	
	String dadname;
	String momname;
	String email;
	String pno;	
	
	ParentDetails()
	{
		dadname = "";
		momname = "";
		email="";
		pno="";
	}
	
	ParentDetails(String dname,String mname, String mail, String no)
	{
		dadname=dname;
		momname=mname;
		email=mail;
		pno=no;
	}
	
	public void getParentDetails()
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Father's Name");
		dadname=sc.next();
		System.out.println("Enter your Mother's Name");
		momname=sc.next();
		System.out.println("Enter your father's phone number");
		pno=sc.next();
		int l=pno.length();
		if(l!=10) throw new InvalidPhoneNumberException();
		System.out.println("Enter the email");
		email=sc.next();
		String s = "@";
		if(!email.contains(s)) throw new InvalidEmailException();
		}
		
		catch(InvalidPhoneNumberException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		catch(InvalidEmailException i) {
			System.out.println(i);
			System.exit(0);
		}
	}
	
	public void read() {
		try {
			FileInputStream fin = new FileInputStream("ParentDetail.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			ParentDetails p = (ParentDetails) ois.readObject();
			this.dadname = p.dadname;
			this.momname = p.momname;
			this.email = p.email;
			this.pno = p.pno;
			fin.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		}catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		
		}
	}
	public void write() {
		try {
			FileOutputStream fout = new FileOutputStream("ParentDetail.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			ParentDetails p = new ParentDetails(this.dadname, this.momname, this.email, this.pno);
			oos.writeObject(p);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}
	
	public void displayData() {
		System.out.println("Dad's Name:"+dadname);
		System.out.println("Mom's Name:"+momname);
		System.out.println("Phone:"+pno);
		System.out.println("Email:"+email);
	}
}
