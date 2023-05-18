public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        meuCarro.fabricante = "teste";

        seuCarro.anoFabricacao = 2022;
        seuCarro.fabricante = "bmw";
        seuCarro.modelo= "x6";


        meuCarro.anoFabricacao = 2022;
        meuCarro.fabricante = "bmw";
        meuCarro.modelo= "x6";

    }
}
