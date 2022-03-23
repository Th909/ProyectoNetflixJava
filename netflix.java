package net;
import  java.util.Scanner;

public class netflix {
	
	private static int tipo;
	
	public static void main (String[]args) {
		crearContenido();
	}
	
	public static void crearContenido() {
		try (Scanner leer = new Scanner (System.in)) {
			boolean bandera = false;
			do {
				System.out.println("1.Añadir película\n2.Añadir Serie\n3.Salir");
				tipo = leer.nextInt();
				switch (tipo){
				case 1: 
					contenido contenido1 = new contenido("Star Wars", "hola" ,1995, 127, false);
					peliculas pelicula1 = new peliculas ("EEUU", "goodfilm");
					System.out.println(contenido1.toString()+pelicula1.toString());
					break;
				case 2:
					contenido contenido2 = new contenido("The mandalorian", "hola" ,1995, 127, false);
					series serie1 = new series(5, 4);
					System.out.println(contenido2.toString()+serie1.toString());
					break;
				case 3:
					System.out.println("Adios");
					bandera = true;
					break;
				default:
					System.out.println("Por favor, introduzca una opción válida");
					break;
				}
			}while(!bandera);
		}catch (Exception e) {
			System.out.println("Por favor, introduzca una opcion válida");
		}
		
		
	}
	
	public static void MostrarContenido() {
		
	}
	
	public static void MostrarPromociones() {
		
	}
	
	public static void CostePromocion() {
		
	}
	
	public static void CalcularSubvencion() {
		
	}
	
	public static void CalcularMarketing() {
		
	}
}
