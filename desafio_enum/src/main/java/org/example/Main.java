package org.example;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000);
        System.out.println(nf.getStatus());

        nf.emitir();
        System.out.println(nf.getStatus());

        //nf.cancelar(); // IllegalStateException
        System.out.println(nf.getDescricaoCompleta());
    }
}