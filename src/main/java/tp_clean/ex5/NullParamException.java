package tp_clean.ex5;

/**
 * Exception thrown when a function receives
 * {@code null} as an argument when such an argument
 * is illegal.
 *
 * @author DorianBoel
 */
public class NullParamException extends Exception {

	/**
	 * Serial id.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for {@link NullParamException}.
	 *
	 * Creates a new exception with null as its detail message.
	 */
	public NullParamException() {
		super();
	}
	
	/**
	 * Constructor for {@link NullParamException}.
	 *
	 * Creates a new exception with the specified detail message.
	 */
	public NullParamException(String message) {
		super(message);
	}

}
