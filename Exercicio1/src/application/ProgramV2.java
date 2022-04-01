package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Compra;
import entities.Endereco;
import entities.Pessoa;
import entities.Produto;

public class ProgramV2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int P;
		
		Produto produto1 = new Produto(568754456745L, "Playstation 5");
		Produto produto2 = new Produto(555444332221L, "LG TV Oled C1");
		
		System.out.println("Informe os dados para se cadastrar: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Logradouro: ");
		String logradouro = sc.nextLine();
		System.out.print("Número: ");
		String numero = sc.nextLine();
		System.out.print("Cidade: ");
		String cidade = sc.nextLine();
		System.out.print("Estado: ");
		String estado = sc.nextLine();
		
		Endereco endereco = new Endereco(logradouro, cidade, estado);
		Pessoa pessoa = new Pessoa(name, numero, endereco);
		
		System.out.println("\nCadastro finalizado!");
		do {
			System.out.println("\nProdutos disponíveis: ");
			System.out.println("1 - " + produto1.consultaName() + "\n2 - " + produto2.consultaName());
			
			Compra compra = new Compra();
			
			System.out.print("\nEscolha um dos produtos disponíveis: Obs: Use 3 para cancelar e sair do programa! ");
			P = sc.nextInt();
			sc.nextLine();
			
			if (P == 1) {
				compra.comprar(pessoa, produto1);
				System.out.println(compra.verificarCompra());
				break;
			} else if (P == 2) {
				compra.comprar(pessoa, produto2);
				System.out.println("\n" + compra.verificarCompra()); 
				break;
			} else if (P == 3){
				System.out.println("Você optou por sair do programa.\n\nPrograma encerrado!!!");
			} else {
				System.out.println("\nVocê não selecionou nenhum produto, escolha um produto válido ou use a opção para sair!");
			}
		} while (P != 3);	
		sc.close();
	}
}
