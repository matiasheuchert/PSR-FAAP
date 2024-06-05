package ejercicio1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese una hora en el formato hh:mm:ss:");
        String hora = s.nextLine();
        
        System.out.println("Ingrese la cantidad de segundos a añadir:");
        int n = s.nextInt();
        
        String[] partes = hora.split(":");
        if (partes.length != 3) {
            System.out.println("Formato de hora inválido.");
            return;
        }
        
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        
        int totalSegundos = horas * 3600 + minutos * 60 + segundos + n;
        
        int nuevasHoras = (totalSegundos / 3600) % 24;
        int nuevosMinutos = (totalSegundos % 3600) / 60;
        int nuevosSegundos = totalSegundos % 60;
        
        System.out.printf("El tiempo dentro de %d segundos será %02d:%02d:%02d\n", n, nuevasHoras, nuevosMinutos, nuevosSegundos);
    }


}
