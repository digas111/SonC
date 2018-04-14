package sonc.shared;

public class SoncException extends java.lang.Exception {
	private java.lang.String message;
	private java.lang.Throwable cause;
	private boolean enableSuppression;
	private boolean writableStackTrace;
	
	public SoncException() {}
	
	public SoncException(java.lang.String message,
						java.lang.Throwable cause,
						boolean enableSuppression,
						boolean writableStackTrace) {
	this.message = message;
	this.cause = cause;
	this.enableSuppression = enableSuppression;
	this.writableStackTrace = writableStackTrace;
	}
	
	public SoncException(java.lang.String message,
						java.lang.Throwable cause) {
		this.message = message;
		this.cause = cause;
	}
	
	public SoncException(java.lang.String message) {
		this.message = message;
	}
	
	public SoncException(java.lang.Throwable cause) {
		this.cause = cause;
	}
}