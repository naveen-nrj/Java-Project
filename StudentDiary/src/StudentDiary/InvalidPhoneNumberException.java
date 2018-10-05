package StudentDiary;

public class InvalidPhoneNumberException extends Exception {

	public InvalidPhoneNumberException() {
		super("Invalid Phone Number: Number of Digits is less than 10");
	}

}
