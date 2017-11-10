package StudentDiary;

import java.util.Scanner;

public class Firstperiodicals {
	public int mark;

	public Firstperiodicals() {
		mark = 0;
	}
	
	public Firstperiodicals(int mark) {
		this.mark = mark;
	}
	
	public void entermarks() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first periodical mark");
		mark = s.nextInt();
		s.close();
	}
	
	public void printmarks() {
		System.out.println("The mark for first periodical is:" + mark + "\n");
	}
	
	public int GetMark() {
		return mark;
	}

}
