package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float peso;
		
		Scanner s;
		s = new Scanner(System.in);
		
		System.out.println("Ingrese su peso:");
		peso = s.nextFloat();
		
		peso = (peso * 17) / 100;
		
		System.out.println("El peso en la luna es " + peso);
		
		

	}

}
