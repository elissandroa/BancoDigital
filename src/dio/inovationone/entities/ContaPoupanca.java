package dio.inovationone.entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void sacar(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Sacar Poupança - "+ "Agencia: "+ getAgencia() + " Conta: "+getNumero()+" Cliente: "+ getCliente().getNome() +  " - Saldo insuficiente!");
		}
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor,Conta contaDestino) {
		sacar(valor);
		depositar(valor);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("**************** Conta Poupança ******************");
		imprimirInfosComuns();
	}

}
