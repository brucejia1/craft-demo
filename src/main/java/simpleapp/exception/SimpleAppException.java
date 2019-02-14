package simpleapp.exception;

public class SimpleAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1609086353746468740L;
	
	private ErrorCode code;

	public enum ErrorCode {
		SYSTEM, 
		USER_ERROR
	}
	
	public SimpleAppException(String message){
		super(message);
	}
	
	public SimpleAppException(SimpleAppException.ErrorCode code, String message){
		super(message);
		this.code = code;
	}
	
	public ErrorCode getCode() {
		return code;
	}
}
