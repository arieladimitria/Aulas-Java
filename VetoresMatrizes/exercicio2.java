package VetoresMatrizes;

import java.util.Scanner;

//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.

public class exercicio2 {

	public static void main(String[] args) {
		int dado[] = new int[10], d, maior=0, soma=0, media=0, xvezes=0;
		Scanner ler = new  Scanner(System.in);
		
		for (d=0; d<10; d++) 
		{
			System.out.print("Digite o " + (d+1) + "° número sorteado do dado: ");
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
		
		System.out.println("A média aritmética dos lançamentos é: " + media);
		System.out.println("O maior número lançado é: " + maior + " e ele apareceu " + xvezes + " vezes!");
	}
}