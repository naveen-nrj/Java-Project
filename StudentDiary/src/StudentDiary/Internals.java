package StudentDiary;

import java.util.Scanner;

public class Internals {
	public int mark;

	public Internals() {
		mark = 0;
	}
	
	public Internals(int mark) {
		this.mark = mark;
	}
	
	public void entermarks() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the internal marks out of 20");
		mark = s.nextInt();
	}
	
	public void printmarks() {
		System.out.println("The mark for Internals are:" + mark + "\n");
	}
	
	public int GetMark() {
		return mark;
	}

}