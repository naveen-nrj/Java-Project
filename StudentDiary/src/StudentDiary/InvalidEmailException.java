package StudentDiary;

public class InvalidEmailException extends Exception{

	public InvalidEmailException() {
		super("Enter a valid Email ID");
	}

}
