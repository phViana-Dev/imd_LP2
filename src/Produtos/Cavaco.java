package Produtos;

import Enum.CoresEnum;

public class Cavaco extends Produto{

	private String tipo;

	public Cavaco(CoresEnum cor, Double preco, String marca, String modelo, String tipo) {
		super(cor, preco, marca, modelo);
		this.tipo = tipo;
	}
	
}
