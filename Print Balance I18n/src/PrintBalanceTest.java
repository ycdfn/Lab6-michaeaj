import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;

public class PrintBalanceTest {

	@Test
	public void TestGreetingEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String greeting = printbalance.getGreeting(messages);
		Assert.assertEquals(greeting, "Hello World!");
	}

	@Test
	public void TestGreetingGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String greeting = printbalance.getGreeting(messages);
		Assert.assertEquals(greeting, "Hallo, Welt!");
	}

	@Test
	public void TestGreetingFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String greeting = printbalance.getGreeting(messages);
		Assert.assertEquals(greeting, "Bonjour, monde! ");
	}

	@Test
	public void TestNameEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String name = printbalance.getName(messages);
		Assert.assertEquals(name, "What's your name? ");
	}

	@Test
	public void TestNameGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String name = printbalance.getName(messages);
		Assert.assertEquals(name, "Was ist deine name? ");
	}

	@Test
	public void TestNameFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String name = printbalance.getName(messages);
		Assert.assertEquals(name, "Quel est votre nom?");
	}

	@Test
	public void TestPleasantryEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String nice = printbalance.getNiceToMeetYou(messages);
		Assert.assertEquals(nice, "Pleased to meet you, ");
	}

	@Test
	public void TestPleasantryGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String nice = printbalance.getNiceToMeetYou(messages);
		Assert.assertEquals(nice, "Gut zum teffen dir, ");
	}

	@Test
	public void TestPleasantryFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String nice = printbalance.getNiceToMeetYou(messages);
		Assert.assertEquals(nice, "Revi vous rencontrer, ");
	}

	@Test
	public void TestYouOweEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String owe = printbalance.getYouOwe(messages);
		Assert.assertEquals(owe, "You owe ");
	}

	@Test
	public void TestYouOweGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String owe = printbalance.getYouOwe(messages);
		Assert.assertEquals(owe, "Du verdankst ");
	}

	@Test
	public void TestYouOweFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String owe = printbalance.getYouOwe(messages);
		Assert.assertEquals(owe, "Vous devez ");
	}

	@Test
	public void TestAsOfEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String as = printbalance.getAsOf(messages);
		Assert.assertEquals(as, "As of: ");
	}

	@Test
	public void TestAsOfGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String as = printbalance.getAsOf(messages);
		Assert.assertEquals(as, "Von ");
	}

	@Test
	public void TestAsOfFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String as = printbalance.getAsOf(messages);
		Assert.assertEquals(as, "Quant à ");
	}

	@Test
	public void TestFarewellEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		ResourceBundle messages = printbalance.getBundle(locale);
		String later = printbalance.getFarewell(messages);
		Assert.assertEquals(later, "Later!");
	}

	@Test
	public void TestFarewellGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		ResourceBundle messages = printbalance.getBundle(locale);
		String later = printbalance.getFarewell(messages);
		Assert.assertEquals(later, "Tschüss!");
	}

	@Test
	public void TestFarewellFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		ResourceBundle messages = printbalance.getBundle(locale);
		String later = printbalance.getFarewell(messages);
		Assert.assertEquals(later, "Au revoir!");
	}

	@Test
	public void TestDebtEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		String debt = printbalance.getDebt(locale);
		Assert.assertEquals(debt, NumberFormat.getCurrencyInstance(locale)
				.format(9876543.21));
	}

	@Test
	public void TestDebtGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		String debt = printbalance.getDebt(locale);
		Assert.assertEquals(debt, NumberFormat.getCurrencyInstance(locale)
				.format(9876543.21));
	}

	@Test
	public void TestDebtFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		String debt = printbalance.getDebt(locale);
		Assert.assertEquals(debt, NumberFormat.getCurrencyInstance(locale)
				.format(9876543.21));
	}

	@Test
	public void TestDateEnglish() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("English");
		String date = printbalance.getDate(locale);
		Assert.assertEquals(
				date,
				DateFormat.getDateTimeInstance(DateFormat.SHORT,
						DateFormat.SHORT, locale).format(new Date()));
	}

	@Test
	public void TestDateGerman() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("German");
		String date = printbalance.getDate(locale);
		Assert.assertEquals(
				date,
				DateFormat.getDateTimeInstance(DateFormat.SHORT,
						DateFormat.SHORT, locale).format(new Date()));
	}

	@Test
	public void TestDateFrench() {
		PrintBalance printbalance = new PrintBalance();
		Locale locale = printbalance.getLocale("French");
		String date = printbalance.getDate(locale);
		Assert.assertEquals(
				date,
				DateFormat.getDateTimeInstance(DateFormat.SHORT,
						DateFormat.SHORT, locale).format(new Date()));
	}

}
