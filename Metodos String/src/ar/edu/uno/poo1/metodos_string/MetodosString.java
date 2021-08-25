package ar.edu.uno.poo1.metodos_string;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Hola";
		
		MetodosString.recortarString(mensaje, 0, 2);
		// charAt()
		
		// compareTo() && compareToIgnoreCase()
		
		// concat()
		
		// contains()
		
		// indexOf()
		
		// length()
		
		// replace()
		
		// toLowerCase()
		
		// split()
	
		String logs [] = new String [5];
		
		for (int i = 0; i < logs.length ; i ++) {
			logs[i] = "Log número :" + i;
		}
		
		for(String log: logs) {
			System.out.println(log);
		}
		
		

	}
	
	public static void recortarString(String mensaje, int indice_inicial, int indice_final) {
		String mensajeRecortado = mensaje.substring(indice_inicial, indice_final);
		System.out.println(mensajeRecortado);
	}

}
