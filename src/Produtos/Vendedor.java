package Produtos;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Vendedor{
		
	public static void acaoVendedor(Scanner sc, List<Produto> estoque) {
		
		
		System.out.println();
        System.out.println("0 - Cadastrar Produto");
        System.out.println("1 - Remover Produto");
        System.out.print(("Digita a operação que deseja realizar: "));
        int option = sc.nextInt();

        switch(option) {
        case 0:
        	cadastrarProduto(sc, estoque);
        	break;
        case 1:	
        	// remover produto
        }
	}
	
	public static void cadastrarProduto(Scanner sc, List<Produto> estoque) {
		
		Locale.setDefault(Locale.US); 
		
		System.out.println();
	    System.out.println("Qual produto você deseja cadastrar? ");
	    System.out.println("0 - Violão");
	    System.out.println("1 - Guitarra");
	    System.out.println("2 - Violino");
	    System.out.println("3 - Cavaco");
	    System.out.print("Digite a opção você deseja: ");
	    int tipoInstrumento = sc.nextInt();
	    
	    switch(tipoInstrumento) {
	    case 0:
	    	Violao.cadastrarViolao(sc, estoque);
	    	
	    }
	}
	
	
}
