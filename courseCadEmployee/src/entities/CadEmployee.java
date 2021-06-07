package entities;

public class CadEmployee {
	private Integer id;
	private String name;
	private Double salary;
	
	public CadEmployee() {
	}
	
	public CadEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void salaryBonus(double percentage) {
		this.salary += this.salary * percentage / 100;
	}

	@Override
	public String toString() {
		return getId()
				+", "
				+getName()
				+", "
				+String.format("%.2f", getSalary());
	}
	
}
