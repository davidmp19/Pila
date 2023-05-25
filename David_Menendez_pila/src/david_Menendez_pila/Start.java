package david_Menendez_pila;

import java.io.IOException;

public class Start {

	public static void main(String[] args) throws PilaLlenaException, IOException {
		Pila pila = new Pila();
		
		try {
			for (int i = 0; i < 40; i++) {
				int numero = (int) (Math.random() * 99);
				pila.anadir(numero);
			}
		} catch (PilaLlenaException e) {
			e.printStackTrace();
		}
		
		System.out.println(pila.toString());
		pila.volcarDatos("C:\\Users\\Mañana\\Desktop\\salida1.txt");
		
		
		for (int i = 0; i < 10; i++) {
			pila.extraer();
		}
	
		System.out.println(pila.toString());
		pila.volcarDatos("C:\\Users\\Mañana\\Desktop\\salida2.txt");
		
		
		for (int i = 0; i < 30; i++) {
			pila.extraer();
		}
		System.out.println(pila.toString());
	}

}
