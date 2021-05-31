package numero;

import java.util.Scanner;

public class Numero {
	public static void main(String[] arg) {
		Scanner teclado=new Scanner (System.in);
		double n1, n2;
		double cociente;
		
		System.out.println("Introduce primer n�mero entero:");
		n1=teclado.nextDouble();
		
		System.out.println("Introduce segundo n�mero entero:");
		n2=teclado.nextDouble();
		
		cociente=n1/n2;
		
		System.out.println(n1+" / "+n2+" = "+cociente);
	}

}