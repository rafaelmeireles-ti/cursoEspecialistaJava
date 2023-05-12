import java.util.Scanner;

public class CalculadoraImpostos {

  public static void main(String[] args) {
    char tipoNotaFiscal = 'S';  
    double totalFaturado = 1200.30;


    double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
    
    System.out.printf("Total Faturado : R$ " );
    System.out.print(valorImpostos);

  }

}