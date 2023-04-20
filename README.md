# Preguntas de laboratorios

## Laboratorio 04
##### 2. ¿Menciona los tipos de intents que existen y un ejemplo de cada uno?
Intents Explicitos: Los Intents Explicitos se utiliza para iniciar un componente dentro de la aplicacion, como por ejemplo una actividad.
Intents Implicitos: Los Intents Implicitos se utilizan para realizar una acción que puede invocar cualquier aplicación en un mismo dispositivo, como la opcion de compartir archivos a otras aplicaciones. 
##### 3. ¿En que estado de la aplicacion se inicializan las variables y se crea la vista?
En el estado OnCreate(), cuando se crea la actividad

## Laboratorio 05 
##### 1. ¿Qué diferencia existe entre navegar dentro de la aplicación utilizando Navigation Component o hacer uso de intents?
Una diferencia crucial es que para utilizar navigation component hay que implementar una dependencia dentro de Gradle mientras que para usar intents no es necesario implementar nada. 

##### 2. Menciona los componentes fundamentales de Navigation Component
Existen 3 componentes fundamentales: nav_graph, navhost y navController. El nav_graph sirve para conectar cada fragment entre ellos para la navegacion, el navhost designa a la pantalla que va a mostrar las diferentes pantallas enlazadas en el nav_graph, es un contenedor que no tiene diseno y el nav_controller se encarga de gestionar la navegacion entre los fragments 


##### 3. Mencione algunas de las ventajas del Navigation Graph
Permite enlazar cada fragment mediante actions, lo que hace que la navegacion sea mas sencilla, 
