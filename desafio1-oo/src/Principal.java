public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        Cachorro seuCachorro = new Cachorro();

        meuCachorro.idade= 10;
        meuCachorro.nome = "Biruleibo";
        meuCachorro.raca = "Pinscher";
        meuCachorro.sexo = "Macho";

        seuCachorro.idade = 2;
        seuCachorro.nome = "Joaquina";
        seuCachorro.raca = "Pitbull";
        seuCachorro.sexo = "Femea";

        System.out.println("seuCachorro.nome = " + seuCachorro.nome);
        System.out.println("seuCachorro.raca = " + seuCachorro.raca);

        System.out.println("meuCachorro.nome = " + meuCachorro.nome);
        System.out.println("meuCachorro.nome = " + meuCachorro.raca);


    }
}
