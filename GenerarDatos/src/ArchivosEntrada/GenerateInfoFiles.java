/**
 * Programa que Crea el contenido de los archivos de entreda .txt
 * Dónde está la información de vendedores, productos y ventas
 *  @author Integrantes Subgrupo 14 
 * - Adriana Cortes Naranjo
 * - Stiven Alejandro Rios Lopez
 * - Carlos Mario Loaiza Castaño
 * - Laura Natalia Forrero Torres
 * @version 1.0
*/
//INICIO DEL PROGRAMA PARA LEER  ARCHIVOS DE ENTRADA .TXT
//Nombre del paquete "ArchivosEntrada" donde está la clase GenerateInfoFiles y main
package ArchivosEntrada; 

//Se Comienza a importar las clases y bibliotecas necesarias que se utilizarán en el programa
	/** 
	 * @class BufferedWriter esta clase escribe texto de un flujo de salida de caracteres, 
	 * almacenar los caracteres para proporcionar una lectura eficiente de caracteres, matrices y líneas 
	 */ 
	import java.io.BufferedWriter;
	import java.io.FileWriter;//Clase que permirte realiza escritura de caracteres de texto sobre un fichero 
	import java.io.IOException;//Clase que permite detectar errores al abrir archivos inexistentes
//finaliza la importación de clases y bibliotecas

	/**
	 * Esta @class GenerateInfoFiles es donde vamos a generar la información de los
	 * 3 archivos de entrada para ejecutar los reportes en la clase main
	 *  Productos.txt, Vendedores.txt y Ventas.txt
	 */
	public class GenerateInfoFiles {

		//Método main de la clase GenerateInfoFiles
		
	    public static void main(String[] args) {
	        // Lógica para generar los archivos de información pseudoaleatoria
	        try {        	           
	            // Llamar a los métodos para generar los archivos requeridos
	            createSalesMenFile(1); //Genera salesmen_info.txt información ventas de vendedor CC 50906010 
	            createSalesMenFile1(1);//Genera salesmen_info1.txt información ventas de vendedor CC 90320001 
	            createSalesMenFile2(1);//Genera salesmen_info2.txt información ventas de vendedor CE 200120
	            createSalesMenFile3(1);//Genera salesmen_info3.txt información ventas de vendedor TI 1054000568
	            createSalesMenFile4(1);//Genera salesmen_info3.txt información ventas de vendedor PT 14151617 
	            createProductsFile(1); // Ejemplo: Generar información para 1 producto
	            createSalesManInfoFile(1); // Ejemplo: Generar información para 1 vendedor
	            System.out.println("Archivos de entrada txt generados con éxito.");
	            
	          //IOException capturan excepciones al crear los archivos .txt de entrada 
	        } catch (IOException e) {
	            System.err.println("Error al generar los archivos: " + e.getMessage());
	            e.printStackTrace(); // Imprime detalles de la excepción
	        }
	    }

	    //Método para generararchivo de ventas vendedor CC 50906010 con información pseudoaleatoria
	    private static void createSalesMenFile(int randomSalesCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info.txt"))) {
	            for (int i = 0; i < randomSalesCount; i++) {
	               
	                String salesInfo = generateSalesInfo(); // Método para generar información de ventas
	                writer.write(salesInfo); // Escribir información de ventas en el archivo
	                writer.newLine(); // Ir a la siguiente línea en el archivo
	            }
	        }
	    }
	    
	    //Método para generararchivo de ventas vendedor CC 90320001 con información pseudoaleatoria
	    private static void createSalesMenFile1(int randomSalesCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info1.txt"))) {
	            for (int i = 0; i < randomSalesCount; i++) {
	               
	                String salesInfo = generateSalesInfo1(); // Método para generar información de ventas
	                writer.write(salesInfo); // Escribir información de ventas en el archivo
	                writer.newLine(); // Ir a la siguiente línea en el archivo
	            }
	        }
	    }
	    
	  //Método para generararchivo de ventas vendedor CE 200120 con información pseudoaleatoria
	    private static void createSalesMenFile2(int randomSalesCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info2.txt"))) {
	            for (int i = 0; i < randomSalesCount; i++) {
	               
	                String salesInfo = generateSalesInfo2(); // Método para generar información de ventas
	                writer.write(salesInfo); // Escribir información de ventas en el archivo
	                writer.newLine(); // Ir a la siguiente línea en el archivo
	            }
	        }
	    }
	    
	  //Método para generararchivo de ventas vendedor TI 1054000568 con información pseudoaleatoria
	    private static void createSalesMenFile3(int randomSalesCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info3.txt"))) {
	            for (int i = 0; i < randomSalesCount; i++) {
	               
	                String salesInfo = generateSalesInfo3(); // Método para generar información de ventas
	                writer.write(salesInfo); // Escribir información de ventas en el archivo
	                writer.newLine(); // Ir a la siguiente línea en el archivo
	            }
	        }
	    }
	    
	  //Método para generararchivo de ventas vendedor PT 14151617 con información pseudoaleatoria
	    private static void createSalesMenFile4(int randomSalesCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info4.txt"))) {
	            for (int i = 0; i < randomSalesCount; i++) {
	               
	                String salesInfo = generateSalesInfo4(); // Método para generar información de ventas
	                writer.write(salesInfo); // Escribir información de ventas en el archivo
	                writer.newLine(); // Ir a la siguiente línea en el archivo
	            }
	        }
	    }


	    // Método para generar un archivo con información pseudoaleatoria de productos
	    private static void createProductsFile(int productsCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products_info.txt"))) {
	            for (int i = 0; i < productsCount; i++) {
	               
	                String productInfo = generateProductInfo(); // Método para generar información de productos
	                writer.write(productInfo); // Escribir información de productos en el archivo
	                writer.newLine();
	            }
	        }
	    }

	    // Método para generar un archivo con información pseudoaleatoria de vendedores
	    private static void createSalesManInfoFile(int salesmanCount) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesman_info.txt"))) {
	            for (int i = 0; i < salesmanCount; i++) {
	               
	                String salesmanInfo = generateSalesmanInfo(); // Método para generar información de vendedores
	                writer.write(salesmanInfo); // Escribir información de vendedores en el archivo
	                writer.newLine();
	            }
	        }
	    }

	    // Método para generar información pseudoaleatoria de ventas
	    private static String generateSalesInfo() {
	    	
	    	// Devuelve una cadena de texto de las ventas vendedor CC 50906010 Con la estructura
	    	//Línea 1 TipoDocumentoVendedor;NúmeroDocumentoVendedor
	    	//Linea 2 en adelante IDProducto;CantidadProductoVendido
	        return	"CC;50906010\n"+ 
	        		"10;5\n" +
	                "11;12\n" +
	                "12;8\n" +
	                "13;25\n" + 
	                "14;15\n" + 
	                "15;30\n" + 
	                "16;24\n" + 
	                "17;2\n" + 
	                "18;7\n" +
	                "19;45";        
	    }
	    
	    private static String generateSalesInfo1() {
	    	
	    	// Devuelve una cadena de texto de las ventas vendedor CC 90320001 Con la estructura
	    	//Línea 1 TipoDocumentoVendedor;NúmeroDocumentoVendedor
	    	//Linea 2 en adelante IDProducto;CantidadProductoVendido
	        return	"CC;90320001\n"+ 
	        		"10;8\n" +
	                "11;5\n" +
	                "12;15\n" +
	                "13;35\n" + 
	                "14;40\n" + 
	                "15;13\n" + 
	                "16;7\n" + 
	                "17;17\n" + 
	                "18;27\n" +
	                "19;23";        
	    }
	    
	    private static String generateSalesInfo2() {
	    	
	    	// Devuelve una cadena de texto de las ventas vendedor CE 200120 Con la estructura
	    	//Línea 1 TipoDocumentoVendedor;NúmeroDocumentoVendedor
	    	//Linea 2 en adelante IDProducto;CantidadProductoVendido
	        return	"CE;200120\n"+ 
	        		"12;8\n" +
	                "13;25\n" + 
	                "14;15\n" + 
	                "18;7\n" +
	                "19;45";        
	    }
	    
	    private static String generateSalesInfo3() {
	    	
	    	// Devuelve una cadena de texto de las ventas vendedor TI 1054000568 Con la estructura
	    	//Línea 1 TipoDocumentoVendedor;NúmeroDocumentoVendedor
	    	//Linea 2 en adelante IDProducto;CantidadProductoVendido
	        return	"TI;1054000568\n"+ 
	        		"14;15\n" + 
	        		"15;55\n" + 
	                "16;24\n" +
	                "19;100";        
	    }
	    
	    private static String generateSalesInfo4() {
	    	
	    	// Devuelve una cadena de texto de las ventas vendedor PT 14151617 Con la estructura
	    	//Línea 1 TipoDocumentoVendedor;NúmeroDocumentoVendedor
	    	//Linea 2 en adelante IDProducto;CantidadProductoVendido
	        return	"PT;14151617\n"+ 
	        		"10;90\n" +
	                "11;122\n" +
	                "12;88\n" +
	                "13;74\n" + 
	                "14;150\n" + 
	                "15;300\n" + 
	                "16;240\n" + 
	                "17;25\n" + 
	                "18;89\n" +
	                "19;450";        
	    }
	    
	    // Método para generar información pseudoaleatoria de productos
	    private static String generateProductInfo() {
	    	
	    	// Devuelve una cadena de texto de los productos
	    	//Con la estructura IDProducto;NombreProducto;PrecioPorUnidadProducto
	        return "10;NARANJA;500\n"+ 
	        	   "11;PIÑA;2500\n" +
	        	   "12;MANGO;1200\n" +
	        	   "13;FRESA;300\n"+
	        	   "14;UVA;200\n" +
	        	   "15;SANDIA;5000\n" +
	        	   "16;PAPAYA;3000\n" + 
	        	   "17;LIMON;800\n" +
	        	   "18;MANDARINA;700\n" + 
	        	   "19;MORA;100";	        
	    }
	    
	    // Método para generar información pseudoaleatoria de vendedores
	    private static String generateSalesmanInfo() {
	    	
	    	// Devuelve una cadena de texto de los datos de los vendedores
	    	//Con la estructura TipoDocumento;NúmeroDocumento;NombreVendedor;ApellidosVendedor
	        return 	"CC;90320001;EMILIO;RESTREPO\n" +
	        		"TI;1054000567;DORIS;ZULUAGA\n" +
	        		"CC;25600230;BEATRIZ;LEON\n" + 
	        		"CE;200120;DUVAN;QUINTERO\n" + 
	        		"CC;30204051;LILIANA;BAHAMON\n" + 
	        		"PT;14151617;OSCAR;VILLEGAS\n" + 
	        		"CC;50906010;JULIANA;MORENO\n" + 
	        		"CC;90320002;CESAR;MOLINA\n" +
	        		"TI;1054000568;NATALIA;RIOS\n" +
	        		"CC;30204050;CLAUDIA;BOTERO";	        
	    

	}//Cierre de Método main
	
}//Cierre de clase GenerateInfoFiles

//FIN DEL PROGRAMA PARA CREAR ARCHIVOS DE ENTRADA .TXT