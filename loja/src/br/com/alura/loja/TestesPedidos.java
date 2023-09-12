package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedidos {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		String cliente = leitura.nextLine();
		
		System.out.println("Informe o valor do orçamento: ");
		BigDecimal valorOrcamento = leitura.nextBigDecimal();
		
		System.out.println("Informe a quantidade de itens: ");
		int quantidadeItens = leitura.nextInt();
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/* dependências */);
		handler.execute(gerador);
		
	}

}
