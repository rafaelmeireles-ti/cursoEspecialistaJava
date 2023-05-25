public class Principal {
    public static void main(String[] args) {

        Holerite holerite = new Holerite();
        var folhaPagamento = new FolhaPagamento();
        var contrato = new ContratoTrabalho();
        var funcionario = new Funcionario();

        contrato.funcionario = funcionario;
        holerite.funcionario = funcionario;

        funcionario.Nome = "Rafael";
        funcionario.quantidadeFilhos = 0;

        holerite.quantidadeHorasExtras = 0;
        holerite.quantidadeHorasNormais = 160;

        contrato.valorHoraNormal = 100;
        contrato.valorHoraExtra = 30;

        folhaPagamento.calcularSalario(contrato , holerite, funcionario);

        holerite.calculaBruto();
        holerite.imprimeValores();



    }

}
