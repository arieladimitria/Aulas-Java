package VetoresMatrizes;

import java.util.Scanner;

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class exercicio2 {

	public static void main(String[] args) {
		int dado[] = new int[10], d, maior=0, soma=0, media=0, xvezes=0;
		Scanner ler = new  Scanner(System.in);
		
		for (d=0; d<10; d++) 
		{
			System.out.print("Digite o " + (d+1) + "� n�mero sorteado do dado: ");
			dado[d] = ler.nextInt();
			soma = soma + dado[d];
			if (dado[d] > maior) 
			{
				maior = dado[d];
			}
		}
		
		for (d=0; d<10; d++) 
		{
			if (dado[d] == maior) 
			{
				xvezes++;
			}
		}
		
		for (d=0; d<10; d++) 
		{
			System.out.println(dado[d] + "\t");
		}
		media=soma/d;
		
		System.out.println("A m�dia aritm�tica dos lan�amentos �: " + media);
		System.out.println("O maior n�mero lan�ado �: " + maior + " e ele apareceu " + xvezes + " vezes!");
	}
}