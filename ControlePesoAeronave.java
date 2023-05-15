import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);


    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();

    System.out.print("Quantidade de Passageiros: ");
    int totalPassageiros = entrada.nextInt();

    int pesoTotalPassageiros = 0;

    int passageiroAtual = 1;
    
    while (passageiroAtual <= totalPassageiros) {
       System.out.printf("Peso do passageiro #%d: " , passageiroAtual);
       int pesoPassageiro = entrada.nextInt();

       pesoTotalPassageiros += pesoPassageiro;
       passageiroAtual++;
    }

   System.out.printf("Peso maximo da aeronave : %d kg%n " , pesoMaximo);
   System.out.printf("Peso total dos passageiros : %d kg%n " , pesoTotalPassageiros);
   System.out.printf("Situacao da aeronave : %s%n " , 
                      pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada" );
  }

}