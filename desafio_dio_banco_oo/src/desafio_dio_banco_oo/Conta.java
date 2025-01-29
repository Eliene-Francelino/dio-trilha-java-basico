package desafio_dio_banco_oo;


public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIA = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double saldoMinimo;
    protected double taxaManutencao;

    public Conta(Cliente cliente, double saldoMinimo, double taxaManutencao) {
        this.saldoMinimo = saldoMinimo;
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarTaxa() {
        saldo -= taxaManutencao;
    }

    public void verificarSaldoMinimo() {
        if (saldo < saldoMinimo) {
            System.out.println("Saldo abaixo do mínimo!");
        }
    }
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIA++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
	    if (valor <= 0) {
	        System.out.println("O valor da transferência deve ser positivo.");
	        return; 
	    }

	    if (valor > saldo) {
	        System.out.println("Saldo insuficiente.");
	        return; 
	    }

	    this.sacar(valor); 
	    contaDestino.depositar(valor);
	    System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
