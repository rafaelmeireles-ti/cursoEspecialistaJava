public class FolhaPagamento {


    Holerite calcularSalario(ContratoTrabalho contrato ,
                             Holerite holerite, Funcionario funcionario){


        holerite.salarioNormal = holerite.quantidadeHorasNormais * contrato.valorHoraNormal;
        holerite.salarioExtra = holerite.quantidadeHorasExtras * contrato.valorHoraExtra;

        if (funcionario.temfilho()){
            holerite.valorAdicional = (holerite.salarioNormal * 0.1) ;
            holerite.valorAdicionalExtra =(holerite.salarioExtra * 0.1) ;
        }

        return holerite;

    }
}
