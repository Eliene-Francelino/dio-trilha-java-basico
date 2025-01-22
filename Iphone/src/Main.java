public class Main {
    
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine");

        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
    }
}