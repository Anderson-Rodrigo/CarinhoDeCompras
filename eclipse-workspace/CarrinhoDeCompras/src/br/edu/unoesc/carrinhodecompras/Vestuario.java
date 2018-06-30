package br.edu.unoesc.carrinhodecompras;

public class Vestuario implements RegraDeCalculo {	

	@Override
	public Double calculoDeDesconto(Produto produto) {
		return (produto.getPreco() - (produto.getPreco() * 0.25));
	}
}
