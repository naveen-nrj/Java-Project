package StudentDiary;

public class Courses {
	
	public String coursename;
	public int coursecredit;

	public Courses() {
		coursename = "";
		coursecredit = 0;
	}
	
	public Courses(String name, int c) {
		coursename = name;
		coursecredit = c;
	}
	
	public void print() {
		System.out.println(coursename + coursecredit);
		
	}

}
