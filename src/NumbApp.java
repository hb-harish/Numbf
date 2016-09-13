
public class NumbApp {
	
	public static void main( String[] args )
    {
		Numbf num = new Numbf();
		System.out.println(num.sCurr(123.45));
		System.out.println(num.sPercent(0.45));
		System.out.println(num.sDecimal(123.45345345,4));
		System.out.println(num.max(45,67));
		System.out.println(num.min(45,67));
		System.out.println(num.random(45,67));
	
    }

}
