package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta: ");
			System.out.print("Número: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, name, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Entre com o valor para saque: ");
			double amount = sc.nextDouble();
			
			acc.withdraw(amount);
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + String.format("%.2f", acc.getBalance()));	
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
			
		sc.close();
	}

}
