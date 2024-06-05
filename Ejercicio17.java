package ejercicio1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        double a = s.nextDouble();
        
        System.out.println("Ingrese el valor de b:");
        double b = s.nextDouble();
        
        System.out.println("Ingrese el valor de c:");
        double c = s.nextDouble();

        c = -c;

        double discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("No hay soluciones reales.");

        }
	}
}
