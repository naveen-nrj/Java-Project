package StudentDiary;
import java.util.Scanner;

public class Fines {
	int fine;
	String reason;
	public Fines() {
		fine = 0;
		reason = "";
	}
	public Fines(int fine, String remark) {
		this.fine = fine;
		this.reason = remark;
	}
	public void setfine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the due amount");
		fine = sc.nextInt();
		System.out.println("Enter the reason");
		reason = sc.next();
	}
	
	public void printfine() {
		System.out.println("Fine: " + fine + "\n" + "Reason: " + reason + "\n");
	}

}
