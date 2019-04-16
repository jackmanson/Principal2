package Principal;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args){
		
		// Se crea un objeto llamado entrada de la clase SCANNER
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int edad;
		
		System.out.println("Ingrese su nombre: ");
		
		nombre = entrada.nextLine();// Recibe texto de tipo STRING en la variable nombre
		
		System.out.println("Engrese su edad: ");
		
		edad = entrada.nextInt();// Recibe dato de tipo entero en la variable edad
		
		System.out.println("Su nombre es "+nombre+" y su edad "+edad);
		
		
		
	}

}
