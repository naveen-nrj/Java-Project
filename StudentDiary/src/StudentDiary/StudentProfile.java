package StudentDiary;
import java.util.*;
public class StudentProfile {
	public String name;
	public String rollno;
	public Date DOB;
	public String college;
	public int semester;
	
	public StudentProfile() {
		name = "";
		rollno = "";
		college = "";
		semester = 1;
		Calendar C = Calendar.getInstance();
		C.set(2017, 1, 1);
		DOB = C.getTime();
	}
	public StudentProfile(String name, String rollno, Date DOB, String college, int semester) {
		this.name = name;
		this.rollno = rollno;
		this.DOB = DOB;
		this.college = college;
		this.semester = semester;
	}
	public String getname() {
		return name;
	}
	public String getrollno() {
		return rollno;
	}
	public Date getDOB() {
		return DOB;
	}
	public String getcollege() {
		return college;
	}
	public int getsemester() {
		return semester;
	}
	public void newStudentProfile() {
		System.out.println("Enter the Name");
		Scanner s = new Scanner(System.in);
		this.name = s.next();
		System.out.println("Enter roll no");
		this.rollno = s.next();
		System.out.println("Enter the name of the college");
		this.college = s.next();
		System.out.println("Enter date of birth in day , month , year format");
		int day, month, year;
		day = s.nextInt();
		month = s.nextInt();
		year = s.nextInt();
		Calendar C = Calendar.getInstance();
		C.set(year, month-1, day);
		this.DOB = C.getTime();
		System.out.println("Enter the semester");
		this.semester = s.nextInt();
	}
	
}

