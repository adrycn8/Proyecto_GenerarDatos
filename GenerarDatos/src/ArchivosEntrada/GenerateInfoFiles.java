/**
 * Program that will read the content of .txt files
 * Where is the information on sellers, products and sales
 * * @author Adriana Cortes N.
 * @version 1.0
*/

//name of the package where the class GenerateInfoFiles
package ArchivosEntrada; 

//Start importing necessary classes and libraries that will be used in the program
import java.io.BufferedReader;
/**
 * BufferedReader class reads text from an input stream of characters, 
 * storing the characters to provide efficient reading of characters, arrays, and lines.
Start importing necessary classes and libraries that will be used in the program * @class
*/
import java.io.FileInputStream;//Class para leer archivos de entrada
import java.io.IOException;//Catch errors when opening non-existent files
import java.io.InputStreamReader;//Class reads bytes and encodes them into characters
import java.io.UnsupportedEncodingException;

//end import classes and libraries.

/**
 * Esta @class GenerateInfoFiles es donde vamos a capturar la información de los
 * 3 archivos de entrada Productos.txt, Vendedores.txt y Ventas.txt
 */
public class GenerateInfoFiles {
	
	//Método main de la class GenerateInfoFiles
	//throws IOException capturan excepciones al leer los archivos .txt de entrada 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//buffer variable donde se almacenan los caracteres del archivo .txt
		//new BufferedReader crea el objeto BufferedReader lo instancia
		BufferedReader buffer = new BufferedReader(
				
				//InputStreamReader convierte los bytes leidos a caracteres unicode
				new InputStreamReader (
						
					/**FileInputStream @retun bytes de un archivo de entrada que esta en el disco local
					*en sistema de archivos utf-8
					**/
					new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Vendedores.txt"), "utf-8"));
		
		
		String linea="";//Declaración variable tipo string línea guarda temporalmente cada línea del archivo de entrada
		int numLinea=0;//Contar nro de líneas del archivo .txt
		
		/*Ciclo while permite leer con método readLine() el archivo almacenado en variable buffer linea por linea
		hasta la que la última linea sea diferente null*/
		while((linea=buffer.readLine())!=null)
				
		{
			numLinea++;//Incremento del nro de líneas de 1 en 1
			System.out.println(linea);//imprimir el contenido de cada línea del archivo
			
		}		

	}//Cierre de clase GenerateInfoFiles

}//Cierre de clase GenerateInfoFiles
