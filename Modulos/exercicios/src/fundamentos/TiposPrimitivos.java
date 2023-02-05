package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		// info funcionario

		// tipos numericos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// tipos numericos reais

		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo bolean
		
		boolean estaDeFerias = false; // true
		
		// tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos/2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id +": Ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
