package StudentDiary;

import java.util.Scanner;

public class Secondperiodicals {
	public int mark;

	public Secondperiodicals() {
		mark = 0;
	}
	
	public Secondperiodicals(int mark) {
		this.mark = mark;
	}
	
	public void entermarks() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first periodical mark");
		mark = s.nextInt();
	}
	
	public void printmarks() {
		System.out.println("The mark for first periodical is:" + mark + "\n");
	}
	
	public int GetMark() {
		return mark;
	}

}
