public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente){
        super(cliente);
     }

    public void imprimirInfosComuns(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();    
}
}
    
        

