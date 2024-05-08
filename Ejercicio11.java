package ejercicio1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		double costo;
		float exc;
		int duracion;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el tiempo de la llamada:");
		duracion = s.nextInt();
		
		if(duracion>5) {
			
            exc = duracion - 5;
            costo = exc * 0.5;
            costo = costo + 5;
            
            System.out.println("El costo mas excedente es de " + costo);
        }
        else {
            System.out.println("El costo es de 5 pesos");
        }

	}

}
