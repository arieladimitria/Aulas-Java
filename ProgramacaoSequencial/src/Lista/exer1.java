package Lista;

import java.util.Scanner;

public class exer1 {
	
	public static void main(String[] idadeemdias) {
		byte anos, meses, dias;
		int total;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		anos=calc.nextByte();
		System.out.print("Digite quantos meses voc� tem: ");
		meses=calc.nextByte();
		System.out.print("Digite quantos dias voc� tem: ");
		dias=calc.nextByte();
		total=anos*365+meses*30+dias;
		System.out.printf("Voc� tem %d desde que nasceu", total);

	}

}
