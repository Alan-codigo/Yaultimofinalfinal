package codigootros;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	
	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		HashMap<String, String> capitales = new HashMap<>();
	
		capitales.put("España","Madrid");
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa Rica", "San José");
		capitales.put("El Salvador","San Salvador");
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
	
	    
	    String nombrePais = "";
	
	    do {
	    	System.out.print("Escribe el nombre de un país y te diré su capital: ");
	    	nombrePais = s.nextLine();
	      
	    	if (capitales.containsKey(nombrePais)){
	    		System.out.println("La capital de " + nombrePais + " es " + capitales.get(nombrePais));
	        }else{
	        	System.out.print("No conozco la respuesta ");
	        	System.out.print("¿cuál es la capital de " + nombrePais + "?: ");
	        	String ca = s.nextLine();
	        	capitales.put(nombrePais,ca);
	        	System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      
	    }while(!nombrePais.equals("salir"));
	
	    s.close();
	}
 }
