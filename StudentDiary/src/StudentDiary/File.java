package StudentDiary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class File extends StudentProfile {
	
	public File() {
	super();
	}
	
	public File(String name, String rollno, Date DOB, String college, int semester) {
		super(name, rollno, DOB, college, semester);
		
	}  
	public static StudentProfile readfile() {
		try {
			FileInputStream f = new FileInputStream("StudentProfile.txt");
			ObjectInputStream o = new ObjectInputStream(f);
			StudentProfile sp = (StudentProfile)o.readObject();
			StudentProfile s = new StudentProfile(sp.getname(), sp.getrollno(), sp.getDOB(), sp.getcollege(), sp.getsemester());
			return s;
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}
		
		catch(ClassNotFoundException cnf) {
			System.out.println("Class not found!");
		}
		return null;
}

public static void writefile(StudentProfile sp) {
	try {
		FileOutputStream f = new FileOutputStream("StudentProfile.txt", true);
		ObjectOutputStream o = new ObjectOutputStream(f);
		StudentProfile s = new StudentProfile(sp.name, sp.rollno, sp.DOB, sp.college, sp.semester);
		o.writeObject(s);			
	}
	
	catch(FileNotFoundException fof) {
		System.out.println("File not found!");
	}

	catch(IOException ioe) {
		System.out.println("File may be corrupt!");
	}
}
}
