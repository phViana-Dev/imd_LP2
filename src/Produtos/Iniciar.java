package Produtos;

import java.util.Scanner;

public class Iniciar {

    public static Integer iniciar(Scanner sc) {      
     
           System.out.println("Você é vendedor ou cliente? ");
           System.out.println("0 - Vendedor");
           System.out.println("1 - Cliente");

           while (true) {
               System.out.print("Digite 0 ou 1: ");

               if (sc.hasNextInt()) {
                   int opcao = sc.nextInt();
                   if (opcao == 0 || opcao == 1) {
                       return opcao;
                   } else {
                       System.out.println("Opção inválida");
                   }
               } else {
                   System.out.println("Opção inválida.");
               }
          }
	
    }
}
