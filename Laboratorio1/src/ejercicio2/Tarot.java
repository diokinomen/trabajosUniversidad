package ejercicio2;

public class Tarot {
	private int suma;
	private int año;
	private int mes;
	private int dia;
	public void sumar(int datoA,int datoM,int datoD) {
		año = (datoA/1000)+((datoA%1000)/ 100)+(((datoA&1000)% 100)/10)+(((datoA&1000)% 100)%10);
		dia = (datoD/10)+ (datoD%10);
		mes = (datoM/10)+ (datoM%10);
		System.out.println("el primer digito del año es"+datoA/1000);
		System.out.println("el segundo digito del año es"+((datoA%1000)/ 100));
		System.out.println("el tercer digito del año es"+(((datoA%1000)% 100)/10));
		System.out.println("el cuarto digito del año es"+(((datoA%1000)% 100)%10));
		if(año>10) {
			año = (año/10)+((año%10)%10);
		}
		
		if(dia>10) {
			dia= (dia/10)+((dia%10)%10);
		}
		if(mes>10) {
			mes= (mes/10)+((mes%10)%10);
		}
		
		suma= año + dia +mes;
		System.out.println("su numero de tarot es"+suma);
		
	}

}
