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
            System.out.println("O avi�o est� decolando.");
        else
            System.out.println("O avi�o est� pousado.");
    }
    public void status(){
        System.out.println("O modelo do avi�o �: "+this.modelo);
        System.out.println("O avi�o � da companhia "+this.companhiaArea+" e sua capacidade m�xima � "+this.passageiros);
    }

}
