package entities;

public class IndividualEntity extends Contributor {
	
	private Double healthSpend;
	
	public IndividualEntity() {
		super();
	}
	
	public IndividualEntity(String name, Double annualIncome, Double healthSpend) {
		super(name, annualIncome);
		this.healthSpend = healthSpend;
	}

	public Double getHealthSpend() {
		return healthSpend;
	}

	public void setHealthSpend(Double healthSpend) {
		this.healthSpend = healthSpend;
	}

	@Override
	public double taxCalc() {
		double income = 20000.00;
		if(getAnnualIncome() < income) {
			return (getAnnualIncome() * 0.15) - (this.healthSpend * 0.5);
		} else {
			return (getAnnualIncome() * 0.25) - (this.healthSpend * 0.5);
		}
	}

}
