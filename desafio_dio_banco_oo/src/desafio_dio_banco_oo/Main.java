package desafio_dio_banco_oo;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente eliene = new Cliente();
		eliene.setNome("Eliene");
		
		Conta cc = new ContaCorrente(eliene);
		Conta poupanca = new ContaPoupanca(eliene);
		
		cc.depositar(100);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
