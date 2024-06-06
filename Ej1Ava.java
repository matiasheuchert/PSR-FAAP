package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1ava {

	public static void main(String[] args) {
		List<String> izquierda = new ArrayList<>();
        izquierda.add("Granjero");
        izquierda.add("Lobo");
        izquierda.add("Gallina");
        izquierda.add("Maiz");
        
        List<String> derecha = new ArrayList<>();
        
        System.out.println("Estado inicial:");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Gallina");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Granjero");
        imprimirEstados(izquierda, derecha);
        
        mover(derecha, izquierda, "Maiz");
        imprimirEstados(izquierda, derecha);
        
        mover(derecha, izquierda, "Gallina");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Lobo");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Granjero");
        imprimirEstados(izquierda, derecha);
        
        mover(derecha, izquierda, "Gallina");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Granjero");
        imprimirEstados(izquierda, derecha);
        
        mover(izquierda, derecha, "Maiz");
        imprimirEstados(izquierda, derecha);
        
    }

    public static void mover(List<String> desde, List<String> hacia, String elemento) {
        System.out.println("Mover: " + elemento);
        desde.remove(elemento);
        hacia.add(elemento);
    }

    public static void imprimirEstados(List<String> izquierda, List<String> derecha) {
        System.out.println("Izquierda: " + izquierda);
        System.out.println("Derecha: " + derecha);
        System.out.println();
    }



}
