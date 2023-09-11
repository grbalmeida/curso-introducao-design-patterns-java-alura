package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("200"), 4);
		Orcamento terceiroOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		Orcamento quartoOrcamento = new Orcamento(new BigDecimal("1000"), 6);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento)); // 20.0
		System.out.println(calculadora.calcular(segundoOrcamento)); // 0
		System.out.println(calculadora.calcular(terceiroOrcamento)); // 50.0
		System.out.println(calculadora.calcular(quartoOrcamento)); // 150.0
	}

}
