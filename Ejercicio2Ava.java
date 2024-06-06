package ejercicio1;

public class Ejercicio2Ava {

	public static void main(String[] args) {
		String[] mujeres = {"Clara", "Luisa", "María", "Nélida"};
        String[] trabajos = {"Directora de Orquesta", "Diseñadora de Moda", "Jardinera", "Florista"};

        // Clara no puede ser ni la jardinera ni la florista
        // Luisa no puede ser ni la florista ni la directora de orquesta
        // María no puede ser la directora de orquesta
        // Nélida no puede ser ni la jardinera ni la diseñadora de moda
        
        // Clara es la directora de orquesta
        String trabajoClara = trabajos[0];

        // Luisa es la diseñadora de moda
        String trabajoLuisa = trabajos[1];

        // María es la jardinera
        String trabajoMaria = trabajos[2];

        // Nélida es la florista
        String trabajoNelida = trabajos[3];

        System.out.println("Clara es: " + trabajoClara);
        System.out.println("Luisa es: " + trabajoLuisa);
        System.out.println("María es: " + trabajoMaria);
        System.out.println("Nélida es: " + trabajoNelida);

	}

}
