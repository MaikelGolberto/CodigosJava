package model.entities;

import model.excption.LoginException;

public class Login {
	
	private String email;
	private String senha;
	
	public Login() {
	}

	public Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	public void checkLogin(String email, String senha) {
		if (email == this.email && senha == this.senha) {
			throw new LoginException("Login efetuado com sucesso!");
		} else {
			throw new LoginException("E-mail ou Senha inválidos!");
		}
		
	}
}
