pregunta 1:

¿Por qué usar double para el precio y no int?

Porque el precio de un producto suele incluir centavos o fracciones decimales (ej. 3.50), y el tipo int solo puede almacenar números enteros sin decimales.

pregunta 2

¿Qué operador usaste para determinar si aplica el descuento?

use el operador relacional > (mayor que) para comparar si el subtotal supera el límite de $30.000.

pregunta 3 

¿En qué situación preferirías usar switch en lugar de una cadena de if-else?

Cuando tengo que comparar una sola variable contra varias opciones fijas y exactas (como las letras 'B', 'F', 'C', 'P'). Queda muchísimo más ordenado y fácil de leer que llenar el código de un montón de if y else if.

¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?

Si me pidieran evaluar rangos (por ejemplo, si el precio está entre $10.000 y $20.000) o meter condiciones combinadas con && o ||. Ahí el switch normal no sirve bien y sí o sí toca usar if-else.

pregunta 4 

¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este
caso?

se haria un blugle infinito, lo preveni poniendole al final una parte que le reste cafemolido -= 2;
