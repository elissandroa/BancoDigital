package dio.inovationone.entities;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	
	@Override
	public void sacar(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Sacar Poupança - "+ "Agencia: "+ getAgencia() + " Conta: "+getNumero()+" Cliente: "+ getCliente().getNome() +  " - Saldo insuficiente!");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("**************** Conta Corrente ******************");
		imprimirInfosComuns();
	}
}
