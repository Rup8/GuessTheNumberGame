import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        //Inicio la ejecución del programa
        Random random = new Random();
        //Creamos objeto Scanner para capturar entradas del usuario
        Scanner  scanner = new Scanner(System.in);
        boolean seguirJugando; // Variable para controlar si el usuario quiere seguir jugando

        //Variables para las mejores puntuaciones
        int mejorPuntuacionFacil = Integer.MAX_VALUE; // Inicializando el valor más alto
        int mejorPuntuacionMedio = Integer.MAX_VALUE;
        int mejorPuntuacionDificil = Integer.MAX_VALUE;

        do{
        //Mostramos mensaje de bienvenida y explicamos las reglas
        System.out.println("¡Bienvenid@ al juego de adivinar el número!");
         System.out.println("El ordenador seleccionará un número aleatorio entre 1 y 100.");
        System.out.println("Tendrás un número limitado de intentos para adivinarlo");

        //Generamos un número aleatorio entre el 1 y el 100
        int numSecreto = random.nextInt(100) + 1; //Genera un número del 1 al 100

        // Pedir al usuario que seleccione la dificultad
        System.out.println("Selecciona un nivel de dificultad: ");
        System.out.println("1. Fácil (10 intentos)");
        System.out.println("2. Medio (7 intentos)");
        System.out.println("3. Difícil (5 intentos)");
        int intentosPermitidos = 0;

        //Leer la opción de usuario
        int nivel = scanner.nextInt();
        switch (nivel) {
            case 1:
                intentosPermitidos = 10;
                break;
            case 2: 
                intentosPermitidos = 7;
                break;
            case 3:
                intentosPermitidos = 5;
                break;
            default:
                System.out.println("Opción inválida, se seleccionará nivel medio por defecto.");
                intentosPermitidos = 7;
                break;
        }

        //Comienza el juego
        long tiempoInicio = System.currentTimeMillis(); //Captura el tiempo en milisegundos al iniciar

        int intentosRealizados = 0;
        boolean haGanado = false;

        while (intentosRealizados < intentosPermitidos){
            System.out.println("Introduce tu suposición: ");
            int suposicion = scanner.nextInt();
            intentosRealizados++;

            if (suposicion == numSecreto){
                long tiempoFin = System.currentTimeMillis(); //Captura el tiempo en milisegundos al acabar
                long tiempoTotal = (tiempoFin-tiempoInicio) / 1000; //Convierte milisegundos a segundos
                System.out.println("Felicidades, has adivinado el número en "+ intentosRealizados + " intentos.");
                System.out.println("Lo has logrado en " + tiempoTotal + " segundos.");
                haGanado = true;
                //Actualizar la mejor puntuación según el nivel
                if(nivel == 1 && intentosRealizados < mejorPuntuacionFacil){
                    mejorPuntuacionFacil = intentosRealizados;
                    System.out.println("¡Nueva mejor puntuación en nivel fácil!");
                } else if (nivel == 2 && intentosRealizados < mejorPuntuacionMedio){
                    mejorPuntuacionMedio = intentosRealizados;
                    System.out.println("¡Nueva mejor puntuación en nivel medio!");
                } else if (nivel == 3 && intentosRealizados < mejorPuntuacionDificil){
                    mejorPuntuacionDificil = intentosRealizados;
                    System.out.println("¡Nueva mejor puntuación en nivel difícil!");
                }
                break;
            } else if (suposicion < numSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            //Mostrar intentos restantes.
            System.out.println("Te quedan "+ (intentosPermitidos - intentosRealizados) + " intentos.");
        }
        if (!haGanado){
            long tiempoFin = System.currentTimeMillis(); //Captura el tiempo transcurrido de partida
            long tiempoTotal = (tiempoFin - tiempoInicio)/1000;
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numSecreto);
            System.out.println("Tiempo total: "+ tiempoTotal + " segundos.");
        }

        //Mostrar las mejores puntuaciones
        System.out.println("\nPuntuaciones más altas:");
        System.out.println("Fácil: " + (mejorPuntuacionFacil == Integer.MAX_VALUE ? "No registrado" : mejorPuntuacionFacil + " intentos"));
        System.out.println("Medio: " + (mejorPuntuacionMedio == Integer.MAX_VALUE ? "No registrado" : mejorPuntuacionMedio + " intentos"));
        System.out.println("Difícil: " + (mejorPuntuacionDificil == Integer.MAX_VALUE ? "No registrado" : mejorPuntuacionDificil+ " intentos"));

        //Preguntar si quiere jugar otra
        System.out.println("\n¿Quieres jugar otra ronda? (s/n): ");
        char respuesta = scanner.next().toLowerCase().charAt(0); //Leer respuesta
        seguirJugando = (respuesta == 's');

    } while (seguirJugando); //Continuar jugando mientras el usuario quiera
    
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close(); //Cerrar el scanner al final
    }
}