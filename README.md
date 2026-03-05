# Ejercicio3Modularizacion

1️⃣ Identificación de Tareas Repetitivas

El programa realiza varias tareas dentro del metodo main. considero que estro lo vuelve dificil de mantenerlo, ya que los procesos principales que ejecuta el programa son: -Mostrar el estudiante conla calificacion mas alta, -mostrar el menu, -agregar estudiantes, -mostrar estudiantes, -calcular promedio de calificaciones, vemos que cada uno realiza tareas independientes por lo cual cada una de ellas puede ser un metodo independiente.
se tomaron en cuenta estos metodos: agregarEstudiante(), mostrarEstudiantes(), calcularPromedio(); mostrarMayorCalificacion(), mostrarMenu()

El dividir el codigo en los metodos mejora ell prograna porque organiza mejor el codigo, puedo reutulizar funciones, puedo modificar partes del programa sin comprometer otras atreas.

2️⃣ Variables Locales vs Globales
Responder:
¿Qué variables deberían declararse como globales (atributos static de la clase)?

considero que estas variables deberian ser globales pues se depende de ellas en todo el programa static List<String> estudiantes, static List<Double>calificaciones, static Scanner scanner.

¿Cuáles deberían ser locales dentro de un método?
¿Por qué?
double suma, double promedio, int opcion, estas variables las untilice en un metodo con un fin especifico y luego solo llame ese metodo para lo que no seran modificadas por algun otro metodo.

Reflexionar sobre:
-Alcance (scope)
tiene mucho que ver desde donde es llamada la variable esi esta se llema en toda la clase o solo en el metodo

Tiempo de vida de la variable
es muy diferente la manera en que funcionan ya que las globales se mantienen duuranta toda la ejecucuion del programa mientras que las locales solo mientras se ejecuta ese metodo.

-Riesgos de modificar datos globales accidentalmente
esto sucitaria si las variables son globales y algun o cualqueir metodo pueda realizarle esos cambios.

🏗️ Parte 2 – Modularización del Programa
utilice el metodo, un metodo = una responsabilidad

🔐 Parte 3 – Validaciones y Manejo de Excepciones
Implementar mejoras en el programa:

Validar entradas numéricas.
Evitar que el programa falle si el usuario ingresa texto en lugar de números.
Verificar que las calificaciones estén en un rango válido.
Usar try-catch cuando sea necesario.
Explicar en esta sección:

Parte 3 – Validaciones y Manejo de Excepciones

1️⃣ Validación de entradas numéricas
se entiende que el usuario puede ingresar tenxo en ves de numeros, por eso se utilizo try-catch pues puede pasar que el programa se cierre o algo asi,  
puede darse tambien que se produzca un error al no definir un rango de calificacion para se agrego de 0-100, si se ingresa un valor fuera de ese rango este mostrara error. Estos errores se pueden anticipar y dar solucion antes que este presente el problema dando una experiencia de uso mas comoda.

🧩 Parte 4 – Preguntas de Reflexión
Responder con sus propias palabras.

1️⃣ ¿Qué ventajas tiene dividir el código en métodos?
es un salto enorme en cuanto a administracion del programa se refiere, pues al momento de querer modificar una parte del codigo, sabemos exactamente a que area dirigirnos, incluso podemos reutilizar partes del godigo.

Reflexionar sobre:
Organización:
podemos ubicar el area del programa que queremos mas facilmente
Reutilización
esto nos dice que podemos reutilizar metodos ahorrandonos lineas de codigo
Mantenimiento.
es mucho mas facil reorganizar dentro de un metodo que en todo el programa.
Claridad: se sabe exactamente que realiza cada metodo ya que su funcionalidad es especifica.

2️⃣ ¿Por qué no es recomendable usar muchas variables globales?
Reflexionar sobre:

Posibilidad de errores inesperados: al ser una variable global, puede estar siendo afectada por un metodo x y no saber que lo esta ocacionando.
Dificultad para depurar: siguiendo esta misma linea o logica, puede que haya uno o varios metodos que esten modificando una unica variable y esta sea dificil de corregir.
Dependencia entre métodos: considero que al ser variable globar mas de uno metodo va a depender de ella y si esta es modificada o eliminada los demas metodos colapsan al no saber interpretar ese error

3️⃣ ¿Cómo mejora la modularización la legibilidad del código?
lo mas importante es que cuando se esta mas osganizado tiende a ser mas facil el saber que hace cada fragmento del codigo, lo que antes era una montaña de codigo, ahora este de fragmenta en secciones separadas mas pequeñas y con ello el codigo sea ms ordenado y organizado.



