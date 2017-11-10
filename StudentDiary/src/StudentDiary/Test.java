package StudentDiary;
import java.io.*;
import java.util.*;
public class Test {
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Firstperiodicals p = new Firstperiodicals();
		ParentDetails pd = new ParentDetails();
		Secondperiodicals sp = new Secondperiodicals();
		Endsem es = new Endsem();
		Internals i = new Internals();
		GPA g= new GPA();
		FinalMarks t = new FinalMarks();
		int b=0;
		while(b!=5) {
		System.out.println("Enter your choice :\n1.Student\n2.Faculty\n3.Parent\n4.Student records\n5.Exit");
		b=s.nextInt();
			switch(b) {
			case 1: {
				System.out.println("How many students? :");
				int scount=s.nextInt();
				StudentProfile[] stu=new StudentProfile[scount];
				for(int j=0;j<scount;j++) {
				stu[j] = new StudentProfile();
				stu[j].newStudentProfile() ;
				FileOutputStream fo=new FileOutputStream("StudentData.ser");
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				oo.writeObject(stu[j]);
				break;
				}
			}
			case 2 :{
				System.out.println("How many faculties? :");
				int fcount=s.nextInt();
				Faculty[] f1=new Faculty[fcount];
				Faculty[] f2=new Faculty[fcount];
				for(int k=0;k<fcount;k++)
				{
				f1[k] = new Faculty();
				f1[k].getf();
				FileOutputStream fo1=new FileOutputStream("Faculty.ser");
				ObjectOutputStream oo1=new ObjectOutputStream(fo1);
				oo1.writeObject(f1[k]);
				f2[k] = new Faculty();
				FileInputStream fi1=new FileInputStream("Faculty.ser");
				ObjectInputStream oi1 =new ObjectInputStream(fi1);
				f2[k]=(Faculty)oi1.readObject();}
				System.out.println("Details of faculties are :");
	 			for(int z=0;z<fcount;z++)
				f2[z].displayf();
				break;
				}
			case 3: {
				ParentDetails p1 = new ParentDetails();
				p1.getParentDetails();
				p1.write();
				break;
			}
			case 4: {
				Scanner s1 = new Scanner(System.in);
				int ch=0;
				System.out.println("Enter the category: \n1- Attendence" + "\n2- Courses" + "\n3- First periodicals" + "\n4- Second Periodicals" + "\n5- Endsem" + "\n6- Internals" + "\n7- FinalMarks" + "\n8- GPA" + "\n9- Hostel" + "\n10 Library" + "\n11- ParentDetails" + "\n12- Print Student details");
				ch = s1.nextInt();
				switch(ch) {
				
				case 1: {	
					System.out.println("enter total no of class");
					int cls = s1.nextInt();
					System.out.println("no of class attended");
					int a= s1.nextInt();
					Attendance d=new Attendance(cls,a);
					break;
						}
				
				case 2: {
					System.out.println("enter course");
					String cou = s1.next();
					System.out.println("credits");
					int a= s1.nextInt();
					Courses c=new Courses(cou,a);
					break;
						}
				
				case 3: {
					p.entermarks();
					break;
						}
				
				case 4: {
					sp.entermarks();
					break;
						}
				
				case 5: {
					es.entermarks();
					break;
						}
				
				case 6: {
					   i.entermarks();
					   break;
						}
				
				case 7:{
					 t.CalculateFinalMarks(p, sp, es, i);
				}
				
				case 8: {
					GPA g1 = new GPA();
					g1.CalculateGPA(t);
					break;
						}
				
				case 9: {
					Hostel h = new Hostel();
					h.addRecords();
					break;
						}
				
				case 10: {
					Library l = new Library();
					l.bookdetails();
					break;
						}
				
				case 11:{
					System.out.println("How many students? :");
					int scount=s.nextInt();
					StudentProfile[] stu2=new StudentProfile[scount];
					for(int j=0;j<scount;j++) {
					stu2[j] = new StudentProfile();
					FileInputStream fi=new FileInputStream("StudentData.ser");
					ObjectInputStream oi =new ObjectInputStream(fi);
					stu2[j]=(StudentProfile)oi.readObject();}
					System.out.println("Details of students are :");
					 for(int j=0;j<scount;j++)
					new PrintDetails();
					t.GetFinalMarks();
					g.GetGPA();
					break;
						}
				
				case 12:{
					pd.read();
					pd.displayData();
						break;
						}
			
				}
				
				break;
				
			}
			
			case 5: {
				System.exit(0);
			}
		}
	}
}
	}