package Heranca;

public class cachorro extends animal {

	public void nome(){
		
		System.out.println("Saburo");
	}
	
	public void idade(){
		
		System.out.println("5 anos");
	}
	
	public void emitirSom(){
		
		System.out.println("Au au au");
	}
	
	public void correr(boolean x){
		
		if(x==true)
			System.out.println("Corre, menino!");
		else
			System.out.println("Senta!");
	}
	
}