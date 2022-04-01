package entities;

public class Pessoa {
	
	private String name;
	private String numero;
	
	private Endereco endereco;
	
	public Pessoa() {
	}

	public Pessoa(String name, String numero, Endereco endereco) {
		this.name = name;
		this.numero = numero;
		this.endereco = endereco;
	}

	public String consultaName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + consultaName() + "\n");
		sb.append("Número: " + getNumero() + "\n");
		sb.append("Logradouro: " + getEndereco().consultaLogradouro() + "\n");
		sb.append("Cidade: " + getEndereco().getCidade() + "\n");
		sb.append("Estado: " + getEndereco().getEstado() + "\n");
		return sb.toString();
	}
}
