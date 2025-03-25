package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String args[]) {
		int[] numeros = new int[5];

		numeros[0] = 12;
		numeros[1] = Integer.valueOf(2);
		numeros[2] = 35;
		numeros[3] = 42;
		numeros[4] = 15;

		for (int numero : numeros) {
			System.out.println("recorrido numeros: " + numero);
		}
		
		Arrays.sort(numeros);
		
		System.out.println("\n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("recorrido numeros: " + numeros[i] + " posicion: " + i);
		}
	}
}
