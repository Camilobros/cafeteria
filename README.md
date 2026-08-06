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

pregunta 5

¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
el orden de ejecución.

Porque el do-while asegura que el código se ejecute al menos una vez antes de validar la condición, mientras que el while primero revisa la condición y si no se cumple desde el inicio, nunca entra. Para un menú o pedir datos, siempre necesitas pedir el dato al menos una primera vez antes de saber si es correcto o no.


pregunta 6
¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
lógico? ¿Cómo los distingues?

Uso for porque ya sé exactamente cuántos elementos tienen los arreglos (productos.length). El for es mucho más conveniente porque me permite declarar el contador, la condición y el incremento en una sola línea. Con un while tendría que armar la variable por fuera y acordarme de sumarle al contador abajo para no tirar un bucle infinito, lo que termina haciendo el código más largo y desordenado.



