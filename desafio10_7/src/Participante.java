import java.util.Objects;

public class Participante {
    String nome;
    int saldoDePontos;

    Participante(String nome){
        Objects.requireNonNull(nome, "Não pode ser vazio");
        this.nome = nome;
        this.saldoDePontos = 10;
    }

    Participante(String nome, int saldoDePontos ){
        Objects.requireNonNull(nome, "Não pode ser vazio");

        this.nome = nome;

        if (saldoDePontos <= 0) {
            new IllegalArgumentException("NUMERO DE PONTOS NAO PODE SER NEGATIVO");
        }
        this.saldoDePontos = saldoDePontos;



    }
}
