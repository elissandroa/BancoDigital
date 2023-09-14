package dio.inovationone.entities;

import dio.inovationone.service.IConta;

public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Conta.SEQUENCIAL;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: , %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: , %d", this.getAgencia()));
		System.out.println(String.format("Numero:, %d", this.getNumero()));
		System.out.println(String.format("Saldo: , %.2f", this.saldo));
	}

}
