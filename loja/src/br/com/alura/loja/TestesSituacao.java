package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class TestesSituacao {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 10);
		System.out.println("Situação: " + orcamento.getSituacao()); // EmAnalise
		System.out.println("Valor: " + orcamento.getValor()); // 1000
		orcamento.aplicarDescontoExtra(); // 5% de desconto
		System.out.println("Valor: " + orcamento.getValor()); // 950.0
		orcamento.aprovar();
		System.out.println("Situação: " + orcamento.getSituacao()); // Aprovado
		orcamento.aplicarDescontoExtra(); // 2% de desconto
		System.out.println("Valor: " + orcamento.getValor()); // 931.0
		orcamento.finalizar();
		System.out.println("Situação: " + orcamento.getSituacao()); // Finalizado
		orcamento.aplicarDescontoExtra(); // BigDecimal.ZERO
		System.out.println("Valor: " + orcamento.getValor()); // 931.0
	}

}
