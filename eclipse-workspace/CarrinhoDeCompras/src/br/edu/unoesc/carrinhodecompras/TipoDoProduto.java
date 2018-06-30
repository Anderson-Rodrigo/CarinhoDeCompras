package br.edu.unoesc.carrinhodecompras;

public enum TipoDoProduto {
	BEBIDA(new Bebida()), 
	VESTUARIO(new Vestuario());

	private RegraDeCalculo regraCalculo;

	private TipoDoProduto(RegraDeCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}

	public Double Calcular(Produto produto) {
		return regraCalculo.calculoDeDesconto(produto);
	}
}
 