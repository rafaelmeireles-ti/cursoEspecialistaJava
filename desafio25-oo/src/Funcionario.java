public class Funcionario {

    String Nome;
    int quantidadeFilhos;

    boolean temfilho(){
        if (quantidadeFilhos >= 1){
            return true;
        }
        return false;
    }

}


