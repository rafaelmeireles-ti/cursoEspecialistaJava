import java.util.Scanner;

public class CalculoPagamentoTerceiros {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
   
    System.out.println("Digite o seu nome:");   

    String nome = entrada.nextLine();

    System.out.println("Digite o valor por hora:"); 

    Double valorPorHora = entrada.nextDouble();

    System.out.println("Digite a quantidade de horas trabalhadas:");  

    int horasTrabalhadas = entrada.nextInt();

    System.out.println("Digite o valor dos descontos:"); 

    Double valorDescontos = entrada.nextDouble();

    System.out.printf("Nome e %s%n "  , nome); 
    System.out.printf("Valor Bruto:R$ %.2f%n" , (valorPorHora * horasTrabalhadas ));
    System.out.printf("Valor Descontos: R$ %.2f%n" , valorDescontos);
    System.out.printf("Valor Liquido: R$ %.2f%n" , ((valorPorHora * horasTrabalhadas ) - valorDescontos));
    



     

      
   }
    


   

}