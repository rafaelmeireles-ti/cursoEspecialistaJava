package org.example;

public class NotaFiscal {



    private final Integer numero;
    private final String descricao;
    private final double valor;

    private StatusNota status =  StatusNota.NAO_EMITIDA ;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void emitir() {
        if (status == StatusNota.EMITIDA || status == StatusNota.CANCELADA) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = StatusNota.EMITIDA;
    }

    public void cancelar() {
        if ((status == StatusNota.EMITIDA && getValor() >= 1_000)
                || status == StatusNota.CANCELADA) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = StatusNota.CANCELADA;
    }

    public String getDescricaoCompleta() {
        String descricaoStatus = switch (status) {
            case NAO_EMITIDA -> "Não emitida";
            case EMITIDA-> "Emitida";
            case CANCELADA -> "Cancelada";
            default -> throw new RuntimeException("Status não tratado");
        };

        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), descricaoStatus);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNota getStatus() {
        return status;
    }


}