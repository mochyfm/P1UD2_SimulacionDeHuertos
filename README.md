<h3>EXPERIMENTO TRES</h3>

En una rama llamada “experimento-tres”, establece prioridades más altas para los hilos de los productores. ¿El resultado es similar al caso en el que hacemos los tiempos de producción más cortos? Muestra una captura del output de la consola.    

Para este apartado, el requisito a cambiar únicamente es la prioridad del productor y el cliente, el resultado es muy similar al que nos encontramos en el primer experimento, pero antes de llegar al resultado, deberemos ver donde se establece dicha prioridad:

##### Cliente

<image src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-tres/imgs/clientPriority.png" alt="Nivel de prioridad del Thread (1)"/>

##### Granjero

<image src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-tres/imgs/farmerPriority.png" alt="Nivel de prioridad del Thread (10)"/>

Una vez le establecemos la prioridad, podemos ver el resultado:


<image src="https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/blob/experimento-tres/imgs/consoleOutput.png" alt="Resultado por consola"/>

Como se puede apreciar, el resultado es exactamente igual al que tenemos en el [experimento-uno](https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/tree/experimento-uno), con la diferencia en que el proceso del granjero tendra siempre la hortaliza creada antes que el cliente la compra, es decir. La prioridad asigna a nivel de programa (no a nivel de S.O) una ejecución prioritaria, esto hará que el granjero siempre se ejecute antes que el cliente, aun habiendo previamente verduras en el huerto que el cliente pueda comprar.

[Anterior punto (experimento-dos) :arrow_backward:](https://github.com/mochyfm/P1UD2_SimulacionDeHuertos/tree/experimento-dos) 