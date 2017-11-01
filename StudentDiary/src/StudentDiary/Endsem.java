package StudentDiary;

import java.util.Scanner;

public class Endsem {
	public int mark;

	public Endsem() {
		mark = 0;
	}
	
	public Endsem(int mark) {
		this.mark = mark;
	}
	
	public void entermarks() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sem end marks");
		mark = s.nextInt();
	}
	
	public void printmarks() {
		System.out.println("The mark for end sem is:" + mark + "\n");
	}
	
	public int GetMark() {
		return mark;
	}

}