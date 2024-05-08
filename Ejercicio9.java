package ejercicio1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int i;
		int num;
		int res = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		
		num = s.nextInt();
		
		for(i=1; i<num+1; i++) {
			
			res = res * i;
		}
		
		System.out.println("Factorial: " + res);
		

	}

}
