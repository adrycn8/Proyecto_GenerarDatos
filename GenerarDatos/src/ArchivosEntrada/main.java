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

/** 
* @class BufferedReader esta clase lee texto de un flujo de entrada de caracteres, 
* almacenar los caracteres para proporcionar una lectura eficiente de caracteres, matrices y líneas 
*/ 
import java.io.BufferedReader;
/** 
* @class BufferedWriter esta clase escribe texto de un flujo de salida de caracteres, 
* almacenar los caracteres para proporcionar una lectura eficiente de caracteres, matrices y líneas 
*/ 
import java.io.BufferedWriter;
import java.io.FileReader;//Clase para leer archivo de caracteres
import java.io.FileWriter;//Clase que permirte realiza escritura de caracteres de texto sobre un fichero 
import java.io.IOException;//Clase que permite detectar errores al abrir archivos inexistentes
import java.util.ArrayList;//Clase permite almacenar datos en memoria de forma dinámica similar a los Arrays
import java.util.Collections;//Clase que opera o devuelve colecciones 
import java.util.Comparator;//Clase para métodos de oredenamiento
import java.util.HashMap;//Implementación de Map de Java
import java.util.List;//Clase para estructuras de datos para organizar elementeos de manera secuencial
import java.util.Map;//Aplicar una función dada a cada elemento de una colección y devolver una coleccion con resultados

/**
* Clase principal que contiene el método main para ejecutar el programa. 
* Esta clase es responsable de iniciar la aplicación y coordinar las operaciones 
* de generación de informes a partir de los archivos de entrada.
*/
public class main {
    
    public static void main(String[] args) {
        //Punto de entrada del codigo del programa
        try {
            // Código que puede lanzar una excepción
            // Crear informe de vendedores
            createSalesReport("salesman_info.txt");

            // Crear informe de productos vendidos
            createProductReport("salesmen_info.txt");

            // Crear informe de productos
            createProductInfoReport("products_info.txt");
            
            //Imprime un mensaje en la consola indicando que los archivos de reporte se han generado con éxito
            System.out.println("Archivos de reporte generados con éxito.");
            
            //Indica si hay algun error al generar el reporte del archivo
        } catch (IOException e) {
            System.err.println("Error al generar los archivos de reporte: " + e.getMessage());
            e.printStackTrace(); // Imprime detalles de la excepción
        }
    }

    // Método para crear el informe de vendedores
    private static void createSalesReport(String salesmenFile) throws IOException {
        //Cada entrada representa un vendedor y el total de sus ventas.
        Map<String, Double> salesBySalesman = new HashMap<>();
        
        //Permite leer el archivo línea por línea de manera eficiente
        try (BufferedReader reader = new BufferedReader(new FileReader(salesmenFile))) {
            String line;
             //Este ciclo lee cada línea del archivo de texto mientras haya líneas disponibles para leer 
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String salesmanName = parts[2] + " " + parts[3];

                //Esta variable se utilizará para calcular el total de ventas de un vendedor.
                double totalSales = calculateTotalSales(parts);
                salesBySalesman.put(salesmanName, totalSales);
            }
        }

        // Ordenar el mapa por el valor (monto de ventas)
        List<Map.Entry<String, Double>> sortedSales = new ArrayList<>(salesBySalesman.entrySet());
        Collections.sort(sortedSales, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // Escribir el informe de vendedores en el archivo
        //Facilita la escritura eficiente de grandes cantidades de datos 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sales_report.csv"))) {
            //Cada entrada representa un vendedor y el total de sus ventas. 
            for (Map.Entry<String, Double> entry : sortedSales) {
                writer.write(entry.getKey() + ";" + entry.getValue());
                writer.newLine();
            }
        }
    }

    // Método para calcular el total de ventas de un vendedor
    private static double calculateTotalSales(String[] salesInfo) {
        double totalSales = 0; //Calcula ventas totales de un vendedor
        for (int i = 4; i < salesInfo.length; i += 2) { //Representa el ID del producto y la cantidad vendida.
            totalSales += Integer.parseInt(salesInfo[i]) * Integer.parseInt(salesInfo[i + 1]);
        }
        return totalSales;//Contiene la suma acumulada de todas las ventas realizadas
    }

    // Método para crear el informe de productos vendidos
    private static void createProductReport(String salesFile) throws IOException {
        //Este mapa se utiliza para generar informes sobre los productos vendidos.
        Map<String, Integer> productsSold = new HashMap<>();
        
        //Permite leer el archivo línea por línea de manera eficiente.
        try (BufferedReader reader = new BufferedReader(new FileReader(salesFile))) {
            String line;
             //Comprueba si no es nula para continuar con la lectura
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                
                 //Cada iteración aumenta i en 2 para avanzar al siguiente par de elementos
                for (int i = 4; i < parts.length; i += 2) {
                    String productId = parts[i];
                    //Convierte y almacena la cantidad de la variable
                    int quantitySold = Integer.parseInt(parts[i + 1]);
                    productsSold.put(productId, productsSold.getOrDefault(productId, 0) + quantitySold);
                }
            }
        }

        // Ordenar el mapa por la cantidad de productos vendidos (descendente)
        List<Map.Entry<String, Integer>> sortedProducts = new ArrayList<>(productsSold.entrySet());
        Collections.sort(sortedProducts, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // Escribir el informe de productos vendidos en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("product_report.csv"))) {
            for (Map.Entry<String, Integer> entry : sortedProducts) {
                writer.write(entry.getKey() + ";" + entry.getValue());
                writer.newLine();
            }
        }
    }
    
    // Método para crear el informe de información de productos
    private static void createProductInfoReport(String productsFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(productsFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter("product_info_report.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line); // Copiar la línea tal cual al nuevo archivo
                writer.newLine();
            }
        }
    }
}

