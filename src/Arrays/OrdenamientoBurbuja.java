package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class OrdenamientoBurbuja {
	public static void main(String args[]) {
		String[] productos = { "Kingston Pendrive", "Samsung Galaxy", "Disco duro SSD", "Asus Notebook", "Macbook Air",
				"Chromecast", "Bicicleta", "Pendrive" };

		for (String valores : productos) {
			System.out.println("Valores desordenados: " + valores);
		}
		
		System.out.println("\n");

		int total = productos.length;

		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total; j++) {
				if (productos[i].compareTo(productos[j]) < 0) {
					String aux = productos[i];
					productos[i] = productos[j];
					productos[j] = aux;
				}
			}
		}

		for (String valores : productos)
			System.out.println("Valores ordenados: " + valores);
	}
}
