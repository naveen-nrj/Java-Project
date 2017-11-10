package StudentDiary;
import java.text.SimpleDateFormat;
public class PrintDetails extends StudentProfile {

	public PrintDetails() {
		super.newStudentProfile();
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Name:" + getname() + "\n" + "Roll No:" + getrollno() + "\n" + "DOB:" + dateOnly.format(DOB) + "\n" + "College:" + college + "\n" + "Semsester" + semester);
		
	}
}