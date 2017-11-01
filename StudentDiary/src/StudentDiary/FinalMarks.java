package StudentDiary;

public class FinalMarks {
	
	float finalmarks;

	public FinalMarks() {
		finalmarks = 0;
	}
	
	public void CalculateFinalMarks(Firstperiodicals F, Secondperiodicals S, Endsem E, Internals I) {
		finalmarks = (float) ((F.GetMark()*0.6) + (S.GetMark()*0.6) + (E.GetMark()/2) + I.GetMark());
	}
	
	public float GetFinalMarks() {
		return finalmarks;
	}
	
	

}
