package fr.diginamic.recensement.exceptions;

public class UnregisteredCodeException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnregisteredCodeException() {
		super();
	}
	
	public UnregisteredCodeException(String message) {
		super(message);
	}
	
}
