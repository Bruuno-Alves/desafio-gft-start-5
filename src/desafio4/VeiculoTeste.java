package desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeiculoTeste {

	public static void main(String[] args) {

		int totalGasolina = 0;
		int totalDiesel = 0;
		
		List<Veiculo> veiculos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		//Leitura de cada carro informado pelo usuário
		for(int i = 0; i < 5; i++) {
			String marca = "";
			String modelo = "";
			String combustivel = "";
			
			System.out.print("Marca do veículo: ");
			marca = scan.nextLine();
			
			System.out.print("Modelo do veículo: ");
			modelo = scan.nextLine();
			
			//Validação do combustível informado
			do {
				System.out.print("Gasolina ou Diesel [Informe G / D]: ");
				combustivel = scan.nextLine();
			} while (!combustivel.equalsIgnoreCase("G") && !combustivel.equalsIgnoreCase("D"));
			
			//Conversão do valor informado pelo usuário para melhor visualização do toString()
			if (combustivel.equalsIgnoreCase("G")) {
				combustivel = "gasolina";
			} else if (combustivel.equalsIgnoreCase("D")) {
				combustivel = "diesel";
			}
			
			//Instância a partir dos dados fornecidos pelo usuário
			veiculos.add(new Veiculo(marca, modelo, combustivel));
			
			System.out.println("-------------------------------------------");
		}
		
		//Impressão dos veiculos e contagem dos combustiveis
		for(int i = 0; i < 5; i++) {
			System.out.println(veiculos.get(i));
			if (veiculos.get(i).getCombustivel().equalsIgnoreCase("gasolina")) {
				totalGasolina++;
			} else if (veiculos.get(i).getCombustivel().equalsIgnoreCase("diesel")) {
				totalDiesel++;
			}
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Total de carros movido a Gasolina: " + totalGasolina);
		System.out.println("Total de carros movido a Diesel: " + totalDiesel);
		
		scan.close();
	}

}
