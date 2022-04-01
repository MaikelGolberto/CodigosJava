package entities;

public class Compra {
	
	private Pessoa pessoa;
	private Produto produto;
	
	public Compra() {
	}

	public Compra(Pessoa pessoa, Produto produto) {
		this.pessoa = pessoa;
		this.produto = produto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void comprar(Pessoa pessoa, Produto produto) {
		this.pessoa = pessoa;
		this.produto = produto;
	}
	
	public String verificarCompra() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Compra finalizada com Sucesso! \n");
		sb1.append("Usuário: " + getPessoa().consultaName() + "\n");
		sb1.append("Produto comprado: " + getProduto().consultaName() + "\n");
		return sb1.toString();
	}
}
