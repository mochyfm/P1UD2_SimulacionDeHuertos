### EXPERIMENTO DOS

<br/>

<p>En una rama llamada <i>experimento-dos</i>, cambia los parámetros de tiempo de producción y hazlos más cortos que los del tiempo en el que el cliente consume los productos. Muestra una captura del output de la consola. ¿Observas algún cambio en la salida?<p>

Para poder realizar esta sección, he realizado una alteración en el tiempo que posee cada uno.

<h4>Anterior tiempo</h4>

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-dos/imgs/oldTime.png" alt="Anterior Tiempo" />

<h4>Nuevo tiempo</h4>

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-dos/imgs/newTime.png" alt="Nuevo Tiempo" />

<p>El resultado es el siguiente: </p>

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-dos/imgs/consoleOutput_1.png" alt="Resultado de la consola 1." />

<img src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-dos/imgs/consoleOutput_2.png" alt="Resultado de la consola 2." />

<h3> Conclusión </h3>

<p>Lo que ocurre es que, a diferencia de lo que ocurría con el <i>experimento-uno</i>, en este caso el Cliente no llega a consumir los productos hasta que el Granjero produzca unas cuantas verduras. ¿A qué se debe esto?, pues simple, al Granjero tener un tiempo de crecimiento tan pequeño, tarda menos en plantar los vegetales y que estos crezcan haciendo que el Scheduler le asigne una prioridad mayor para que según entre salga antes, mientras que el cliente entrará en algun punto de entre medias cuando el Scheduler vea que lleva mucho tiempo esperando. </p>

<b>EJEMPLO:</b><i> Es como si pusiesemos como simil en la vida real, cuando estas en la cola del super y dejas pasar a la gente que tienes menos compra, si dejas pasar mucha gente con poca compra el cajero te dira que pases tu para que tambien puedas salir.</i>

[Anterior punto (experimento-uno) :arrow_backward:](https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/tree/experimento-uno) <br/>
[Siguiente punto (experimento-tres) :arrow_forward:](https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/tree/experimento-tres) 