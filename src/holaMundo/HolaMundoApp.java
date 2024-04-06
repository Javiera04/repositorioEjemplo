package holaMundo;

public class HolaMundoApp {
	
	private static int resultado = 0;

	public static void main(String[] args) {
		String nombre="Polo";
		String apellido="Rojas";
		int edad = 39; //no puede ser nulo, representacion de numero
		int numeroUno = 1;
		int numeroDos = 2;
		boolean trabaja = true;
		Boolean esChileno = true;
		
		Integer diasParaEl18 = 184; //puede ser nulo, es una clase completa
		
		resultado = sumar(numeroUno,numeroDos);
		int resultadoResta= resta(numeroUno, numeroDos);
		String nombreCompleto = nombre+" "+apellido+" tiene "+edad+" años ";
		
		//System.out.println(edad);
		//System.out.println(nombre);
		
		//System.out.println(diasParaEl18);
		System.out.println(resultado);
		System.out.println(resultadoResta);
		//System.out.println(nombreCompleto);
		
		System.out.println("hola");
	}
	
	private static int sumar(int a, int b) {
		int resultado = a+b;
		return resultado;
	}
	
	private static int resta(int a, int b) {
		int resultado = a-b;
		return resultado;
	}

}
