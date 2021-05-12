package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import entidades.ENUM.PedidoStatus;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private PedidoStatus status;
	
	private Cliente cliente;
	
	private List<PedidoItem> itens = new ArrayList<>();

	public Pedido() {
		super();
	}

	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(PedidoItem item) {
		itens.add(item);
	}
	
	public void removeItem(PedidoItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (PedidoItem it : itens) {
			soma += it.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Pedido status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido itens:\n");
		for (PedidoItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
