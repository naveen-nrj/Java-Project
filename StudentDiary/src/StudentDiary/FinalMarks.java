package StudentDiary;

public class FinalMarks {
	
	float finalmarks;

	public FinalMarks() {
		finalmarks = 0;
	}
	
	public void CalculateFinalMarks(Firstperiodicals First, Secondperiodicals Second, Endsem End, Internals Intern) {
		finalmarks = (float) ((First.GetMark()*0.6) + (Second.GetMark()*0.6) + (Endsem.GetMark()/2) + Intern.GetMark());
	}
	
	public float GetFinalMarks() {
		return finalmarks;
	}
	
	

}
