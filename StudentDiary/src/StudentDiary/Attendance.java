package StudentDiary;

public class Attendance {
	public int total;
	public int attended;
	public float percentage;

	public Attendance() {
		total = 0;
		attended = 0;
	}
	
	public Attendance(int total, int attended) {
		this.total = total;
		this.attended = attended;
	}
	
	public void calcattendance() {
		percentage = (attended/total)*100;
	}
	
	public float getattendancepercentage() {
		return percentage;
	}
	
	public int getattended() {
		return attended;
	}
	
	public int gettotal() {
		return total;
	}

}
