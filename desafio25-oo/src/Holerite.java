public class Holerite {

    public double valorAdicional;
    public double valorAdicionalExtra;
    double quantidadeHorasNormais ;
    double quantidadeHorasExtras;
    Funcionario funcionario;
    double salarioNormal;
    double salarioExtra;

    double valorBruto;

    double calculaBruto(){
        valorBruto = salarioNormal + salarioExtra + valorAdicional + valorAdicionalExtra;
        return valorBruto;
    }

    void imprimeValores (){
        System.out.println("funcionario.Nome = " + funcionario.Nome);
        System.out.println("valorBruto = " + valorBruto);
        System.out.println("valorAdicional = " + valorAdicional);
        System.out.println("valorAdicionalExtra = " + valorAdicionalExtra);
        System.out.println("quantidadeHorasNormais = " + quantidadeHorasNormais);
        System.out.println("quantidadeHorasExtras = " + quantidadeHorasExtras);
        System.out.println("salarioNormal = " + salarioNormal);
        System.out.println("salarioExtra = " + salarioExtra);


    }

}


