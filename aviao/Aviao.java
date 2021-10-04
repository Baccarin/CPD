package aviao;

public class Aviao {

	public String nome;
	public boolean autorizado = false;
	
	
	public Aviao(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAutorizado() {
		return autorizado;
	}


	public void setAutorizado(boolean autorizado) {
		System.out.println(String.format("O avião %s foi autorizado", this.nome));
		this.autorizado = autorizado;
	}


	@Override
	public String toString() {
		return "Aviao [nome=" + nome + ", autorizado=" + autorizado + "]";
	}
	
	

}
