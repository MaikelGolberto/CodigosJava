package entities;

public class Endereco {
	
	private String logradouro;
	private String cidade;
	private String estado;
	
	public Endereco() {
	}

	public Endereco(String logradouro, String cidade, String estado) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String consultaLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Logradouro: " + consultaLogradouro());
		sb.append("Cidade: " + getCidade());
		sb.append("Estado: " + getEstado());
		return sb.toString();
	}
}
