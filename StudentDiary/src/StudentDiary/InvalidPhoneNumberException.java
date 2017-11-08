package StudentDiary;

public class InvalidPhoneNumberException extends Exception {

	public InvalidPhoneNumberException() {
		super("Digits less than 10");
	}

}
