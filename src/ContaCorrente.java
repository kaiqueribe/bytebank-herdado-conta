
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor;

		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;

	}

	
		
		
	

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.25;
	}
}