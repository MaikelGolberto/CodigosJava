package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Category;
import model.entities.Cellphone;
import model.entities.Product;
import model.entities.Tv;
import model.entities.enums.CategoryName;
import model.entities.Consoles;

public class Program {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Category> list = new ArrayList<>();
		
		System.out.println("--------------- In�cio da parte de adicionar produtos! --------------\n");
		
		System.out.print("Quantos produtos deseja adicionar ao sistema? ");
		int qtdProd = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe os dados do produto a serem adicionados ao sistema:\n");
		System.out.println("------ Categorias Dispon�veis ------");
		System.out.println("1 - Cellphone | 2 - Televis�o | 3 - Video Games\n");
		for(int i = 1; i <= qtdProd; i++) {	
			System.out.print("Para qual categoria deseja adicionar o " + i + "� produto? ");
			int opcao = sc.nextInt();
			sc.nextLine();
			System.out.print("Produto: ");
			String product = sc.nextLine();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			System.out.print("Pre�o: ");
			double price = sc.nextDouble();
			System.out.println();
			Product prod = new Product(product, price, quantity);
			if (opcao == 1) {
				CategoryName name = CategoryName.valueOf("Cellphone");
				list.add(new Cellphone(name, prod));
			} else if (opcao == 2) {
				CategoryName name = CategoryName.valueOf("Tv");
				list.add(new Tv(name, prod));
			} else if (opcao == 3) {
				CategoryName name = CategoryName.valueOf("Consoles");
				list.add(new Consoles(name, prod));
			} else {
				System.out.println("Categoria indispon�vel!");
				i--;
			}
		} 
		System.out.println();
		/*
		double sum = 0.0;
		for (Category cat : list) {
			System.out.println(cat);
			
		}
		*/
		
		CategoryName name = CategoryName.valueOf("Cellphone");
		System.out.println("----- Cellphone -----");
		System.out.println("----- Produtos Dispon�veis -----");
		for (Category cat : list) {
			if (cat.getName() == name) {
				System.out.println(cat.getCategory());
			}
			
		}
		
		//System.out.println("Pre�o total: " + String.format("%.2f", sum));
		System.out.println("\n--------------- Fim da parte de adicionar produtos! ---------------\n\n ");
		System.out.println("--------------- In�cio da parte do Us�ario ---------------\n");
		
		System.out.println("\n--------------- Fim do Programa ---------------");
		
		sc.close();
	}
}