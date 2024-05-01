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
	import java.io.BufferedWriter;// Importa la clase BufferedWriter del paquete java.io
	import java.io.FileWriter;// Importa la clase FileWriter del paquete java.io
	import java.io.IOException;// Importa la clase IOException del paquete java.io
	//finaliza la importación de clases y bibliotecas

	/**
	 * Esta @class GenerateInfoFiles es donde vamos a generar la información de los
	 *  archivos de entrada txt con datos de Productos, Vendedores y Ventas
  	 *  para ejecutar los reportes en la clase main
	 */
	public class GenerateInfoFiles { // Aquí se pueden definir variables miembro, métodos y constructores

    /**
     * Método principal para ejecutar la generación de archivos.
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) { // Aquí se puede colocar la lógica para iniciar el programa
        try {        	
            // Llamar a los métodos para generar los archivos requeridos
            createSalesMenFile1(1);
            createSalesMenFile2(1);
            createSalesMenFile3(1);
            createSalesMenFile4(1);
            createSalesMenFile5(1);
            createProductsFile(1);
            createSalesManInfoFile(1);
            System.out.println("Archivos generados con éxito."); // Imprime un mensaje indicando que los archivos se generaron con éxito
        } catch (IOException e) {   // Captura cualquier excepción de tipo IOException que ocurra durante la ejecución del bloque try
            System.err.println("Error al generar los archivos: " + e.getMessage());// Captura y maneja cualquier excepción de tipo IOException que ocurra durante la generación de archivos
            e.printStackTrace(); // Imprime detalles de la excepción
        }
    }

    /**
     * Método para generar un archivo de ventas de un vendedor con información pseudoaleatoria.
     * @param randomSalesCount Número de ventas pseudoaleatorias a generar.
     * @throws IOException Si hay un error de E/S al escribir en el archivo.
     */
    private static void createSalesMenFile1(int randomSalesCount) throws IOException {// Aquí se coloca la lógica para crear el archivo de información de vendedores
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen_info1.txt"))) { // Abre un flujo de escritura hacia el archivo "salesmen_info1.txt" utilizando BufferedWriter y FileWriter
            for (int i = 0; i < randomSalesCount; i++) { // Aquí se colocaría la lógica para generar y escribir información de ventas para cada iteración del bucle
                String salesInfo = generateSalesInfo1(); // Generar información de ventas pseudoaleatoria
                writer.write(salesInfo); // Escribir información de ventas en el archivo
                writer.newLine(); // Ir a la siguiente línea en el archivo
            }
        }
    }
    
    // Resto de los métodos createSalesMenFile2, createSalesMenFile3, etc...

    /**
     * Método para generar un archivo con información pseudoaleatoria de productos.
     * @param productsCount Número de productos pseudoaleatorios a generar.
     * @throws IOException Si hay un error de E/S al escribir en el archivo.
     */
    private static void createProductsFile(int productsCount) throws IOException { // Aquí se coloca la lógica para crear el archivo de productos
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products_info.txt"))) {// Aquí se coloca la lógica para escribir en el archivo
            for (int i = 0; i < productsCount; i++) {  // Aquí se colocaría la lógica para generar y escribir información de productos para cada iteración del bucle
                String productInfo = generateProductInfo(); // Generar información de productos pseudoaleatoria
                writer.write(productInfo); // Escribir información de productos en el archivo
                writer.newLine(); // Ir a la siguiente línea en el archivo
            }
        }
    }

    /**
     * Método para generar un archivo con información pseudoaleatoria de vendedores.
     * @param salesmanCount Número de vendedores pseudoaleatorios a generar.
     * @throws IOException Si hay un error de E/S al escribir en el archivo.
     */
    private static void createSalesManInfoFile(int salesmanCount) throws IOException { // Aquí se coloca la lógica para crear el archivo de información de vendedores
    }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesman_info.txt"))) {  // Aquí se coloca la lógica para escribir en el archivo
        }
            for (int i = 0; i < salesmanCount; i++) { // Aquí se colocaría la lógica para generar y escribir información de vendedores para cada iteración del bucle
            }
                String salesmanInfo = generateSalesmanInfo(); // Generar información de vendedores pseudoaleatoria
                writer.write(salesmanInfo); // Escribir información de vendedores en el archivo
                writer.newLine(); // Ir a la siguiente línea en el archivo
            }
        }
    }

    /**
     * Método para generar información pseudoaleatoria de ventas para el vendedor 1.
     * @return Información de ventas pseudoaleatoria.
     */
    private static String generateSalesInfo1() {
        // Devuelve una cadena de texto de ventas pseudoaleatorias para el vendedor 1
        return "TipoDeDocumento;NúmeroDeDocumentoVendedor\n" +
                "CC;90320001\n"+ 
                "IDProducto;NúmeroDeVentas\n" +
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
    
    // Resto de los métodos generateSalesInfo2, generateSalesInfo3, etc...

    /**
     * Método para generar información pseudoaleatoria de productos.
     * @return Información de productos pseudoaleatoria.
     */
    private static String generateProductInfo() {
        // Devuelve una cadena de texto de productos pseudoaleatorios
        return "IDProducto;Producto;PrecioProducto\n" +
               "10;NARANJA;500\n"+ 
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
    
    /**
     * Método para generar información pseudoaleatoria de vendedores.
     * @return Información de vendedores pseudoaleatoria.
     */
    private static String generateSalesmanInfo() {
        // Devuelve una cadena de texto de información pseudoaleatoria de vendedores
        return "TipoDocumento;NúmeroDocumento;NombresVendedor;ApellidosVendedor\n" +
               "CC;90320001;EMILIO;RESTREPO\n" +
               "TI;1054000567;DORIS;ZULUAGA\n" +
               "CC;25600230;BEATRIZ;LEON\n" + 
               "CE;200120;DUVAN;QUINTERO\n" + 
               "CC;30204051;LILIANA;BAHAMON\n" ;	        
	    

	}//Cierre de Método main
	
}//Cierre de clase GenerateInfoFiles
//FIN DEL PROGRAMA PARA CREAR ARCHIVOS DE ENTRADA .TXT
