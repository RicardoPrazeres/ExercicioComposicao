package entidades;

public class PedidoItem {
	
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;

	public PedidoItem() {
		super();
	}

	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
	
	public double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", Quantidade: "
				+ quantidade
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	
	
}