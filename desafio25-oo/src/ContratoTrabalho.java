public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean temAdicional(){
        if (funcionario.temfilho()){
            return true;
        }
        return false;
    }
}
