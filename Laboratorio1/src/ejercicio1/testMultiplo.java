package ejercicio1;

import java.util.Scanner;

public class testMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplo intento1 =new Multiplo();
		
		Scanner leector =new Scanner(System.in);
		System.out.println("digite un numero mayor a 500 y menor a 1000");
		int dato = leector.nextInt();
	//	leector.close();
		if((dato > 500) && (dato < 1000 )) {
			intento1.calcularSumatoriaMultiplos(dato);
		}
		else {
			System.out.println("el numero digitado no es funcional");
		}

	}

}
