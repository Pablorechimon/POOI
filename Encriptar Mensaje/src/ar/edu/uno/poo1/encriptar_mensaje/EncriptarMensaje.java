package ar.edu.uno.poo1.encriptar_mensaje;

public class EncriptarMensaje {

	public static void main(String[] args) {
//		String pruebas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
//		System.out.println(pruebas.indexOf("A"));
//		System.out.println(pruebas.charAt(0));
		String mensaje = "HOLA";
		
		System.out.println(EncriptarMensaje.encriptarMensaje(mensaje, 3));
		

	}
	
	public static String encriptarMensaje(String mensaje, int corrimiento) {
		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String mensajeEncriptado = "";
		
		for(int i = 0 ; i < mensaje.length(); i ++) {
			int indice = abecedario.indexOf(mensaje.charAt(i)) + corrimiento;
			mensajeEncriptado += abecedario.charAt(indice);
		}
		
		return mensajeEncriptado;
	}

}
