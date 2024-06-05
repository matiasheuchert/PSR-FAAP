package ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fecha en el formato 'dd mm aaaa':");
        String fecha = scanner.nextLine();

        String[] partes = fecha.split(" ");
        if (partes.length != 3) {
            System.out.println("Formato de fecha inválido.");
            return;
        }

        String dia = partes[0];
        String mes = partes[1];
        String año = partes[2];

        Map<String, String> meses = new HashMap<>();
        meses.put("01", "enero");
        meses.put("02", "febrero");
        meses.put("03", "marzo");
        meses.put("04", "abril");
        meses.put("05", "mayo");
        meses.put("06", "junio");
        meses.put("07", "julio");
        meses.put("08", "agosto");
        meses.put("09", "septiembre");
        meses.put("10", "octubre");
        meses.put("11", "noviembre");
        meses.put("12", "diciembre");

        String mesTexto = meses.get(mes);

        if (mesTexto == null) {
            System.out.println("Mes inválido.");
            return;
        }

        System.out.println(dia + " de " + mesTexto + " de " + año);
    }
		

}
