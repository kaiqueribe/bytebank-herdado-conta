package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
//Cria��o Obj Contas
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaCorrente cc2 = new ContaCorrente(111, 123);
//Cria��o Obj Implementaveis Seuro e Calculadora
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();

		
//		calc.registra(seguro);
//Transa��es Entre Obj Conta
		
		cc1.deposita(100.0);
		
		calc.registra(cc1);
		calc.registra(cc2);
		calc.registra(seguro);
//Impress�es		
		//System.out.println(calc.getTotalImposto());
		System.out.println(cc1.getSaldo());
		System.out.println(cc2.getSaldo());
		
		System.out.println(calc.getTotalImposto());
	}

}
