package LacoDecisao;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main (String args[]) {
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade=ler.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.println("Infantil.");
		}
		else if(idade>=15 && idade<=17){
			System.out.println("Juvenil.");
		}
		else {
			System.out.println("Adulto.");
		}
		}
	
}
