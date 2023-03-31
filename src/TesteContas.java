
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println(cc.getSaldo());

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		System.out.println(cp.getSaldo());

		try {
			cc.transfere(10, cp);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getLocalizedMessage());

		}

		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
	}

}
