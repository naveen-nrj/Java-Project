package StudentDiary;
import java.text.SimpleDateFormat;
public class PrintDetails extends StudentProfile {

	public PrintDetails() {
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Name:" + super.name + "\n" + "Roll No:" + super.rollno + "\n" + "DOB:" + dateOnly.format(super.DOB) + "\n" + "College:" + super.college + "\n" + "Semsester" + super.semester);
		
	}
}



