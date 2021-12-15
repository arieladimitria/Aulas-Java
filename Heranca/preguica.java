package Heranca;

public class preguica extends animal {

	public void nome(){
		
		System.out.println("Veia");
	}
	
	public void idade(){
		
		System.out.println("7 anos");
	}
	
	public void emitirSom(){
		
		System.out.println("Uaaaaaa");
	}
	
	public void arvore(boolean x){
		
		if(x==true)
			System.out.println("Subindo na árvore.");
		else
			System.out.println("Está dormindo.");
	}
	
}