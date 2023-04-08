package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Conta cc = new ContaCorrente(1234,33785);
		Object cp = new ContaPoupanca(2254,55689);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		System.out.println(cliente);
		
		
		
		

	}

}
