package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static double cotDollar;
	public static double dollarBought;
	public static double realPaid;
	
	public static double converter() {
		return cotDollar * dollarBought;
	}
	
	public static double amountToPaid () {
		realPaid = converter();
		return realPaid += realPaid * IOF;
	}

}
