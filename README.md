<h3>EXPERIMENTO UNO</h3>

En una rama llamada “experimento-uno”, crea un único productor y un consumidor. El productor producirá cinco vegetales, y el consumidor los consumirá todos. Explica con tus palabras el funcionamiento del código, añadiendo las capturas que consideres oportunas. Finalmente, muestra una captura del output de la consola.

<h4>Funcionamiento del código: </h4>

<p>El programa se compone en <b>3 paquetes:</b></p>


<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-uno/imgs/projectStructure.png" alt="Estructura del proyecto"/>


1. El paquete **_Class_** que contiene las clases necesarias para el funcionamiento del programa; aquí nos encontramos con la Clase Orchard (Huerto) que actúa de recurso compartido.
2. El paquete _**Threads**_ donde se almacenan aquellas clases que son Thread; aquí nos encontramos con las Clases Farmer (Granjero) y Client (Cliente).
3. Por último, el paquete _**Utils**_ contiene a Utils.java que es un archivo donde se encuentran varias funcionalidades tales como un generador de numeros aleatorios y un generador de verduras aleatorias, para que el granjero las pueda plantar en el huerto.

A su vez, el archivo Main (encargado de ejecutar el código), tendrá inicializados los anteriores elementos:

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-uno/imgs/mainExecution.png" alt="Estructura del proyecto"/>

Una vez dicho esto el funcionamiento del código es sencillo. La clase Orchard es el Huerto en donde residen los vegetales, por lo que podemos ya decir que es una Colección, en este caso un ArrayList. El granjero será el encargado de plantar en este huerto unos vegetales, que, como es lógico, tienen un tiempo de crecimiento preestablecido (el valor es aleatorio, teniendo un máximo de tiempo preestablecido con anterioridad). Si un cliente intenta comprar una verdura y no hay todavía ninguna en el huerto, se quedará en espera y no será hasta que el granjero haya plantado completamente la verdura (es decir, la plante y crezca) que el Cliente podrá marcharse.

##### Salida Consola:

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-uno/imgs/consoleOutput.png" alt="Salida de la consola"/>

<p> Como se puede apreciar en la imagen, la salida de la consola es bastante emparejada, habiendo un producto por consumidor casi de manera instantánea. </p>

<br/>

[Siguiente punto (experimento-dos) :arrow_forward:](https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/tree/experimento-dos) 