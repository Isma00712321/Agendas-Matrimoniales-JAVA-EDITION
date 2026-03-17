package pract01.modelo;

import java.util.ArrayList;
/**
 * Agenda de contactos.
 *
 * @author Metodos de Programacion (UC) y Ismael Lamsallak
 * @version feb-2026
 */
public class Agenda {
	// contactos de la agenda
	private static final int MX_NUM_CONTACTOS = 10;
	ArrayList<Contacto> contactos = new ArrayList<>();
	private int numContactos = 0; // numero actual de contactos en la agenda
	
	/**
	 * Anhade el contacto pasado como parametro a la agenda.
	 * @param contacto contacto a anhadir
	 * @return verdadero si el contacto ha sido anhadido y falso si no ha sido
	 * anahdido porque ya existe en la agenda otro contacto con el mismo nombre
	 * o porque se ha alcanzado el numero maximo de contactos permitido.
	 */
	public boolean anhadeContacto(Contacto contacto) {
		if (numContactos >= MX_NUM_CONTACTOS) {
			return false;
		} 
		if (buscaContacto(contacto.nombre()) != null) {
			return false;
		}
		
		contactos.add(contacto);
		numContactos++;
		return true;
	}
	
	
	/**
	 * Cambia el telefono de un contacto.
	 * @param nombre nombre del contacto cuyo telefono se quiere cambiar
	 * @param tlf nuevo telefono a asignar al contacto
	 * @return verdadero si se ha cambiado el telefono del contacto y falso si no ha sido
	 * posible ya que no existe ningun contacto con el nombre indicado
	 */
	public boolean cambiaTlfContacto(String nombre, String tlf) {
		Contacto contacto = buscaContacto(nombre);
		if (contacto == null) {
			return false;
		}
		
		return true;
	}
	
	public Contacto muestraContacto (int id) {
		return contactos.get(id);
	}
	public int numContactos() {
		return contactos.size();
	}
	
	/**
	 * Cambia el e-mail de un contacto.
	 * @param nombre nombre del contacto cuyo e-mail se quiere cambiar
	 * @param email nuevo e-mail a asignar al contacto
	 * @return verdadero si se ha cambiado el e-mail del contacto y falso si no ha sido
	 * posible ya que no existe ningun contacto con el nombre indicado
	 */
	public boolean cambiaContacto(String nombre) {
		// TODO:
		// Busca el contacto llamando a buscaContacto()
		// Si no existe retorna falso
		// Cambia el e-mail del contacto.
		Contacto contacto = buscaContacto(nombre);
		if (contacto == null) {
			return false;
		}
		
		contacto.cambiaDatos(nombre, nombre, nombre, nombre, MX_NUM_CONTACTOS, numContactos, MX_NUM_CONTACTOS, nombre);
		return true;
	}
	
	/**
	 * Retorna el contacto con el nombre indicado.
	 * @param nombre nombre del contacto buscado
	 * @return el contacto con el nombre buscado o null si no existe ningun contacto con
	 * ese nombre
	 */
	public Contacto buscaContacto(String nombre) {
		for (Contacto c: contactos) {
			if (c.nombre().equals(nombre)) {
				return c;
			}
		}
		return null; // no encontrado
	}
}
