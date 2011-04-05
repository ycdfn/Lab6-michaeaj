import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 * 
 * @author mohan. Created Mar 27, 2010.
 */
public class PrintBalance {

	public PrintBalance() {

	}

	public Locale getLocale(String lang) {
		if (lang.charAt(0) == 'F' || lang.charAt(0) == 'f')
			return new Locale("fr", "FR");
		else if (lang.charAt(0) == 'D' || lang.charAt(0) == 'G'
				|| lang.charAt(0) == 'd' || lang.charAt(0) == 'g')
			return new Locale("de", "DE");

		return new Locale("en", "US");
	}

	public ResourceBundle getBundle(Locale locale) {
		return ResourceBundle.getBundle("MessagesBundle", locale);
	}

	public String getGreeting(ResourceBundle messages) {
		return messages.getString("greeting");
	}

	public String getName(ResourceBundle messages) {
		return messages.getString("whatisyourname");
	}

	public String getNiceToMeetYou(ResourceBundle messages) {
		return messages.getString("nicetomeetyou");
	}

	public String getAsOf(ResourceBundle messages) {
		return messages.getString("Asof");
	}

	public String getYouOwe(ResourceBundle messages) {
		return messages.getString("Youowe");
	}

	public String getFarewell(ResourceBundle messages) {
		return messages.getString("later");
	}

	public String getDate(Locale locale) {
		return DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, locale).format(new Date());
	}

	public String getDebt(Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(9876543.21);
	}

}
