import java.util.Scanner;

public class DesafioFor {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;
    
    for (int i = 1; i <= 10 ; i++) {
       System.out.println("Digite um numero par!");
       int numero = entrada.nextInt();
       if (numero % 2 == 0 ) {
           soma += numero;
       }else{
           System.out.println("Voce nao digitou um numero par, digite outro por favor!");
           i--;
       }
       
    }

   System.out.printf("A soma dos numeros e %d" , soma);   
  }

}