package StudentDiary;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			StudentProfile sp = new StudentProfile();
			sp.newStudentProfile();
			ReadStudents s = new ReadStudents();
			s.write();
			Scanner s1 = new Scanner(System.in);
			System.out.println("1- Attendence" + "\n2- Courses" + "\n3- Fines" + "\n4- First periodicals" + "\n5- Second Periodicals" + "\n6- Endsem" + "\n7- Internals" + "\n8- FinalMarks" + "\n9- GPA" + "\n10- Hostel" + "\n11- Library" + "\n12- ParentDetails" + "\n13- Print Student details");
			System.out.println("Enter the category you want to enter");
			switch() {
			case 1: {
				new Attendance();
			}
			case 2: {
				new Courses();
			}
			case 3: {
				new Fines();
			}
			case 4: {
				new Firstperiodicals();
			}
			case 5: {
				new Secondperiodicals();
			}
			case 6: {
				new Endsem();
			}
			case 7: {
				new Internals();
			}
			case 8: {
				new FinalMarks();
			}
			case 9: {
				new GPA();
			}
			case 10: {
				new Hostel();
			}
			case 11: {
				new Library();
			}
			case 12: {
				new ParentDetails();
			}
			case 13: {
				new PrintDetails();
			}
			}
			
	}
}
