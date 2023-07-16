public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;

    private double despesaAnual;

    public PessoaJuridica(String nome, Double faturamentoAnual , Double despesaAnual) {
        super(nome);
        this.despesaAnual = despesaAnual;
        this.faturamentoAnual = faturamentoAnual;
    }

    public double getLucroAnual(){
        double lucroAnual = faturamentoAnual - despesaAnual;
        return lucroAnual;

    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }
}
