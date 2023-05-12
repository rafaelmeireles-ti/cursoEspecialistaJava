import java.util.Scanner;

public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = 0;
    
    switch(quantidadeParcelas){
      case 1 : taxaJuros = 1.99;
      case 2 : taxaJuros = 1.99;
      break;
      default:  taxaJuros = 3.99;
    }

    double tarifaFixa = 0;
    tarifaFixa =  valorEmprestimo > 100 ? tarifaFixa + 1.50 : tarifaFixa + 0 ;
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }

}