package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaEspecial ce = new ContaEspecial(2536, 12859);
		ce.deposita(50);
		
		
		//full Qualified Name FQN = Nome pacote + nome classe
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println(cc.getSaldo());

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		System.out.println(cp.getSaldo());

		try {
			cc.transfere(101, cp);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getLocalizedMessage());

		}

		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
		System.out.println("CE:" + ce.getSaldo());
	}

}
