package ejercicio2;

public class Tarot {
	private int suma;
	private int a�o;
	private int mes;
	private int dia;
	public void sumar(int datoA,int datoM,int datoD) {
		a�o = (datoA/1000)+((datoA%1000)/ 100)+(((datoA&1000)% 100)/10)+(((datoA&1000)% 100)%10);
		dia = (datoD/10)+ (datoD%10);
		mes = (datoM/10)+ (datoM%10);
		System.out.println("el primer digito del a�o es"+datoA/1000);
		System.out.println("el segundo digito del a�o es"+((datoA%1000)/ 100));
		System.out.println("el tercer digito del a�o es"+(((datoA%1000)% 100)/10));
		System.out.println("el cuarto digito del a�o es"+(((datoA%1000)% 100)%10));
		if(a�o>10) {
			a�o = (a�o/10)+((a�o%10)%10);
		}
		
		if(dia>10) {
			dia= (dia/10)+((dia%10)%10);
		}
		if(mes>10) {
			mes= (mes/10)+((mes%10)%10);
		}
		
		suma= a�o + dia +mes;
		System.out.println("su numero de tarot es"+suma);
		
	}

}
