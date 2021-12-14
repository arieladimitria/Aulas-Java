package LacoRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int n,soma=0;
		do {
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um número: ");
			n=ler.nextInt();
			soma+=n;
		}while(n!=0);
		System.out.println("A soma dos números é: "+soma);
	}

}
