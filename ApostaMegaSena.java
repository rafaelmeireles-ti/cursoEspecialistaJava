import java.util.Scanner;

public class ApostaMegaSena {
  public static void main(String[] args){
  
  Scanner entrada = new Scanner(System.in); 
  
  int quantidadeNumeros = 0;
 
  do {
   System.out.print("Quantos numeros voce quer jogar? ");
   quantidadeNumeros = entrada.nextInt();
   if(quantidadeNumeros < 6 || quantidadeNumeros > 15) {
     System.out.println("Quantidade de numeros deve ser entre 6 e 15");
   }
  }while(quantidadeNumeros < 6 || quantidadeNumeros > 15);  
   
   int numeroAtual = 1;
   String numerosEscolhidos = "";   
   do {
   System.out.printf("Numero %d/%d " , numeroAtual, quantidadeNumeros );
   int numeroEscolhido = entrada.nextInt(); 

   if (numeroEscolhido < 1 || numeroEscolhido > 60 ) {
       System.out.println("Numero precisa ser maior que 0 e menor que 60");
   }else{
       numerosEscolhidos += numeroEscolhido + " ";
       numeroAtual++;
   }
   }while(numeroAtual <= quantidadeNumeros); 


    System.out.printf("Numeros escolhidos: %s%n", numerosEscolhidos);
 }



}