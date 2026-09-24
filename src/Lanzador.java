import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {

    public int ejecutarFactor(String numero) {
        try {
            // Creando el comando Factor
            ProcessBuilder n = new ProcessBuilder("factor", numero);

            // Empieza el proceso
            Process proceso = n.start();

            // Leemos la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String salida = reader.readLine();

            // Imprimimos la salida de factor
            if (salida != null) {
                System.out.println(salida);

                // Comprobación de primo con numero : numero
                String esPrimo = numero + ": " + numero;
                if (salida.trim().equals(esPrimo)) {
                    System.out.println("¡" + numero + " es primo!");
                } else {
                    System.out.println(numero + " no es primo");
                }
            }

            // Leemos también la salida de error por si introducen texto o números no válidos
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
            String error = errorReader.readLine();
            if (error != null) {
                System.out.println(error);
            }

            // Espera a que acabe y devuelve 0 o 1
            return proceso.waitFor();

            // Bloque de errores de ProcessBuilder
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al ejecutar proceso: " + e.getMessage());
            return 1;
        }
    }
}