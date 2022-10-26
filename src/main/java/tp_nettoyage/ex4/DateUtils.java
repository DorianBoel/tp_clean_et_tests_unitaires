package tp_nettoyage.ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {
	
	public static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static String format(Date date, String pattern) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
	
	public static String format(Date date) {
		return format(date, DEFAULT_PATTERN);
	}
	
}
