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
		
		
	}

}
