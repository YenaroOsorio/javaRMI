import java.rmi.*;
import java.io.*;

public interface HelloInterface extends Remote{
	
	public String say() throws RemoteException;
	public byte[] downloadFile(String fileName) throws RemoteException; //metodo que descarga un archivo


	//metodo de archivos
	public int cuentaLineas(String fileName) throws RemoteException;
	public int numeroDeVocales(String frase) throws RemoteException;
	public void escribe(String os) throws RemoteException, IOException; 
	public String [] imprimir(String fileName) throws RemoteException, IOException;
	public void respaldar(String fileName, String archivoNuevo) throws RemoteException, IOException;
	//public void copiar(String archivoNuevo) throws RemoteException;
	public void renombrar(String fileName, String nuevoNombre) throws RemoteException;
	public void eliminar(String fileName) throws RemoteException;
}