package Arrays;

public class Matrices {

	public static void main(String[] args) {
		int numeros[][] = new int[2][4];

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		numeros[0][3] = 4;

		numeros[1][0] = 11;
		numeros[1][1] = 12;
		numeros[1][2] = 13;
		numeros[1][3] = 14;

		System.out.println("Numero de columnas" + numeros.length);
		System.out.println("Numero de filas: " + numeros[0].length);

		System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
		System.out.println("Utimo elemento " + numeros[numeros.length - 1][numeros[0].length - 1]);

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		numeros[0][3] = 4;

		numeros[1][0] = 11;
		numeros[1][1] = 12;
		numeros[1][2] = 13;
		numeros[1][3] = 14;

		System.out.println("Numero de columnas" + numeros.length);
		System.out.println("Numero de filas: " + numeros[0].length);

		System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
		System.out.println("Utimo elemento " + numeros[numeros.length - 1][numeros[0].length - 1]);

		String[][] nombres = new String[3][2];
		nombres[0][0] = "Pepe0";
		nombres[0][1] = "Pepa0";
		nombres[1][0] = "Pepe1";
		nombres[1][1] = "Pepa1";
		nombres[2][0] = "Pepe2";
		nombres[2][1] = "Pepe2";

		System.out.println("Iterando el for");
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {
				System.out.println(nombres[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("ForEach");
		for (String[] arreglo : nombres) {
			for (String nombre : arreglo) {
				System.out.println(nombre + "\t");
			}
			System.out.println("");
		}

	}

}
