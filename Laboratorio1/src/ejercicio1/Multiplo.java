package ejercicio1;

public class Multiplo {
	//Attributes
	
	
	private int sumatoriaMultiplos;

	
	//metodos
	
	public void calcularSumatoriaMultiplos(int dato) {
		for(int i=3;i < dato; i++ ) {
			if((i % 3) == 0 || (i%5)==0) {
				sumatoriaMultiplos = sumatoriaMultiplos+ i;
			}
		}
		for(int i=3;i < dato; i++ ) {
			if((i % 3) == 0 || (i%5)==0) {
				System.out.println(i);
			}
		}
		System.out.println("la sumatoria de los multiplos es: "+sumatoriaMultiplos);
	}

	

}
