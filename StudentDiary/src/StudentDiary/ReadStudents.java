package StudentDiary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadStudents extends StudentProfile implements Serializable{

	public ReadStudents() {
		super();
	}
	public void read() {
		try {
			FileInputStream fin = new FileInputStream("StudentProfile.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			StudentProfile p = (StudentProfile) ois.readObject();
			this.name = p.name;
			this.rollno = p.rollno;
			this.college = p.college;
			this.DOB =  p.DOB;
			this.semester = p.semester;
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
			FileOutputStream fout = new FileOutputStream("StudentProfile.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			StudentProfile p = new StudentProfile(this.name, this.rollno, this.DOB, this.college, this.semester);
			oos.writeObject(p);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}

}
