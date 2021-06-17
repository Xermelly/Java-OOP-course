package model.services;

public class PaypalService implements OnlinePaymentService {
	
	public final static double FEE_PORCENTAGE = 0.02;
	public final static double MONTLY_INTEREST = 0.01;

	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PORCENTAGE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTLY_INTEREST * months;
	}

}
