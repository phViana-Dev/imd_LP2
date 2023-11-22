package Produtos;

import java.util.List;

import Enum.CoresEnum;

public class MontandoLoja {
	
	/*public static void cadastrarViolao(int quantidadeDeProdutos, List<Produto> estoque, CoresEnum cor, double preco, String marca, String modelo, int quantidadeDeCordas, String tipo) {
		for(int i = 0; i < quantidadeDeProdutos; i++) {
			Produto produto = new Violao(cor, preco, marca, modelo, quantidadeDeCordas, tipo);
			produto.codigo = produto.gerarCodigo();
			estoque.add(produto);
		}
	}*/
	
	public static void cadastrarViolino(/* parametros */){
		
	}
	
	public static void cadastrarGuitarra(/* parametros */) {
		
	}
	
	public static void cadastrarCavaco(int quantidadeDeProdutos, List<Produto> estoque, CoresEnum cor,double preco, String marca, String modelo, String tipo) {
		for(int i = 0; i < quantidadeDeProdutos; i++) {
			Produto produto = new Cavaco(cor, preco, marca, modelo, tipo);
			produto.codigo = produto.gerarCodigo();
			estoque.add(produto);
		}
	}
			
}
