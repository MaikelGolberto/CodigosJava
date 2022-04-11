package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class ProgramV2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
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
		try {
			acc.withdraw(amount);
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + String.format("%.2f", acc.getBalance()));	
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
			Account acc1 = new Account(number, name, balance, withdrawLimit);
			System.out.println("\nAlgo deu errado, tente novamente:\n");
			System.out.println("Saldo disponível: " + String.format("%.2f", acc1.getBalance()) + " | Limite de saque: " + String.format("%.2f", acc1.getWithdrawLimit()));
			System.out.print("Entre com o valor para saque: ");
			double amount1 = sc.nextDouble();
			acc1.withdraw(amount1);
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + String.format("%.2f", acc1.getBalance()));
		}
			
		sc.close();
	}

}
