import java.util.Scanner;
public class ExameCortisol {

  public static void main(String [] args){
     Scanner entrada = new Scanner(System.in);

     System.out.print("Cortisol: ");
     double cortisol = entrada.nextDouble();
     
     // cortisol ideal é de 6 a 18.4

     boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;

     boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

     if (resultadoNormal && !resultadoAnormal)

        System.out.printf("Seu resultado esta normal");
    
     else

        System.out.printf("Seu resultado  nao esta normal");

  }

}