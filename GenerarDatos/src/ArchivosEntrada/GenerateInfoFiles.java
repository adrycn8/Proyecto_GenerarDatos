/**
 * Programa que leerá el contenido de los archivos de entreda .txt
 * Dónde está la información de vendedores, productos y ventas
 *  @author Integrantes Subgrupo 14 
 * - Adriana Cortes Naranjo
 * - Stiven Alejandro Rios Lopez
 * - Carlos Mario Loaiza Castaño
 * - Laura Natalia Forrero Torres
 * @version 1.0
*/
//INICIO DEL PROGRAMA PARA LEER  ARCHIVOS DE ENTRADA .TXT
//Nombre del paquete "ArchivosEntrada" donde está la clase GenerateInfoFiles
package ArchivosEntrada; 

//Se Comienza a importar las clases y bibliotecas necesarias que se utilizarán en el programa
import java.io.BufferedReader;
/**
 * @class BufferedReader esta clase lee texto de un flujo de entrada de caracteres,
 * almacenar los caracteres para proporcionar una lectura eficiente de caracteres, matrices y líneas
*/
import java.io.FileInputStream;//Clase para leer archivos de entrada
import java.io.IOException;//Clase que permite detectar errores al abrir archivos inexistentes
import java.io.InputStreamReader;//Clase lee bytes y los codifica en caracteres
import java.io.UnsupportedEncodingException;

//finaliza la importación de clases y bibliotecas

/**
 * Esta @class GenerateInfoFiles es donde vamos a capturar la información de los
 * 3 archivos de entrada Productos.txt, Vendedores.txt y Ventas.txt
 */
public class GenerateInfoFiles {
	
	//Método main de la clase GenerateInfoFiles
	//throws IOException capturan excepciones al leer los archivos .txt de entrada 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Inicio Lectura archivo de entrada Vendedores.txt
		System.out.println('\n'+"-----------------Archivo Vendedores.txt---------------------");
		
		//buffer variable donde se almacenan los caracteres del archivo Vendedores.txt
		BufferedReader buffer = new BufferedReader(
		//new BufferedReader crea el objeto BufferedReader lo instancia
				
				//InputStreamReader convierte los bytes leidos a caracteres unicode
				new InputStreamReader (
						
					/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
					*en sistema de archivos utf-8
					**/
					new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Vendedores.txt"), "utf-8"));
				
		String linea="";//Declaración variable tipo string línea guarda temporalmente cada línea del archivo Vendedores.txt
		int numLinea=0;//Contar nro de líneas del archivo Vendedores.txt
		
		/*Ciclo while permite leer con método readLine() el archivo Vendedores.txt que esta
		 *  almacenado en variable buffer linea por linea
		 *  hasta la que la última linea sea diferente null*/
		while((linea=buffer.readLine())!=null)
		
		{
			numLinea++;//Incremento del nro de líneas de 1 en 1
			System.out.println(linea);//imprimir el contenido de cada línea del archivo Vendedores.txt
			
		}
		//Mensaje de carga exitosa archivo Vendedores.txt
		System.out.println('\n'+"¡Archivo Vendedores.txt cargado con exito!");
		
		//Inicio Lectura archivo de entrada Productos.txt
		System.out.println('\n'+"-----------------Archivo Productos.txt---------------------");
		
		//buffer2 variable donde se almacenan los caracteres del archivo Productos.txt
		BufferedReader buffer2 = new BufferedReader(
				
				//InputStreamReader convierte los bytes leidos a caracteres unicode
				new InputStreamReader (
						
					/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
					*en sistema de archivos utf-8
					**/
					new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Productos.txt"), "utf-8"));
				
		String linea2="";//Declaración variable tipo string línea2 guarda temporalmente cada línea del archivo Productos.txt
		int numLinea2=0;//Contar nro de líneas del archivo Productos.txt
		
		/*Ciclo while permite leer con método readLine() el archivo Productos.txt que esta
		 *  almacenado en variable buffer2 linea por linea
		 *  hasta la que la última linea sea diferente null*/
		while((linea2=buffer2.readLine())!=null)
				
		{
			numLinea2++;//Incremento del nro de líneas de 1 en 1
			System.out.println(linea2);//imprimir el contenido de cada línea del archivo Productos.txt
			
		}
		//Mensaje de carga exitosa archivo Productos.txt
		System.out.println('\n'+"¡Archivo Productos.txt cargado con exito!");
		
		//Inicio carga archivo de entrada Ventas.txt
		System.out.println('\n'+"-----------------Archivo Ventas.txt---------------------");
		
		//buffer3 variable donde se almacenan los caracteres del archivo Ventas.txt
		BufferedReader buffer3 = new BufferedReader(
				
				//InputStreamReader convierte los bytes leidos a caracteres unicode
				new InputStreamReader (
						
					/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
					*en sistema de archivos utf-8
					**/
					new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Ventas.txt"), "utf-8"));
		
		
		String linea3="";//Declaración variable tipo string línea3 guarda temporalmente cada línea del archivo Ventas.txt
		int numLinea3=0;//Contar nro de líneas del archivo Ventas.txt
		
		/*Ciclo while permite leer con método readLine() el archivo Ventas.txt que esta
		 *  almacenado en variable buffer3 linea por linea
		 *  hasta la que la última linea sea diferente null*/
		while((linea3=buffer3.readLine())!=null)
				
		{
			numLinea3++;//Incremento del nro de líneas de 1 en 1
			System.out.println(linea3);//imprimir el contenido de cada línea del archivo Ventas.txt
			
		}
		//Mensaje de carga exitosa archivo Ventas.txt
		System.out.println('\n'+"¡Archivo Ventas.txt cargado con exito!");
		
		//Inicio carga archivo de entrada Ventas1.txt
				System.out.println('\n'+"-----------------Archivo Ventas1.txt---------------------");
				
				//buffer4 variable donde se almacenan los caracteres del archivo Ventas.txt
				BufferedReader buffer4 = new BufferedReader(
						
						//InputStreamReader convierte los bytes leidos a caracteres unicode
						new InputStreamReader (
								
							/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
							*en sistema de archivos utf-8
							**/
							new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Ventas1.txt"), "utf-8"));
				
				
				String linea4="";//Declaración variable tipo string línea4 guarda temporalmente cada línea del archivo Ventas1.txt
				int numLinea4=0;//Contar nro de líneas del archivo Ventas1.txt
				
				/*Ciclo while permite leer con método readLine() el archivo Ventas1.txt que esta
				 *  almacenado en variable buffer4 linea por linea
				 *  hasta la que la última linea sea diferente null*/
				while((linea4=buffer4.readLine())!=null)
						
				{
					numLinea4++;//Incremento del nro de líneas de 1 en 1
					System.out.println(linea4);//imprimir el contenido de cada línea del archivo Ventas1.txt
					
				}
				//Mensaje de carga exitosa archivo Ventas1.txt
				System.out.println('\n'+"¡Archivo Ventas1.txt cargado con exito!");
				
				//Inicio carga archivo de entrada Ventas2.txt
				System.out.println('\n'+"-----------------Archivo Ventas2.txt---------------------");
				
				//buffer5 variable donde se almacenan los caracteres del archivo Ventas2.txt
				BufferedReader buffer5 = new BufferedReader(
						
						//InputStreamReader convierte los bytes leidos a caracteres unicode
						new InputStreamReader (
								
							/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
							*en sistema de archivos utf-8
							**/
							new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Ventas2.txt"), "utf-8"));
				
				
				String linea5="";//Declaración variable tipo string línea5 guarda temporalmente cada línea del archivo Ventas2.txt
				int numLinea5=0;//Contar nro de líneas del archivo Ventas2.txt
				
				/*Ciclo while permite leer con método readLine() el archivo Ventas2.txt que esta
				 *  almacenado en variable buffer5 linea por linea
				 *  hasta la que la última linea sea diferente null*/
				while((linea5=buffer5.readLine())!=null)
						
				{
					numLinea5++;//Incremento del nro de líneas de 1 en 1
					System.out.println(linea5);//imprimir el contenido de cada línea del archivo Ventas2.txt
					
				}
				//Mensaje de carga exitosa archivo Ventas2.txt
				System.out.println('\n'+"¡Archivo Ventas2.txt cargado con exito!");
				
				//Inicio carga archivo de entrada Ventas3.txt
				System.out.println('\n'+"-----------------Archivo Ventas3.txt---------------------");
				
				//buffer6 variable donde se almacenan los caracteres del archivo Ventas3.txt
				BufferedReader buffer6 = new BufferedReader(
						
						//InputStreamReader convierte los bytes leidos a caracteres unicode
						new InputStreamReader (
								
							/**FileInputStream @retun lee los bytes de un archivo de entrada que esta en el disco local
							*en sistema de archivos utf-8
							**/
							new FileInputStream ("C:/Users/USER/eclipse-workspace/GenerarDatos/Ventas3.txt"), "utf-8"));
				
				
				String linea6="";//Declaración variable tipo string línea5 guarda temporalmente cada línea del archivo Ventas3.txt
				int numLinea6=0;//Contar nro de líneas del archivo Ventas3.txt
				
				/*Ciclo while permite leer con método readLine() el archivo Ventas3.txt que esta
				 *  almacenado en variable buffer6 linea por linea
				 *  hasta la que la última linea sea diferente null*/
				while((linea6=buffer6.readLine())!=null)
						
				{
					numLinea6++;//Incremento del nro de líneas de 1 en 1
					System.out.println(linea6);//imprimir el contenido de cada línea del archivo Ventas2.txt
					
				}
				//Mensaje de carga exitosa archivo Ventas3.txt
				System.out.println('\n'+"¡Archivo Ventas3.txt cargado con exito!");



	}//Cierre de Método main
	
}//Cierre de clase GenerateInfoFiles

//FIN DEL PROGRAMA PARA LEER ARCHIVOS DE ENTRADA .TXT