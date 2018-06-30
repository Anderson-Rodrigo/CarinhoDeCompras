package br.edu.unoesc.carrinhodecompras;

public class Produto<Tipo> {
	private Double preco;
	private String nome;
	private Tipo tipo;

	public Produto(Double preco, String nome, Tipo tipo) {
		super();
		this.preco = preco;
		this.nome = nome;
		this.tipo = tipo;
	}

	public TipoDoProduto getTipo() {
		return (TipoDoProduto) tipo;
	}

	public void setTipoProduto(Tipo tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double calularPreco() {
		if (this.tipo != null) {
			return ((TipoDoProduto) tipo).Calcular(this);
		} else {
			return getPreco();
		}
	}
}
