import java.text.NumberFormat;
import java.util.Random;

public class Numbf 
{
	public String sCurr(double price)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		String priceString = currency.format(price);
		
		return priceString;
	}
	
	public String sDecimal(double miles, int places)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(places);
		String milesString = number.format(miles);
		return milesString;
	}

	
	public String sPercent(double m)
	{
		NumberFormat percent = NumberFormat.getPercentInstance();
		String mString = percent.format(m);
		
		return mString;
	}

	public int random(int a, int b)
	{
		
		int dienumber;
        Random rnd = new Random();
        
        dienumber = a + rnd.nextInt(b-a+1);
        
        return dienumber;

	}
	
	
	public double max(double a, double b)
	{
		if (a>=b)
			return a;
		else 
			return b;

	}
	public double min(double a, double b)
	{
		if (a<=b)
			return a;
		else 
			return b;
	}
	
}
