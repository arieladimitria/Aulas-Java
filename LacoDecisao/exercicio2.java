package LacoDecisao;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String args[]) {
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 números: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3)
		{
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
		else if(n1 <= n3 && n3 <= n2)
		{
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}
		else if(n2 <= n1 && n1 <= n3)
		{
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}
		else if (n2 <= n3 && n3 <= n1) 
	    {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
	    }
		else if (n3 <= n1 && n1 <= n2) 
	    {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
	    }
		else
		{
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
	    }
	}
}