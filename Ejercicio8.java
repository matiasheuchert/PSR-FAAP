package ejercicio1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		float pi = 3.14159f;
		float circ;
		int radio;
		float diam;
		float area;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el radio: ");
		radio = s.nextInt();
		
		diam = radio * 2;
		circ = (pi * radio) * 2;
		area = pi * (radio * radio);
		
		System.out.println("El diametro es " + diam + ", la circunferencia es " + circ + ", y el área es " + area);

	}

}
