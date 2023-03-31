
public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 04545);

		conta.deposita(500);

		try {
			conta.saca(400);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());

	}

}
