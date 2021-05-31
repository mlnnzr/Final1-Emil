package numero;

import java.util.Scanner;
/**
 * 
 * @author Emil
 *@since 31/05/2021
 * Version 1, 2021
 */

public class Numero {
	public static void main(String[] arg) {
		/**
		 * Variables y Scanner 
		 */
		Scanner teclado=new Scanner (System.in);
		double n1, n2;
		double cociente;
		
		/**
		 * Se introduce primer numero
		 */
		System.out.println("Introduce primer nmero entero:");
		n1=teclado.nextDouble();
		/**
		 * Se introduce el segundo numero
		 */
		System.out.println("Introduce segundo nmero entero:");
		n2=teclado.nextDouble();
		/**
		 * Se saca el cociente
		 */
		cociente=n1/n2;
		
		System.out.println(n1+" / "+n2+" = "+cociente);
	}

}