
public class TesteTributaveis {

	public static void main(String[] args) {
//Criação Obj Contas
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaCorrente cc2 = new ContaCorrente(111, 123);
//Criação Obj Implementaveis Seuro e Calculadora
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();

		
//		calc.registra(seguro);
//Transações Entre Obj Conta
		
		cc1.deposita(100.0);
		
		calc.registra(cc1);
		calc.registra(cc2);
		calc.registra(seguro);
//Impressões		
		//System.out.println(calc.getTotalImposto());
		System.out.println(cc1.getSaldo());
		System.out.println(cc2.getSaldo());
		
		System.out.println(calc.getTotalImposto());
	}

}
