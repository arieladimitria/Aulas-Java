package Heranca;

public class gato extends animal {

	public void nome()
	{
		System.out.println("Neko");
	}
	
	public void idade(){
		
		System.out.println("9 anos");
	}
	
	public void emitirSom(){
		
		System.out.println("Rom Rom");
	}
	
	public void correr(boolean x){
		
		if(x==true)
			System.out.println("Correndo!");
		else
			System.out.println("Dormindo no teclado.");
	}
	
}