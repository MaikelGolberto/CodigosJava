package model.entities;

public class User {
	
	private UserData userData;
	private Address address;
	private Login login;
	
	public User() {
	}

	public User(UserData userData, Address address, Login login) {
		this.userData = userData;
		this.address = address;
		this.login = login;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
}
