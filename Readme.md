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

![captura del proceso ej1.png](../capturas/captura%20del%20proceso%20ej1.png)


---

## Solución a un error durante el desarrollo

* **Problema:** Al probar la llamada al comando `factor` con `ProcessBuilder`, la salida del proceso de Linux no se mostraba por pantalla en la consola.
* **Causa:** El proceso se estaba ejecutando en otro flujo asi que la consola no lo conseguia capturar.
* **Solución:** Tuve que poner `n.inheritIO()` dentro de la clase `Lanzador` antes de iniciar el proceso asi la consola logra capturar el proceso.