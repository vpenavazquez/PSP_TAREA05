# Tarea 05 



---
## Ejercicio 1

## Tabla de Pruebas


| Valor | Salida de factor | Código de salida |
| :--- | :--- | :---: |
| **360** | `360: 2 2 2 3 3 5` | `0` |
| **1** | `1:` | `0` |
| **17** | `17: 17` | `0` |
| **hola** | `factor: 'hola' is not a valid positive integer` | `1` |
| **-5** | `factor: '-5' is not a valid positive integer` | `1` |

!![captura del proceso ej1.png](capturas/captura%20del%20proceso%20ej1.png)

---

## Error encontrado durante el desarrollo

* **Descripción del problema:** Al pasar del Nivel 1 al Nivel 4, el programa no podía detectar si el número introducido era primo o no, a pesar de que el comando `factor` se ejecutaba bien en la consola.
* **Causa del error:** En el Nivel 1 estaba utilizando la línea `n.inheritIO()`, lo cual redirige la salida del proceso de Linux directamente a la pantalla de la consola[cite: 1]. Al hacer esto, la salida no pasaba por el código de Java, por lo que era imposible leer el texto del resultado (`"17: 17"`) ni evaluarlo con condicionales.
* **Solución aplicada:** Eliminé la instrucción `n.inheritIO()` y pasé a capturar la salida del proceso mediante `InputStreamReader` y `BufferedReader` utilizando `proceso.getInputStream()`. De esta forma, pude almacenar la respuesta en una variable de texto, imprimirla por pantalla y comparar si el resultado coincidía con `numero + ": " + numero` para confirmar si era primo.

---

## Ejercicio 4

Ejemplo de ejecucion de si es primo o no

![ejemplo ejecucion ej4.png](capturas/ejemplo%20ejecucion%20ej4.png)