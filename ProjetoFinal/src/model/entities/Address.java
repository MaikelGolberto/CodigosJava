package model.entities;

public class Address {
	
	private String avenue;
	private String city;
	private String state;
	
	public Address() {
	}

	public Address(String avenue, String city, String state) {
		this.avenue = avenue;
		this.city = city;
		this.state = state;
	}

	public String getAvenue() {
		return avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
