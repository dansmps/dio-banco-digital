import java.util.List;

public class Banco {
    private List<Conta> contas;



    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
    }

    public List<Conta> geContas(){
        return contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

}
