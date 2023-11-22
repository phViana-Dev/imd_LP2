package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Produtos.Iniciar;
import Produtos.Produto;
import Produtos.Vendedor;

public class Programa {

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		List<Produto> estoque = new ArrayList<>();
		
		try {
			System.out.println("Seja bem indo a xxxxx Musical!");
			System.out.println("Trabalhamos com venda de Violão, Guitarra, Violino e Cavaco");
			
			switch(Iniciar.iniciar(sc)) {
			case 0:
				Vendedor.acaoVendedor(sc, estoque);
				break;
			case 1:
				System.out.println("cliente");
				break;
			}
		} finally {
			sc.close();
		}
	}
}
