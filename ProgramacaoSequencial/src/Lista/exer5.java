package Lista;

import java.util.Scanner;

public class exer5 {
	
	public static void main(String[] mediaaluno) {
		float n1, n2, n3, media;
		Scanner calculo = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1=calculo.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2=calculo.nextFloat();
		System.out.print("Digite a terceira nota: ");
		n3=calculo.nextFloat();
		n1*=2;
		n2*=3;
		n3*=5;
		media=(n1+n2+n3)/10;
		System.out.printf("A média do aluno é: %f",media);
	}

}
