package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import entidades.ENUM.PedidoStatus;


public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com nome do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data aniversário (DD/MM/YYYY): ");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cli = new Cliente(nome, email, aniversario);
		
		System.out.println("Entre com os dados do pedido");
		System.out.print("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cli);
		
		System.out.print("Quantos itens o pedido vai ter: ");
		int N = sc.nextInt();
		 
		for (int i = 1; i <= N; i++) {
			System.out.print("Entre #" + i + " nome produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			PedidoItem it = new PedidoItem(quantidade, precoProduto, produto);	
			
			pedido.addItem(it);			
		}
		
		System.out.println();
		System.out.println(pedido);
		
		sc.close();
	}

}
