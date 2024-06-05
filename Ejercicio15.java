package ejercicio1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor a cero que representa segundos:");
        int n = scanner.nextInt();

        int horas = n / 3600;
        int minutos = (n % 3600) / 60;
        int segundos = n % 60;

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		
	}

}
