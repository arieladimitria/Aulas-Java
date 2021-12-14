package POO;

public class exercicio1 {

	//ATRIBUTOS
	
	private String nome;
	private int idade;
	private String sexo;
	private String email;
	private int zap;
	
	public void aniversario()
	{
		idade+=1;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEmai() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getZap() {
		return zap;
	}


	public void setZap(int zap) {
		this.zap = zap;
	}
	
}