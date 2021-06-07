package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		
		/*Percorrer toda a matriz e atribuir valores nela*/
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		/*Imprimir apenas as diagonais da matriz*/
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		
		
		/* Encontrar algum valor dentro da matriz, nesse caso valor negativo, e fazer a contagem de quantos
		  valores como esse existe dentro da matriz*/
		
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: "+ count);
		
		sc.close();

	}

}
