package david_Menendez_pila;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Pila {
private ArrayList<Integer> pila;

public Pila() {
	pila=new ArrayList<>();
}

public void anadir(int numero) throws PilaLlenaException{
	
	if(pila.size()!=30) {
		pila.add(numero);
		
	
		
	
	
	}else {
	
		PilaLlenaException pi=new PilaLlenaException("La pila esta llena");
		throw pi;
	}
	}
		
	

public void extraer() {
	if(!pila.isEmpty()) {
		pila.remove(0);
	
	}
	
	
}
public boolean Llena() {
	boolean devolver=false;
	if (pila.size()==30) {
		devolver=true;
	}
	return devolver;
	}

public boolean Vacia() {
	boolean devolver=false;
	if (pila.size()==0) {
		devolver=true;
	}
	return devolver;
}

public int elementos() {
	int devolver=pila.size();
	
	return devolver;
}

public void volcarDatos(String fichero) throws IOException {
	FileWriter fw = new FileWriter(fichero);
	BufferedWriter bw = new BufferedWriter(fw);
	try {
		for(Integer pi:pila) {
			
			bw.write(pi.toString()+",");
			
	
		}
		
		
		
		
		bw.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
}

@Override
public String toString() {
	return "Pila [pila=" + pila + "]";
}

}
