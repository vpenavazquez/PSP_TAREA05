import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        // Objeto scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);

        // Objeto lanazador para ejecutar el comando
        Lanzador lanzador = new Lanzador();

        // Bucle infinito para que se repita hasta que lo quiera el usuario
        while(true){
            System.out.println("Introduce un numero o 'Salir' para cerrar el programa: ");

            // Leemos lo que escriba el usuario
            String numero = scanner.nextLine();


            // if para la decision de salir
            if(numero.equalsIgnoreCase("salir")){
                System.out.println("Cerrando...");
                break;
            }

            // Bloque para devolver el codigo devuelto por el lanzador
            int respuesta = lanzador.ejecutarFactor(numero);
            System.out.println("Codigo de salida: " + respuesta);
        }

        scanner.close();
    }
}
