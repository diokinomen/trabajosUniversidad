package ejercicio1;

public class Multiplo {

	private int sumaMultiplo;
	
	public void encontrarMultiplo(int dato){
		
		for (int i=0; i<dato; i++){ 				//estructura para recorrer los numeros del dato
			
			if(dato%3==0 || dato%5==0){
				sumaMultiplo=dato+sumaMultiplo;		//dentro del if ya ingresan los multiplos y se van sumando
			}
		}
	}
	public int getsumaMultiplo(){
		return sumaMultiplo;
	}
	

}