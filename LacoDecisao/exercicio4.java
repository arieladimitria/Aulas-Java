package LacoDecisao;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main (String args[]) {
		int numero;
		double raizq, ele;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		numero=ler.nextInt();
		
		if(numero%2==0)
		{
			raizq=Math.sqrt(numero);
			System.out.println("Seu n�mero � par e sua raiz quadrada �: ");
			System.out.print(raizq);
		}
		else
		{
			ele=Math.pow(numero, 2);
			System.out.println("Seu n�mero � impar e seu quadrado �: ");
			System.out.println(ele);
		}
			
	}

}
