package ejercico3;

import java.util.Scanner;

public class testInscripcion {

	public static void main(String[] args) {
		Scanner lector =new Scanner(System.in);
		
		
		System.out.println("digite su nombre");
		String nombre = lector.next();
		System.out.println("digite su apellido");
		String apellido = lector.next();
		System.out.println("digite su numero de indentidad");
		int id = lector.nextInt();
		System.out.println("digite su dia de nacimiento");
		int diaNacimiento = lector.nextInt();
		System.out.println("digite su mes de nacimiento");
		int mesNacimiento = lector.nextInt();
		System.out.println("digite su año de nacimiento");
		int añoNacimiento = lector.nextInt();
		System.out.println("digite el dia de hoy");
		int diaInscripcion = lector.nextInt();
		System.out.println("digite el mes de hoy");
		int mesInscripcion = lector.nextInt();
		System.out.println("digite el año de inscripcion");
		int añoInscripcion = lector.nextInt();
		lector.close();
		
		Inscripcion miestudiante =new Inscripcion(diaInscripcion,mesInscripcion,añoInscripcion,diaNacimiento,mesNacimiento,añoNacimiento);
		miestudiante.setApellido(apellido);
		miestudiante.setNombre(nombre);
		miestudiante.setCodigoNumerico(2456);
		miestudiante.setCodigoAlfabetico("nfc");
		System.out.println(""+miestudiante.getNombre()+ " "+miestudiante.getApellido());
		System.out.println("el codigo del estudiante es: "+miestudiante.getCodigoNumerico()+ ""+miestudiante.getCodigoAlfabetico());
		System.out.println("la fecha cuando inscribio fue:"+diaInscripcion+"-"+mesInscripcion+"-"+añoInscripcion);
		
		
		System.out.println("mi hermano es genial");
		
		// TODO Auto-generated method stub

	}

}
