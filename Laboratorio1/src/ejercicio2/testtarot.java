package ejercicio2;

import java.util.Scanner;

public class testtarot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Scanner teclado = new Scanner(System.in);
			Tarot minumero = new Tarot();
			System.out.println("digite su a�o de nacimiento");
			int datoDelA�o = teclado.nextInt();
			System.out.println("digite su mes de nacimiento");
			int datoMes = teclado.nextInt();
			System.out.println("digite su dia de nacimiento");
			int datoDia = teclado.nextInt();
			teclado.close();
			if (datoMes > 12 || datoDia > 31) {
				System.out.println("usted es un simio");
			} else {
				minumero.sumar(datoDelA�o, datoMes, datoDia);
			}


	}
	
	

}
