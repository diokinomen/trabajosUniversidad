package ejercico3;

public class Inscripcion {
	private int diaInscripcion;
	private int mesInscripcion;
	private int añoInscripcion;
	private int diaNacimiento;
	private int mesNacimiento;
	private int añoNacimiento;
	private String nombre;
	private String apellido;
	private int id;
	private int codigoNumerico;
	private String codigoAlfabetico;
	private String carreara;
	
	
	
	public Inscripcion(int diaInscripcion, int mesInscripcion,int añoInscripcion, int diaNacimiento, int mesNacimiento,int AñoNacimiento) {
		this.diaInscripcion = diaInscripcion;
		this.mesInscripcion = mesInscripcion;
		this.añoInscripcion = añoInscripcion;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.añoNacimiento = AñoNacimiento;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}

	public String getCodigoAlfabetico() {
		return codigoAlfabetico;
	}

	public void setCodigoAlfabetico(String codigoAlfabetico) {
		this.codigoAlfabetico = codigoAlfabetico;
	}

	public String getCarreara() {
		return carreara;
	}

	public void setCarreara(String carreara) {
		this.carreara = carreara;
	}
	

}
