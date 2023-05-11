import java.util.Scanner;
public class ValidaAnoBissextos {

  public static void main(String [] args){
     Scanner entrada = new Scanner(System.in);

     System.out.print("Digite o ano: ");
     int ano = entrada.nextInt();

     boolean validaAno = (ano % 400) == 0;

     boolean validaAno2 = ((ano % 4) == 0) && (ano % 100 != 0); 


     boolean bissexto =  validaAno || validaAno2 ; 

     if (bissexto)

        System.out.printf("O ano e  bissexto" );

     else
    
        System.out.printf("O ano  nao e bissexto ");
        
  }

}