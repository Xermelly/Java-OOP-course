package entities;

public class Student {
	
	public String name;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double media() {
		return notaA + notaB + notaC;
	}
	
	public double missingPoints() {
		if(media() < 60) {
			return 60 - media();
		} else {
			return 0.0;
		}
	}

}
