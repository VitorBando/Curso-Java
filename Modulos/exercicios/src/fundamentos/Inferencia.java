package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro Texto";
		System.out.println(c);
		
		double d; 				// variavel inicalizada
		d = 126.55;				// variavel declarada
		System.out.println(d);	// variavel usada
		
		var e = 12.2;
		System.out.println(e);
		
		var f = 12; // inteiro
		//f = 12.01;
		System.out.println(f);
		
	}
}
