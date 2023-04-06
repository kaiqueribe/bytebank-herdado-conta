package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor;

		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;

	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.25;
	}

	@Override
	public String toString() {

		return "ContaCorrente: " + super.toString();
	}
}