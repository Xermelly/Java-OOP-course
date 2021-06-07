package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Line number: ");
		int line = sc.nextInt();
		System.out.print("Column number: ");
		int col = sc.nextInt();
		int[][] mat = new int[line][col];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nNumber to find: ");
		int find = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == find) {
					System.out.printf("\nPosition %d,%d%n", i, j);
					if(j > 0)
						System.out.println("Left: " + mat[i][j-1]);
					if(j < mat.length-1)
						System.out.println("Right: " + mat[i][j+1]);
					if((i > 0)) 
						System.out.println("Up: " + mat[i-1][j]);
					if(i < mat.length-1)
						System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		
		
		
		
		sc.close();
	}

}
