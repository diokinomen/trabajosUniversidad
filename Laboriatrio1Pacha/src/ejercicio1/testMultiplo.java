package ejercicio1;

import java.util.Scanner;

public class testMultiplo {
	
	
	private static Scanner teclado =new Scanner (System.in); 

private static int numero;

public static void main(String[] args) {
	
	System.out.println("Digite un numero entre 500 y 1000: ");
	numero = teclado.nextInt();
	
	Multiplo objeto =new Multiplo();  
	
	System.out.println("La suma de los multiplos es: "+objeto.getsumaMultiplo());
			 	
}

}