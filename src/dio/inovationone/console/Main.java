package dio.inovationone.console;

import dio.inovationone.entities.Banco;
import dio.inovationone.entities.Cliente;
import dio.inovationone.entities.ContaCorrente;
import dio.inovationone.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao nosso Banco");
		
		Banco digitalBank = new Banco("DigitalBank");
		
		System.out.println(digitalBank.getNome());
		
		ContaCorrente cc1 = new ContaCorrente(new Cliente("João Medeiros"));
		cc1.depositar(250);
		cc1.depositar(380);
		cc1.sacar(45);
		cc1.imprimirExtrato();
		
		ContaPoupanca cp1 = new ContaPoupanca(new Cliente("João Medeiros"));
		cp1.depositar(400);
		cp1.sacar(500);
		cp1.imprimirExtrato();
		
		
		

	}

}
