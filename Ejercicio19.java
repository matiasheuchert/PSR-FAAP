package ejercicio1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.println("Ingrese una velocidad en Km/h:");
        double velocidadKmH = s.nextDouble();

        double velocidadMS = velocidadKmH * 1000 / 3600;

        System.out.println("La velocidad " + velocidadKmH + " Km/h es igual a " + velocidadMS + " m/s.");

	}

}
