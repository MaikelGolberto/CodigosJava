package model.entities;

public class Purchase {
	
	private UserData user;
	private Product product;
	
	public Purchase() {
	}

	public Purchase(UserData user, Product product) {
		this.user = user;
		this.product = product;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void purchase(UserData user, Product product) {
		this.user = user;
		this.product = product;
	}
	
	public String checkPurchase() {
		StringBuilder sb = new StringBuilder();
		sb.append("Compra finalizada com sucesso!\n");
		sb.append("Usuário: " + user.getName() + "\n");
		sb.append("Produto comprado: " + product.getName());
		return sb.toString();
	}
}
