package LacoDecisao;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String args[]) {
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 n�meros: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3){
			System.out.println("O 1� n�mero � maior.");
		}
		else if(n2>n1 && n2>n3){
			System.out.println("O 2� n�mero � maior.");
		}
		else {
			System.out.println("O 3� n�mero � maior.");
		}
		}
	
	

}
