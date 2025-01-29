package desafio_dio_banco_oo;

public class ContaCartaoCredito extends Conta {

	private double limiteCredito;

    public ContaCartaoCredito(Cliente cliente, double limiteCredito) {
        super(cliente);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void aumentarLimite(double valor) {
        this.limiteCredito += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limiteCredito)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo e limite de crédito insuficientes.");
        }
    }

    private double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public void transferir(double valor, Conta contaDestino) {

        if (valor <= (getSaldo() + limiteCredito)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo ou limite insuficiente para a transferência.");
        }
    }

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
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
