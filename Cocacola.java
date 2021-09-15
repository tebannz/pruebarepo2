import java.util.Scanner;

public class Cocacola{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		String nombre ="";
		int antiguedad = 0, clave = 0 ;

		System.out.println("bienvenido a Coca Cola Cual es tu nombre");
		nombre = in.nextLine();
		
		
		System.out.println ("Hola" + nombre + "Cuantos años llevas en la empresa: ");
		antiguedad = in.nextInt();

	
		System.out.println ("Cual es la clave de su departamento: ");
		clave= in.nextInt();
		
		if (clave == 1){
			if(antiguedad == 1){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 6 días de vacaciones");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 14 días de vacaciones");
			} else if (antiguedad == 7){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 20 días de vacaciones");
			} else {
				System.out.println("Error, la antiguedad no es valida");
			}
		} else if (clave == 2){
			if(antiguedad == 1){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 6 días de vacaciones");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 15 días de vacaciones");
			} else if (antiguedad == 7){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 22 días de vacaciones");
			} else {
				System.out.println("Error, la antiguedad no es valida");
			}
		} else if (clave == 3){
			if(antiguedad == 1){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 10 días de vacaciones");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 20 días de vacaciones");
			} else if (antiguedad == 7){
				System.out.println("Estimado" + nombre + "Usted tiene derecho a 30 días de vacaciones");
			} else {
				System.out.println("Error, la antiguedad no es valida");
			}
		} else {
			System.out.println("Error, la clave no es valida");
		}
		
}
}
