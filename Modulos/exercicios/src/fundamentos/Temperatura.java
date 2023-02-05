package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		final double fator = 5.0/9.0;
		final double ajuste = 32;
		double F = 77;
		double C = (F - fator) * ajuste;
		
		System.out.println(F + " Em °F = " + C + " em °C");
	}
}
