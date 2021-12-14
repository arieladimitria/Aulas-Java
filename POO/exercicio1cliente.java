package POO;

public class exercicio1cliente {

	public static void main(String[] args) {
		//CLIENTE 
		exercicio1 c1 = new exercicio1();
		
		c1.setNome("Ariela");
		c1.setIdade(28);
		c1.setSexo("Feminino");
		c1.setEmail("lilala@gmail.com");
		c1.setZap(1199887744);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getIdade());
		System.out.println(c1.getSexo());
		System.out.println(c1.getEmai());
		System.out.println(c1.getZap());	
		
	}

}
