package entities;

public class LegalEntity extends Contributor {

	private Integer employeeNumber;
	
	public LegalEntity() {
		super();
	}
	
	public LegalEntity(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double taxCalc() {
		if(this.employeeNumber > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}

}
