package ejercicio1;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int i;
		long pobAct = 7309784505l;
		long crec = 24807909;
		
		System.out.println("La población en el año actual es: " + pobAct);

		for(i=1; i<6; i++) {
			pobAct = pobAct + crec;
			System.out.println("La población en el año " + i + " es " + pobAct);
		}
		
	}

}
