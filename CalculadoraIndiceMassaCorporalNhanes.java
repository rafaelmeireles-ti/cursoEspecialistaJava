import java.util.Scanner;

public class CalculadoraIndiceMassaCorporalNhanes {

  public static void main(String [] args) {
   
   Scanner entrada = new Scanner(System.in);

   System.out.print("Masculino ou Feminino ?(1 OU 3):" );
   int sexo = entrada.nextInt();
   
   System.out.print("Peso:" );
   double peso = entrada.nextDouble();

   
   System.out.print("Altura:" );
   double altura = entrada.nextDouble();

   double imc = peso/(altura* altura);
   
   if ((imc < 19.1) && (sexo == 3)) {
      System.out.printf("Esta abaixo do peso seu imc Mulher" );
   }
   else if ((imc < 25.9) && (sexo == 3)) {
      System.out.printf("Esta no peso ideal Mulher" );
   }
   else if ((imc < 32.4) && (sexo == 3)) {
      System.out.printf("Acima do do peso Mulher" );
   }
   else if ((imc < 27.4) && (sexo == 3)) {
      System.out.printf("Um pouco acima do do peso Mulher" );
   }
   else if ((imc > 32.3) && (sexo == 3)){
     System.out.printf("Obesa Mulher" ); 
   }
   else if ((imc < 20.7) && (sexo == 1)) {
      System.out.printf("Esta abaixo do peso seu imc Homem" );
   }
   else if ((imc < 26.5) && (sexo == 1)) {
      System.out.printf("Esta no peso ideal Homem" );
   }
   else if ((imc < 27.9) && (sexo == 1)) {
      System.out.printf("Um pouco acima do do peso Homem" );
   }
   else if ((imc < 31.2) && (sexo == 1)){
     System.out.printf("Acima do do peso Homem" ); 
   }
   else if ((imc > 31.1) && (sexo == 1)){
     System.out.printf("Obeso Homem" ); 
   }

  System.out.println("Fim do programa");

 }


}