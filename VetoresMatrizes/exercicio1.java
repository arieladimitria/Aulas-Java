package VetoresMatrizes;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		int maior=0,x;
		Scanner ler = new Scanner(System.in);
		for(x=0;x<5;x++)
		{
			System.out.print("Digite a nota: ");
			vetor[x]=ler.nextInt();
			if(vetor[x]>maior)
				maior=vetor[x];
		}
		System.out.println("A maior nota foi "+maior);

	}

}