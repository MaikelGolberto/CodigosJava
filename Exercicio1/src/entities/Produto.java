package entities;

public class Produto {
	
	private Long codigo;
	private String name;
	
	public Produto() {
	}

	public Produto(Long codigo, String name) {
		this.codigo = codigo;
		this.name = name;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String consultaName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
