package model.entities;

import model.entities.enums.CategoryName;

public class Cellphone extends Category {
		
	private Product product;
	
	public Cellphone() {
		super();
	}

	public Cellphone(CategoryName name, Product product) {
		super(name);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public final double totalPrice() {
		double sum = 0.0;
		sum += product.getQuantity() * product.getPrice();
		return sum;
	}
	
	@Override
	public final String getCategory() {
		CategoryName cell = CategoryName.valueOf("Cellphone");
		if (getName() == cell) {
			StringBuilder sb = new StringBuilder();
			sb.append(product.getName() + ", ");
			sb.append("Pre�o: " + String.format("%.2f", product.getPrice()) + ", ");
			sb.append("Quantidade dispon�vel: " + product.getQuantity());
			return sb.toString();
		}
		return null;
	}
	
	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Categoria: " + getName() + "; ");
		sb.append("Produto: " + product.getName() + "; ");
		sb.append("Quantidade: " + product.getQuantity() + "; ");
		sb.append("Pre�o: " + product.getPrice() + " ");
		return sb.toString();
	}

		
}
