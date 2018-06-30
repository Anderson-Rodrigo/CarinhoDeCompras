package br.edu.unoesc.carrinhodecompras;

public class Bebida implements RegraDeCalculo {

	@Override
	public Double calculoDeDesconto(Produto produto) {
		return (produto.getPreco() - (produto.getPreco() * 0.05));
	}
}
