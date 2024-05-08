package ejercicio1;

public class Ejercicio5 {

	public static void main(String[] args) {

		int x1 = 1;
		int x2 = 1;
		int i;
		int xn = 0;
		
		System.out.print(x1 + ", " + x2);
		
		for(i=3; i<21; i++) {
			
			xn = x1 + x2;
			System.out.print(", " + xn);
			x1 = x2;
			x2 = xn;
		}
		

	}

}
