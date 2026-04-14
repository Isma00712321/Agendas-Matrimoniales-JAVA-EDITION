package pract01.gui;

/**
 * Interfaz Gráfica de Usuario (GUI) de la aplicación de gestion
 * de una agenda de contactos y numeros de telefono.
 * 
 * @author Metodos de Programacion (UC)
 * @version sep-2024
 */
public class GUIGestionAgenda {


	/**
	 * Programa principal basado en menu.
	 * @param args argumentos del programa principal (no usados)
	 * @throws AssertionError si se ha producido un error no esperado.
	 */
	public static void main(String[] args) {
		VentanaMain ventana = new VentanaMain();
		ventana.setVisible(true);
		ventana.setResizable(false);
	}
	
	
}