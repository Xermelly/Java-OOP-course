package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double quota = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double upQuota = quota + onlinePaymentService.interest(quota, i);
			double fullQuota = upQuota + onlinePaymentService.paymentFee(upQuota);
			contract.addInstallments(new Installments(date, fullQuota));
		}
		
	}
	
	public Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
