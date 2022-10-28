package fr.diginamic.recensement.exceptions;

public class InvalidLimitsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidLimitsException() {
		super();
	}
	
	public InvalidLimitsException(String message) {
		super(message);
	}
	
}
