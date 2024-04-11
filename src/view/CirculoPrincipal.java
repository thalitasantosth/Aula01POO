package view;

import model.Circulo;

public class CirculoPrincipal {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(0);
		c1.raio = 3;
		
		System.out.println("Perimetro do circulo " + c1.getPerimetro());
		System.out.println("Area do circulo " + c1.getArea());
		
	}

}
