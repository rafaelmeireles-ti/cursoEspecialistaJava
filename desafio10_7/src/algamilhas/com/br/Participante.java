package algamilhas.com.br;

import java.util.Objects;

public class Participante {
    public String nome;
    public int saldoDePontos;

    public Participante(String nome){
        this(nome , 10);
    }

    private Participante(String nome, int saldoDePontos ){
        Objects.requireNonNull(nome, "Não pode ser vazio");

        this.nome = nome;

        if (saldoDePontos <= 0) {
            new IllegalArgumentException("NUMERO DE PONTOS NAO PODE SER NEGATIVO");
        }
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos (int pontos){
        saldoDePontos += pontos;
    }
}
