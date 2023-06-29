package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import Entities.Pessoa;

public class ControllerPessoa {

	Scanner sc = new Scanner(System.in);
	Pessoa pessoa = new Pessoa();
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void lerDados() {

		for (int i = 0; i < 3; i++) {

			System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
			double altura = sc.nextDouble();
			pessoa.setAltura(altura);

			System.out.print("Digite o sexo (M/F) da pessoa " + (i + 1) + ": ");
			char sexo = sc.next().charAt(0);
			pessoa.setSexo(sexo);

			pessoas.add(pessoa);

			pessoa = new Pessoa();
		}

		sc.close();
	}

	public void calcular() {

		double maiorAltura = pessoas.get(0).getAltura();
		double menorAltura = pessoas.get(0).getAltura();
		double somaAlturasHomens = 0;
		double mediaAlturaHomens = 0;
		int numMulheres = 0;
		int numHomens = 0;

		for (int i = 0; i < pessoas.size(); i++) {

			Pessoa pessoa2;

			pessoa2 = pessoas.get(i);

			if (pessoa2.getAltura() > maiorAltura) {
				maiorAltura = pessoa2.getAltura();
			}

			if (pessoa2.getAltura() < menorAltura) {
				menorAltura = pessoa2.getAltura();
			}

			if (pessoa2.getSexo() == 'M') {
				somaAlturasHomens += pessoa2.getAltura();
				numHomens++;
				mediaAlturaHomens = somaAlturasHomens / numHomens;

			} else if (pessoa2.getSexo() == 'F') {
				numMulheres++;
			}

		}

		System.out.println();
		System.out.println("Maior altura: " + maiorAltura);
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Média de altura dos homens: " + String.format("%.2f", mediaAlturaHomens) );
		System.out.println("Número de mulheres: " + numMulheres);
	}

}
