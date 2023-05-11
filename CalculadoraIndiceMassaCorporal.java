import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {

  public static void main(String [] args) {
   
   Scanner entrada = new Scanner(System.in);

   System.out.print("Peso:" );
   int peso = entrada.nextInt();

   
   System.out.print("Altura:" );
   double altura = entrada.nextDouble();

   double imc = peso/(altura* altura);
   
   boolean abaixoPesoIdeal = imc < 18.5;

   if (abaixoPesoIdeal) {
      System.out.printf("Esta abaixo do peso seu imc" );
   }
   
   if (imc >= 25 && imc < 30) {
      System.out.printf("Estano peso ideal" );
   }

   if (imc >= 30 && imc < 35) {
      System.out.printf("Obesidade grau I." );
   }

   if (imc >= 35 && imc < 40) {
      System.out.printf("Obesidade grau II." );
   }

   if (imc > 40) {
      System.out.printf("Obesidade grau III." );
   }

  System.out.println("Fim do programa");

 }


}