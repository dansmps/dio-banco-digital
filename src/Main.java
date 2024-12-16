public class Main {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel Henrique Sampaio");


        Conta cc  = new ContaCorrente(daniel);
        cc.depositar(100);

        Conta poupança = new ContaPoupança(daniel);

        cc.transferir(100, poupança);

        cc.imprimirInfosComuns();
        poupança.imprimirInfosComuns();


    }
}
