package ejercicio1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de diferentes artículos vendidos:");
        int variedadArticulos = s.nextInt();
        s.nextLine(); 

        int[] nroArticulo = new int[variedadArticulos];
        int[] cantidad = new int[variedadArticulos];
        double[] precioUnitario = new double[variedadArticulos];

        for (int i = 0; i < variedadArticulos; i++) {
            System.out.println("Ingrese el número del artículo " + (i + 1) + ":");
            nroArticulo[i] = s.nextInt();
            System.out.println("Ingrese la cantidad del artículo " + (i + 1) + ":");
            cantidad[i] = s.nextInt();
            System.out.println("Ingrese el precio unitario del artículo " + (i + 1) + ":");
            precioUnitario[i] = s.nextDouble();
        }

        double totalAPagar = 0.0;
        System.out.println("\nFactura:");
        System.out.println("Nro de artículo\tCantidad\tPrecio Unitario\tSubtotal");

        for (int i = 0; i < variedadArticulos; i++) {
            double subtotal = cantidad[i] * precioUnitario[i];
            totalAPagar += subtotal;
            System.out.println(nroArticulo[i] + "\t\t" + cantidad[i] + "\t\t" + precioUnitario[i] + "\t\t" + subtotal);
        }

        System.out.println("\nTotal a pagar: " + totalAPagar);

	}

}
