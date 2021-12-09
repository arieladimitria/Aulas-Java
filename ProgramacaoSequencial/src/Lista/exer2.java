package Lista;

import java.util.Scanner;

public class exer2 {
	
	public static void main(String[] diasnascimento) {
		int total, anos, meses, dias;
		Scanner calculo = new Scanner(System.in);
		System.out.print("Digite a sua idade em dias: ");
		total=calculo.nextInt();
		anos=total/365;
		meses=(total%365)/30;
		dias=total-anos*365-meses*30;
		System.out.printf("Você tem %d anos", anos);
		System.out.printf(" %d meses e",meses);
		System.out.printf(" %d desde que nasceu", dias);
	}

}
