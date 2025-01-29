package desafio_dio_banco_oo;

public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void calcularRendimento();

    void pagarConta(double valor);

    void imprimirExtrato();
}
	