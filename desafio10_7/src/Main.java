public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Participante participante = new Participante("Vanessa");
        Participante participante1 = new Participante("Rafael" , 10);

        System.out.println(participante.nome);
        System.out.println(participante.saldoDePontos);

        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);

    }
}