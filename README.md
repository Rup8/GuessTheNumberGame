# Juego de Adivinanza de Números en Java

## Descripción

El **Juego de Adivinanza de Números** es una aplicación simple basada en la línea de comandos desarrollada en Java. En este juego, el ordenador elige un número al azar entre 1 y 100, y el usuario debe adivinarlo. El usuario tiene un número limitado de intentos que varía según el nivel de dificultad (fácil, medio, difícil). El objetivo es adivinar el número correcto dentro del número de intentos permitidos.

## Cómo Jugar

1. **Inicio del Juego**:
Cuando inicias el juego, se te da la bienvenida y se explican las reglas del juego.
2. **Selecciona el Nivel de Dificultad**:
- **Fácil**: 10 intentos
- **Medio**: 7 intentos
- **Difícil**: 5 intentos
3. **Introduce tu Conjetura**:
Ingresa un número entre 1 y 100.
Si adivinas el número correctamente, recibirás un mensaje de felicitación junto con el número de intentos utilizados.
Si la suposición es incorrecta, el juego te indicará si el número es mayor o menor que tu suposición.
4. **Tiempo de Juego**:
El juego registra cuánto tiempo te lleva adivinar el número.
5. **Puntuación Alta**:
Se realiza un seguimiento de la puntuación más alta, es decir, el menor número de intentos necesarios para adivinar el número bajo cada nivel de dificultad.
6. **Repetir el Juego**:
Después de cada ronda, se te pregunta si deseas jugar otra vez. Puedes continuar jugando hasta que decidas salir.
## Cómo Ejecutar el Juego

1. **Pre-requisitos**:
Asegúrate de tener [Java JDK](https://www.oracle.com/in/java/technologies/downloads/) instalado en tu máquina.
2. **Compilar el Código**:
Abre la terminal y navega a la carpeta del proyecto.
Compila el código con el siguiente comando:
'javac GuessTheNumberGame.java'

3. **Ejecutar el Juego**:
Después de compilar, ejecuta el juego con:
'java GuessTheNumberGame'
# Aprendizajes Durante el Desarrollo

- **Manejo de Entradas del Usuario:** Aprendí a gestionar la entrada del usuario a través de la línea de comandos usando Scanner en Java.
- **Generación de Números Aleatorios:** Implementé la generación de números aleatorios usando la clase Random para seleccionar el número objetivo.
- **Control de Flujo:** Utilicé estructuras de control como bucles while y if para manejar el flujo del juego y validar las entradas del usuario.
- **Medición del Tiempo de Ejecución:** Implementé un temporizador para calcular el tiempo que tarda el usuario en adivinar el número.
- **Gestión de Archivos:** Configuré y usé Git para el control de versiones y la colaboración en el proyecto.
## Posibles Mejoras

- **Interfaz Gráfica:** Crear una interfaz gráfica de usuario (GUI) usando Swing o JavaFX para hacer el juego más interactivo.
- **Niveles de Dificultad Adicionales:** Añadir más niveles de dificultad con diferentes rangos de números y oportunidades.
- **Estadísticas del Juego:** Implementar un sistema de estadísticas para registrar los mejores tiempos y el historial de juegos del usuario.
- **Guardar Puntuaciones:** Permitir al usuario guardar y consultar su puntuación más alta en un archivo o base de datos.
- **Multijugador:** Añadir una funcionalidad de juego multijugador para que los usuarios puedan competir entre sí.
