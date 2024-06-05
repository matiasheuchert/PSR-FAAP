package ejercicio1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = s.nextInt();

        String binario = Integer.toBinaryString(numero);

        System.out.println("El número " + numero + " en binario es: " + binario);

	}

}
