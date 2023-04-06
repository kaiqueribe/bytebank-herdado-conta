package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {

		super.saca(valor);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;

	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Conta Poupanca: " + super.toString();

	}

}
