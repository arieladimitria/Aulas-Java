package Lista;

import java.util.Scanner;

public class exer3 {
	
	public static void main(String[] duration) {
		int horas, minut, seg, tem;
		Scanner tempo = new Scanner(System.in);
		System.out.print("Digite o tempo de duração em segundos: ");
		tem=tempo.nextInt();
		horas=tem/3600;
		minut=tem%3600/60;
		seg=tem-horas*3600-minut*60;
		System.out.print(horas+".");
		System.out.print(minut+".");
		System.out.print(seg);
	}

}
