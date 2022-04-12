package model.entities;

import model.entities.enums.CategoryName;

public abstract class Category {
	
	private CategoryName name;
	
	public Category() {
	}

	public Category(CategoryName name) {
		super();
		this.name = name;
	}

	public CategoryName getName() {
		return name;
	}

	public void setName(CategoryName name) {
		this.name = name;
	}
	
	public abstract String getCategory();
	
	public abstract double totalPrice();
	
	public  abstract String toString();
}
