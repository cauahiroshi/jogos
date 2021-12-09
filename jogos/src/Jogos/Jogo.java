package Jogos;

public abstract class Jogo {

	private String nome; 
	private String plataforma; 
	private int anoDeLancamento; 
	
	
	public Jogo(String nome, String plataforma, int anoDeLancamento) {
		this.nome = nome; 
		this.plataforma = plataforma; 
		this.anoDeLancamento = anoDeLancamento; 
	}
	
	
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getPlataforma() {
		return plataforma; 
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma; 
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento; 
	}
	
	public void setAnoDeLancamento(int anoDeLancamento){
		this.anoDeLancamento = anoDeLancamento; 
	}
	
}
