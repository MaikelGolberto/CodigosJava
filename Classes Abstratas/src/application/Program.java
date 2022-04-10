package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Informe a quantidade de contribuintes: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'f') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Número de Funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for (Pessoa pess : list) {
			System.out.println(pess.getName() + ": $ " + String.format("%.2f", pess.imposto()));
		}
		
		double totalTaxas = 0.0;
		for (Pessoa pess : list) {
			totalTaxas += pess.imposto();
		}
		
		System.out.println();
		System.out.println("IMPOSTOS TOTAIS: " + String.format("%.2f", totalTaxas));
		
		sc.close();

	}

}
