package trabalhadores;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Trabalhador[] trabalhadores = new Trabalhador[3]; 
		
		for (int i = 0; i < 3; i++) {
		System.out.println("informe o nome do trabalhador");
		String nome = entrada.nextLine();
		System.out.println("informe o salario do trabalhador");
		BigDecimal salario =  new BigDecimal(entrada.nextLine());
		System.out.println("informe o cargo do trabalhador (MED, TRAD, PA, DEV)");
		String cargoString = entrada.nextLine();
		
		Trabalhador t = new Trabalhador();
		t.setNome(nome);
		t.setSalario(salario);
		t.setCargo(Cargo.valueOf(cargoString));
		trabalhadores[i] = t;
		
		}
		System.out.println("trabalhadores cadastrados");
		
		BigDecimal soma = new BigDecimal("0");
		for(int i = 0; i < trabalhadores.length; i++) {
		System.out.println(trabalhadores[i]);
		Trabalhador trabalhador = trabalhadores[i];
		BigDecimal salario = trabalhador.getSalario();
		soma = soma.add(salario);
		
		
		}
						
		BigDecimal media = soma;
		media = media.divide(new BigDecimal(3));
		
		System.out.println("media salarial dos trabalhadores R$"+ media);
		
		entrada.close();
	}
}