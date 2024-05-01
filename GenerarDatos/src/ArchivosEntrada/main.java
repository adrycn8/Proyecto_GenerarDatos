/**
 * Programa que leerá el contenido de los archivos de entreda .txt
 * Dónde está la información de vendedores, productos y ventas y generará
 * los reportes solicitados
 *  @author Integrantes Subgrupo 14 
 * - Adriana Cortes Naranjo
 * - Stiven Alejandro Rios Lopez
 * - Carlos Mario Loaiza Castaño
 * - Laura Natalia Forrero Torres
 * @version 1.0
*/
//INICIO DEL PROGRAMA 
//Nombre del paquete "ArchivosEntrada" donde está la clase GenerateInfoFiles y main
package ArchivosEntrada; 

import java.io.BufferedReader;//Se Comienza a importar las clases y bibliotecas necesarias que se utilizarán en el programa 
import java.io.BufferedWriter;//Se utiliza para escribir texto en una secuencia de salida 
import java.io.FileReader;// Proporciona métodos para leer caracteres individuales, matrices de caracteres y líneas completas de texto de un archivo. 
import java.io.FileWriter; //Permite escribir datos en un archivo de manera secuencial 
import java.io.IOException;//Clase que permite detectar errores al abrir archivos inexistentes 
import java.util.HashMap;//Proporciona un acceso rápido y eficiente a los elementos almacenados 
import java.util.Map;//Permiten almacenar y recuperar datos en una interfaz que define un contrato.  

/**
* Clase principal que contiene el método main para ejecutar el programa. 
* Esta clase es responsable de iniciar la aplicación y coordinar las operaciones 
* de generación de informes a partir de los archivos de entrada.
*/
public class main {
    
    public static void main(String[] args) { //Punto de entrada del codigo del programa
        try {
        	// Código que puede lanzar una excepción 
            generateSalesReports();
            generateProductReport("products_info.txt");
            System.out.println("Archivos de reporte generados con éxito.");
        } catch (IOException e) { //Imprime un mensaje en la consola indicando que los archivos de reporte se han generado con éxito 

        	 
         System.err.println("Error al generar los archivos de reporte: " + e.getMessage());
            e.printStackTrace(); // Imprime detalles de la excepción  
        }
    }
 // Método para crear el informe de vendedores  
    private static void generateSalesReports() throws IOException {
        for (int i = 1; i <= 5; i++) { // Itera sobre los números del 1 al 5, incrementando el valor de i en cada iteración
            String fileName = "salesmen_info" + i + ".txt";
            String reportFileName = "sales_report" + i + ".csv";
            createSalesReport(fileName, reportFileName);
        }
    }

    private static void createSalesReport(String fileName, String reportFileName) throws IOException { // Método para crear el informe de vendedores  
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)); //Permite leer el archivo línea por línea de manera eficiente 
             BufferedWriter writer = new BufferedWriter(new FileWriter(reportFileName))) {
            String line;
            while ((line = reader.readLine()) != null) { //Este bucle lee cada línea del archivo de texto mientras haya líneas disponibles para leer  
                if (line.startsWith("TipoDeDocumento")) { // Verifica si la línea comienza con "TipoDeDocumento"
                    continue; // Saltar la primera línea de encabezado
                }
                String[] parts = line.split(";"); // Divide la línea en partes usando el delimitador ";"
                String documentType = parts[0]; // Obtiene el tipo de documento de la primera parte
                String documentNumber = parts[1]; // Obtiene el número de documento de la segunda parte

                // Lee cada línea del archivo mientras no sea nula y no esté vacía
                while ((line = reader.readLine()) != null && !line.isEmpty()) {
                    String[] saleInfo = line.split(";"); // Divide la línea de información de venta en partes usando el delimitador ";"
                    String productId = saleInfo[0]; // Obtiene el ID del producto de la primera parte
                    String salesCount = saleInfo[1]; // Obtiene el conteo de ventas de la segunda parte
                    
                    // Escribe la información del documento y la venta en el archivo
                    writer.write(documentType + ";" + documentNumber + ";" + productId + ";" + salesCount);
                    writer.newLine(); // Avanza a la siguiente línea en el archivo de salida
                }
            }
        }
    }

    private static void generateProductReport(String fileName) throws IOException {
        // Crea un mapa para almacenar las ventas de productos
        Map<String, Integer> productSales = new HashMap<>();
        
        // Lee el archivo de productos
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Itera sobre cada línea del archivo
            while ((line = reader.readLine()) != null) {
                // Si la línea comienza con "IDProducto", pasa a la siguiente línea
                if (line.startsWith("IDProducto")) {
                    continue; 
                }
                // Divide la línea en partes usando el delimitador ";" y obtiene el ID del producto
                String[] parts = line.split(";");
                String productId = parts[0];
                // Lee las siguientes líneas hasta encontrar una línea vacía o el final del archivo
                while ((line = reader.readLine()) != null && !line.isEmpty()) {
                    // Aquí se podría incluir lógica adicional para procesar información de ventas
                }
                // Establece las ventas iniciales en 0 para cada producto en el mapa
                productSales.put(productId, 0); 
            }
        }
        
        // Escribe el informe de productos en un archivo CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("product_report.csv"))) {
            // Escribe la cabecera del archivo CSV
            writer.write("IDProducto;Producto;TotalVentas");
            writer.newLine();
            // Itera sobre el mapa de ventas de productos y escribe cada entrada en el archivo CSV
            for (Map.Entry<String, Integer> entry : productSales.entrySet()) {
                writer.write(entry.getKey() + ";" + getProductInfo(entry.getKey()) + ";" + entry.getValue());
                writer.newLine();
            }
        }
    }

    // Método para obtener información de un producto dado su ID
    private static String getProductInfo(String productId) throws IOException {
        // Lee el archivo "products_info.txt" para obtener información del producto
        try (BufferedReader reader = new BufferedReader(new FileReader("products_info.txt"))) {
            String line;
            // Itera sobre cada línea del archivo
            while ((line = reader.readLine()) != null) {
                // Divide la línea en partes usando el delimitador ";" y compara el ID del producto
                String[] parts = line.split(";");
                if (parts[0].equals(productId)) {
                    // Si se encuentra el ID del producto, devuelve su información
                    return parts[1];
                }
            }
        }
        // Si no se encuentra el ID del producto, devuelve "Unknown"
        return "Unknown";
		}
	}

