package desafio_dio_banco_oo;

public class ContaPoupanca extends Conta {
	
	private double rendimento;

    public ContaPoupanca(Cliente cliente, double rendimento) {
        super(cliente, 100, 10); 
        this.rendimento = rendimento;
    }

    public void calcularRendimento() {
        double rendimentoCalculado = saldo * rendimento;
        saldo += rendimentoCalculado;
        System.out.println("Rendimento calculado: " + rendimentoCalculado);
    }

    public void pagarConta(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Conta paga com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pagar a conta.");
        }
    }
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
