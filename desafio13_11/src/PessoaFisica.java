public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;
    private double receitaAnual;

    public double getReceitaAnual() {
        return receitaAnual;
    }

    public PessoaFisica(String nome , double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = 0;

        if (getReceitaAnual() > RECEITA_ANUAL_ISENCAO) {
            valorImpostos = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }

        return valorImpostos;
    }
}
