package fr.diginamic.recensement.exceptions;

public class IntegerParseException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public IntegerParseException() {
		super();
	}
	
	public IntegerParseException(String message) {
		super(message);
	}
	
	public IntegerParseException(NumberFormatException exception) {
		this(fromNumberFormatException(exception));
	}
	
	private static String fromNumberFormatException(NumberFormatException exception) {
		if (exception == null) {
			return null;
		}
		String message = exception.getMessage();
		if (message != null && message.contains("For input string: ")) {
			String input = message.replace("For input string: \"", "");
			input = input.substring(0, input.length() - 1);
			return String.format("Impossible de convertir '%s' en nombre entier.", input);
		}
		return message;
	}

}
