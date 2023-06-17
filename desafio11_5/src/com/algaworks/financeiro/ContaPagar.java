package com.algaworks.financeiro;

import jdk.jshell.spi.ExecutionControl;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void pagar(){
        if (isPago()){
            throw new RuntimeException("Conta ja foi paga");
        }else {
            setPago(true);
        }

    }

    public void cancelarPagamento(){
        if (isPago()) {
            setPago(false);
        } else {
            throw new RuntimeException("Conta já está pendente de pagamento");
        }


    }
}
