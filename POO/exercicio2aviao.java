package POO;

import java.util.Scanner;

public class exercicio2aviao {

	public static void main(String[] args) {
        exercicio2 a1 = new exercicio2();{
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a companhia �rea do avi�o: ");
            a1.companhiaArea = ler.next();
            System.out.println("Digite o modelo do avi�o: ");
            a1.modelo = ler.nextLine();
            System.out.println("Digite a capacidade m�xima de passageiros do avi�o: ");
            a1.passageiros = ler.nextInt();
            
            a1.status();
            
            a1.voando();
            
            a1.decolar();
        }
	}
}	
