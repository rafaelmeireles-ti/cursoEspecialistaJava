import java.util.Scanner;

public class AvaliacaoAtendimento {
  
 public static void main(String [] args) {
   Scanner entrada = new Scanner(System.in);

   System.out.print("Avalie o nosso atendimento (1 a 5) : ");
   int nota = entrada.nextInt();

   String descricaoNota;

   switch (nota) {
    
    case 1: 
      descricaoNota = "Muito Ruim";
      break;
    case 2: 
      descricaoNota = "Ruim";
      break;
    case 3: 
      descricaoNota = "Razoavel";
      break;
    case 4: 
      descricaoNota = "Muito bom";
      break;
    case 5: 
      descricaoNota = "Excelente";
      break;
    default:
      descricaoNota = "Opcao Invalida";
   }

  System.out.printf("Sua nota foi %s : ", descricaoNota );  

}




}