package ejercicio1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int anio;
		int esBisiesto = 5;
		Scanner s;
		
		s = new Scanner(System.in);
		
		System.out.println(10%2);
		System.out.println("Ingrese un año:");
		anio = s.nextInt();
		
		if(anio % 4 == 0 || (anio % 100 != 0 && anio % 400 == 0)) {
			esBisiesto = 1;
		}else {
			esBisiesto = 0;
		}
		
		if(esBisiesto == 1) {
			System.out.println("El año ingresado es bisiesto.");
		}else if(esBisiesto == 0){
			System.out.println("Eñ año ingresado NO es bisiesto.");
		}else {
			System.out.println("Eñ año ingresado no es válido.");
		}
	}

}
