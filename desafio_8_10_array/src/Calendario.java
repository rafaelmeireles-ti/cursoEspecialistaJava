public class Calendario {

    static String[] meses = {
            "Janeiro", "Fevereiro" , "Março" , "Abril",
            "Maio" , "Junho", "Julho" , "agosto" , "Setembro",
            "Outubro", "Novembro" , "Dezembro"
    };

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12 ) {
            return null;
        }
        return meses[numeroMes - 1];
    }



}