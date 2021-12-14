package POO;

public class exercicio2 {
	
	// ATRIBUTOS
    String companhiaArea;
    String modelo;
    int passageiros;
    boolean decolando;

    public void voando(){
        decolando=true;
    }
    public void pousado(){
        decolando=false;
    }
    public void decolar(){
        if(decolando==true)
            System.out.println("O avião está decolando.");
        else
            System.out.println("O avião está pousado.");
    }
    public void status(){
        System.out.println("O modelo do avião é: "+this.modelo);
        System.out.println("O avião é da companhia "+this.companhiaArea+" e sua capacidade máxima é "+this.passageiros);
    }

}
