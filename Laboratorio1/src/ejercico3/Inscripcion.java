package ejercico3;

public class Inscripcion {
	private int diaInscripcion;
	private int mesInscripcion;
	private int a�oInscripcion;
	private int diaNacimiento;
	private int mesNacimiento;
	private int a�oNacimiento;
	private String nombre;
	private String apellido;
	private int id;
	private int codigoNumerico;
	private String codigoAlfabetico;
	private String carreara;
	
	
	
	public Inscripcion(int diaInscripcion, int mesInscripcion,int a�oInscripcion, int diaNacimiento, int mesNacimiento,int A�oNacimiento) {
		this.diaInscripcion = diaInscripcion;
		this.mesInscripcion = mesInscripcion;
		this.a�oInscripcion = a�oInscripcion;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.a�oNacimiento = A�oNacimiento;
		
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
