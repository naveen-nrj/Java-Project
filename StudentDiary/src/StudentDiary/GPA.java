package StudentDiary;

public class GPA {
	
	float gpa;

	public GPA() {
		gpa = 0;
	}
	
	public void CalculateGPA(FinalMarks F) {
		gpa = F.GetFinalMarks()/10;
	}
	
	public float GetGPA() {
		return gpa;
	}

}
