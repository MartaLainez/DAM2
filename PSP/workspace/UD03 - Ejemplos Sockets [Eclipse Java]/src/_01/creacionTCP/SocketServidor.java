package _01.creacionTCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {

	public static void main(String[] args) throws IOException {
		
		int puerto = 60000;// Puerto 
		ServerSocket servidor=null;
		
		servidor = new ServerSocket(puerto);
				
		System.out.println("Escuchando en " + servidor.getLocalPort());
		
		Socket clientel = servidor.accept();//esperando a un cliente 
		//realizar acciones con clientel 
		
		Socket cliente2 = servidor.accept();//esperando a otro cliente 
		//realizar acciones con cliente2 
		
		servidor.close(); //cierro socket servidor
		
	}//fin de main

}//fin de SocketServidor