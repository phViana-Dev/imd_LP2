package Produtos;

import java.util.List;
import java.util.Scanner;

import Enum.CoresEnum;

public class Violao extends Produto{
	
	private Integer quantidadeDeCordas;
	private String tipo;
	
	public Violao(CoresEnum cor, Double preco, String marca, String modelo, Integer quantidadeDeCordas,
			String tipo) {
		super(cor, preco, marca, modelo);
		this.quantidadeDeCordas = quantidadeDeCordas;
		this.tipo = tipo;
	}

	public Integer getQuantidadeDeCordas() {
		return quantidadeDeCordas;
	}
	
	public static void cadastrarViolao(Scanner sc, List<Produto> estoque) {
		
		System.out.println();
		System.out.println("---------------Você escolheu a opção Violão----------------");
		System.out.println();
		
		System.out.print("Digite a quantidade de produtos: ");
	    int quantidadeDeProdutos = sc.nextInt();
	    sc.nextLine(); 

	    System.out.print("Digite o preço: ");
	    double preco = sc.nextDouble();
	    sc.nextLine();

	    System.out.print("Digite a marca: ");
	    String marca = sc.nextLine();

	    System.out.print("Digite o modelo: ");
	    String modelo = sc.nextLine();

	    System.out.print("Quantidade de cordas: ");
	    int quantidadeDeCordas = sc.nextInt();
	    sc.nextLine(); 

	    System.out.print("Qual o tipo: ");
	    String tipo = sc.nextLine();
	    
	    for(int i = 0; i < quantidadeDeProdutos; i++) {
			Produto produto = new Violao(cor, preco, marca, modelo, quantidadeDeCordas, tipo);
			produto.setCodigo(produto.gerarCodigo());
			estoque.add(produto);
		}  
	    
	}
		
}
