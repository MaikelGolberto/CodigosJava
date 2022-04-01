package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Endereco;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da pessoa: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Número: ");
		String numero = sc.nextLine();
		System.out.print("Logradouro: ");
		String logradouro = sc.nextLine();
		System.out.print("Cidade: ");
		String cidade = sc.nextLine();
		System.out.print("Estado: ");
		String estado = sc.nextLine();
		
		Endereco endereco = new Endereco(logradouro, cidade, estado);
		
		Pessoa pessoa = new Pessoa(name, numero, endereco);
		
		System.out.println(pessoa);
		sc.close();
	}

}
