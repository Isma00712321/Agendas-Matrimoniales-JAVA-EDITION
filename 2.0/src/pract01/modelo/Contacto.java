package pract01.modelo;

/**
 * Contacto de la agenda.
 *
 * @author Metodos de Programacion (UC) y <TODO: nombre alumno>
 * @version sep-2023
 */
public class Contacto {
	// atributos (informacion almacenada en un contacto)
	private String nombre;
	private String apellidos;
	private String ciudad;
	private String ig;
	private String imagen;

	
	private int edad;
	private int madrehijos;
	private int posibilidad;
	private boolean sexo;
	
	public enum Estado {
		MUYSOLTERX ,SOLTERX, COMPLICADO, CASADX, MUYCASADX, 
	}
	Estado estado;
	
	@SuppressWarnings("serial")
	public static class DatoVacio extends RuntimeException {}

/**
	 * Construye un contacto con los datos indicados.
	 * @param nombre nombre del contacto
	 * @param tlf telefono del contacto
	 * @param email direccion de correo electronico del contacto
	 */
	public Contacto(String nombre, String apellidos, String ciudad,
			String ig, int edad, int madrehijos, int posibilidad, String imagen, boolean sexo) {
		//: da valor a los atributos
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.ig = ig;
		this.edad = edad;
		this.madrehijos = madrehijos;
		this.posibilidad = posibilidad;
		this.imagen = imagen;
		this.sexo = sexo;
		estado = Estado.CASADX;
		
		
	}

	// metodos observadores (nombre(), tlf() y email())
	public String nombre() {
		return nombre;
	}
	
	public String apellidos() {
		return apellidos;
	}
	
	public String ciudad() {
		return ciudad;
	}
	public String ig() {
		return ig;
	}
	public int edad() {
		return edad;
	}
	public int madrehijos() {
		return madrehijos;
	}
	public int posibilidad() {
		return posibilidad;
	}
	public Estado estado() {
		return estado;
	}
	public String imagen() {
		return imagen;
	}
	public boolean sexo() {
		return sexo;
	}
	public void cambiaEstado(Estado estado) {
		this.estado = estado;
	}

	// metodos cambiadores del telefono y del e-mail
	public void cambiaDatos(String nombre, String apellidos, String ciudad,
			String ig, int edad, int madrehijos, int posibilidad, String imagen) {
		//: da valor a los atributos
		if (nombre.equals("") || apellidos.equals("") || ciudad.equals("") || ig.equals("") || imagen.equals("")) {
			throw new DatoVacio();
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.ig = ig;
		this.edad = edad;
		this.madrehijos = madrehijos;
		this.posibilidad = posibilidad;
		this.imagen = imagen;
		
	}
	
	public void cambiaEmail(String ciudad) {
		this.ciudad = ciudad;
	}	
}
