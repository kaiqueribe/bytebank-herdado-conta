package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo; => FQN
public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel taxa) {
		
	double valor = taxa.getValorImposto();
		
		this.totalImposto += valor;
		}

	public double getTotalImposto() {
		return totalImposto;
	}

}
