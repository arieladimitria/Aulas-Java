package LacoRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int x, n,pares=0,impares=0;
		for(x=0;x<10;x++){
			
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um n�mero inteiro: ");
			n=ler.nextInt();
			if(n%2==0)
				pares++;
			else
				impares++;
		}
		System.out.println("Voc� digitou "+pares+" n�meros pares e "+impares+" n�meros �mpares!");
	}

}