package model;

public class Circulo {
	
	public double raio;
	
	public Circulo (double raio) {
		raio = 0.00;
		
	}
	
	public double getPerimetro() {
		double perimetroC = 2 * 3.14 * raio;
		return perimetroC;
		
	}
	
	public double getArea() {
		double areaC = (raio * raio) * 3.14;
		return areaC;
	}

}
