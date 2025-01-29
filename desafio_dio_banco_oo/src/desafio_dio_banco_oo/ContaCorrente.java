package desafio_dio_banco_oo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void calcularRendimento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarConta(double valor) {
		// TODO Auto-generated method stub
		
	}
}