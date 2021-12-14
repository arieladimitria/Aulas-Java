package VetoresMatrizes;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int mat[][] = new int[3][3], linha, coluna, soma=0, diagonal;
		Scanner ler = new  Scanner(System.in);
		
		for (linha=0; linha<3; linha++) 
		{
			for (coluna=0; coluna<3; coluna++) 
			{
				System.out.print("Digite um número: ");
				mat[linha][coluna] = ler.nextInt();
				soma=soma+mat[linha][coluna];
			}
		}
		
		for (linha=0; linha<3; linha++) 
		{
			for (coluna=0; coluna<3; coluna++) 
			{
				System.out.print(mat[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		diagonal=(mat[0][0]+mat[1][1]+mat[2][2]);
		
		System.out.println("A soma dos valores da matriz é: " + soma);
		System.out.println("A soma dos valores da diagonal principal é: " + diagonal);
	}
}