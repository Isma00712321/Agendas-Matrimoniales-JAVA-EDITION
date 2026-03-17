package pract01.gui;

import fundamentos_test.*;
import pract01.modelo.Agenda;
import pract01.modelo.Contacto;
import pract01.modelo.Contacto.Estado;

import java.awt.Desktop;
import java.net.URI;

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
		// opciones del menu
		final int ANHADE_CONTACTO = 0;
		final int CAMBIA_TLF = 1;
		final int CREADOR = 2;
		final int BUSCA_CONTACTO = 3;

		// variables auxiliares
		Contacto c;
		Lectura lect;
		String DEFECTO = "N/A";
		Dibujo dib=new Dibujo("Basarte",1280,720);

		// crea la agenda
		Agenda agenda = new Agenda();

		// crea la ventana de menu
		Menu menu = FundamentosFactory.getMenu("Agenda");
		menu.insertaOpcion("Anhade Contacto", ANHADE_CONTACTO);
		menu.insertaOpcion("Ver Agenda", CAMBIA_TLF);
		menu.insertaOpcion("Tutorial", BUSCA_CONTACTO);
		menu.insertaOpcion("Pagina del creador", CREADOR);

		int opcion;
		int id = 0;
		
		
		// lazo de espera de comandos del usuario
		while (true) {
			opcion = menu.leeOpcion();

			// realiza las acciones dependiendo de la opción elegida
			switch (opcion) {
			case ANHADE_CONTACTO:
				c = new Contacto(DEFECTO, DEFECTO, DEFECTO, DEFECTO, 0, 0, 0, DEFECTO);
				cambiaContacto(c);
				if (!agenda.anhadeContacto(c)) {
					mensaje("ERROR", "Ya existe un contacto con ese nombre");
				} else {
					mensaje("Contacto anhadido",
							"El contacto " + c.nombre() + " ha sido anhadido.");
				}
				break;

			case CAMBIA_TLF:
				  int op;
				  if (agenda.numContactos() == 0) {
					  mensaje("Subnormal", "Tienes que crear al menos un contacto \n (al menos a una tia tendras que conocer)");
				  }
				  else {
				  do {
				  Menu menu2 = FundamentosFactory.getMenu("Contactos");
				  
				  menu2.insertaOpcion("Mostrar en ventana", 0);
				  menu2.insertaOpcion("Contacto siguiente",2);
			      menu2.insertaOpcion("Contacto anterior",1);
			      menu2.insertaOpcion("Buscar por ID",3);
			      menu2.insertaOpcion("Editar contacto",4);
			      menu2.insertaOpcion("Mostrar imagen de perfil",6);
			      menu2.insertaOpcion("Salir",5);
		
			      
			      c = agenda.muestraContacto(id);
		
			      op=menu2.leeOpcion("Nombre:" + c.nombre() +
								"\nApellidos: " + c.apellidos() +
								"\nCiudad: " + c.ciudad() +
								"\nInstagram: " + c.ig() +
								"\nEdad: " + c.edad() +
								"\nNivel de MDMH: " + c.madrehijos() +
								"\nPosibilidad de singar: " + c.posibilidad() + " %" +
								"\nEstado civil: " + c.estado());
			         

			         switch (op) {
			         case 0:
			        	 mensaje("Datos contacto", "Nombre:" + c.nombre() +
									"\nApellidos: " + c.apellidos() +
									"\nCiudad: " + c.ciudad() +
									"\nInstagram: " + c.ig() +
									"\nEdad: " + c.edad() +
									"\nNivel de MDMH: " + c.madrehijos() +
									"\nPosibilidad de singar: " + c.posibilidad() + " %");
			        	 break;
			         case 1:
			         		if (id > 0) {
			         			id--;
			         		}
			         		break;
			         	case 2:
			         		if (id < agenda.numContactos() - 1) {
			         			id++;	
			         		}
			         		break;
			         	case 3:
							lect = FundamentosFactory.getLectura("Datos Contacto");
							lect.creaEntrada("ingresa id", "99");
							lect.esperaYCierra();
							id = lect.leeInt("ingresa id");
							if (id > agenda.numContactos() - 1|| id < 0) {
								mensaje("subnormal", "id invalida");
								id = 0;
							}
							break;
			         	case 4:
			         		cambiaContacto(c);
							break;
			         	case 6:
							dib.dibujaImagen(0,0,c.imagen() + ".jpg");
							dib.espera();
			         	default:
			         		op = 5;
			         } 
			         menu2.cierra();
				  } while (op!=5);
				  }
			break;



			case BUSCA_CONTACTO:
					mensaje("Welcome", "Bienvenido a las Agencias Matrimoniales de\nCodigos Lamsallak");
					mensaje("guay", "Este programa añade muchas mas funciones gracias al nuevo motor");	
					mensaje("guay", "Una de esas funciones este tutorial, por si eres falto");
					mensaje("obvio", "Para añadir contactos le das al primer boton");
					mensaje("obvio", "IMPORTANTE");
					mensaje("obvio", "Este programa cuenta con funcion de foto de perfil");
					mensaje("obvio", "Dicha imagen debe de ser un .jpg en el mismo directorio que el programa");
					mensaje("obvio", "A la hora de especificar el nombre de dicha imagen hay que hacerlo sin el jpg");
					mensaje("obvio", "Si no se especifica nada se usa por defecto una imagen que en teoria has descargado con el programa");
					mensaje("obvio", "Mas que nada el tutorial es para especificar eso porque el resto del programa esta hecho para crios");
					mensaje("obvio", "Asi que no lo voy a explicar");
					mensaje("obvio", "Diviertete");
					mensaje("obvio", "Para mas programas subscribete a Codigos Lamsallak PLUS por 12.99 euros al mes");
					break;
			case CREADOR:
				 MensajeSiNo men = new MensajeSiNo("Pagina");
				 Desktop desktop = Desktop.getDesktop();
			        if (men.pregunta("Pulsa SI si quieres ver la pagina de un creador de verdad \nPulsa NO si quieres ver la pagina de un pseudoprogramador que no hace nada organico(barbe no te ofendas)")) {
			            try {
			              desktop.browse(new URI("https://isma00712321.github.io/loquehaceunoporfollaroalmenosintentarlo/"));
			            } catch (Exception e) {
			                e.printStackTrace();
			            }
			        } else {
			            try {
				           desktop.browse(new URI("https://javib.es"));
				        } catch (Exception e) {
				            e.printStackTrace();
				            }
			        }
			 break;
				
			default:
				throw new AssertionError("Opcion no esperada");
			}
		}
	}

	/**
	 * Metodo auxiliar que muestra un ventana de mensaje.
	 * @param titulo titulo de la ventana
	 * @param txt texto contenido en la ventana
	 */
	private static void mensaje(String titulo, String txt) {
		Mensaje msj = FundamentosFactory.getMensaje(titulo);
		msj.escribe(txt);

	}
	
	private static void cambiaContacto (Contacto c) {
		String nombre;
		String apellidos;
		String ciudad;
		String ig;
		String imagen;
		int edad;
		int madrehijos;
		double posibilidad;
		
		Lectura lect;
		
		lect = FundamentosFactory.getLectura("Datos Contacto");
		lect.creaEntrada("Nombre", c.nombre());
		lect.creaEntrada("Apellidos", c.apellidos());
		lect.creaEntrada("Ciudad", c.ciudad());
		lect.creaEntrada("Instagram", c.ig());
		lect.creaEntrada("Edad", c.edad());
		lect.creaEntrada("De 0 a 100 cuanto es la madre de tus hijos", c.madrehijos());
		lect.creaEntrada("Posibilidades de singar", c.posibilidad());
		lect.creaEntrada("Imagen de perfil (MIRAR INFO)", "imagen");
		lect.esperaYCierra();
		nombre = lect.leeString("Nombre");
		apellidos = lect.leeString("Apellidos");
		ciudad = lect.leeString("Ciudad");
		ig = lect.leeString("Instagram");
		madrehijos = lect.leeInt("De 0 a 100 cuanto es la madre de tus hijos");
		edad = lect.leeInt("Edad");
		posibilidad = lect.leeDouble("Posibilidades de singar");
		imagen = lect.leeString("Imagen de perfil (MIRAR INFO)");
		
		c.cambiaDatos(nombre, apellidos, ciudad, ig, edad, madrehijos, posibilidad, imagen);
		cambiaEstado(c);
	}
	
	private static void cambiaEstado (Contacto contacto) {
		  
		  Menu menu3 = FundamentosFactory.getMenu("Prueba de Menu");
		  int decision;
		  menu3.insertaOpcion("MUY soltera",1);
	      menu3.insertaOpcion("Soltera",2);
	      menu3.insertaOpcion("Es complicado",3);
	      menu3.insertaOpcion("Casada",4);
	      menu3.insertaOpcion("MUY casada",5);
	      
	      decision = menu3.leeOpcion("Elige lo que mas se asemeje");
	      switch (decision) {
	      	case 1:
	      		contacto.cambiaEstado(Estado.MUYSOLTERA);
	      		break;
	      	case 2:
	      		contacto.cambiaEstado(Estado.SOLTERA);
	      		break;
	      	case 3:
	      		contacto.cambiaEstado(Estado.COMPLICADO);
	      		break;
	      	case 4:
	      		contacto.cambiaEstado(Estado.CASADA);
	      		break;
	      	case 5:
	      		contacto.cambiaEstado(Estado.MUYCASADA);
	      		break;
	      }
	      menu3.cierra();
	}
}
