package ejercicio1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int numero, invertido = 0, resto, num;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        numero = s.nextInt();
        num = numero;

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        if(num == invertido) {
            System.out.println("El número ingresado es capicúa.");
            }else {
            	System.out.println("El número ingresado NO es capicúa.");
            }
    }

	}
