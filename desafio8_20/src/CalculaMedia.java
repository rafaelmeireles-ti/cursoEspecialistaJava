import java.util.Objects;

public class CalculaMedia {

    public Double calcularMedia(Double numerox , Double numeroy , Double... numeros){
        Objects.requireNonNull(numerox, "Informe o numero");
        Objects.requireNonNull(numeroy, "Informe o numero");
        
        Double tamanho = numeros.length + 2.0;
        Double total = 0.0;

        for (Double numero : numeros) {
            total += numero;
        }

        System.out.println("total = " + total);
        
        Double media = (numerox + numeroy + total ) / tamanho;

        return media;

    }

}
