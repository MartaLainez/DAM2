package runTime;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("java NombreClaseAEjecutar", null, new File(".\\bin"));
			int retorno = process.waitFor();
			if(retorno < 0) {
				System.err.println("Error en proceso de numeracion");
				throw new IOException();
			}
			else if(retorno == 0)
				System.out.println("Proceso finalicado correctamente");
			else
				System.out.println("Proceso finalizado con valor de retorno: " + retorno);
			
		}
		catch (IOException ioe){
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}