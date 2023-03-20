import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {
        String[] palabras = {"hola", "adios", "casa", "perro", "gato", "avion", "computador"};
        String palabra = palabras[(int) (Math.random() * palabras.length)]; // Palabra aleatoria del array
        char[] adivinada = new char[palabra.length()]; // Letras adivinadas hasta el momento
        int intentos = 6; // Número de intentos disponibles

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de ahorcado!");

        // Ciclo principal del juego
        while (intentos > 0) {
            System.out.println("Palabra: " + obtenerPalabraAdivinada(palabra, adivinada));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = sc.nextLine().charAt(0);

            // Si la letra ya fue adivinada, mostrar mensaje y pedir otra letra
            if (yaFueAdivinada(adivinada, letra)) {
                System.out.println("Ya adivinaste esa letra, intenta con otra.");
                continue;
            }

            // Si la letra no está en la palabra, disminuir el número de intentos
            if (!estaEnPalabra(palabra, letra)) {
                intentos--;
                System.out.println("La letra no está en la palabra, intenta de nuevo.");
            } else {
                adivinarLetra(palabra, adivinada, letra);
                if (String.valueOf(adivinada).equals(palabra)) {
                    System.out.println("¡Felicidades, adivinaste la palabra!");
                    break;
                }
            }
        }

        // Si se acabaron los intentos, mostrar mensaje de derrota
        if (intentos == 0) {
            System.out.println("Lo siento, te quedaste sin intentos. La palabra era " + palabra + ".");
        }

        sc.close();
    }

    // Función para obtener la palabra adivinada hasta el momento
    public static String obtenerPalabraAdivinada(String palabra, char[] adivinada) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (yaFueAdivinada(adivinada, letra)) {
                resultado += letra + " ";
            } else {
                resultado += "_ ";
            }
        }
        return resultado;
    }

    // Función para determinar si una letra ya fue adivinada
    public static boolean yaFueAdivinada(char[] adivinada, char letra) {
        for (int i = 0; i < adivinada.length; i++) {
            if (adivinada[i] == letra) {
                return true;
            }
        }
        return false;
    }

    // Función para determinar si una letra está en la palabra
    public static boolean estaEnPalabra(String palabra, char letra) {
        return palabra.indexOf(letra) != -1;
    }

    // Función para adivinar una letra en la palabra
    public static void adivinarLetra(String palabra, char[] adivinada, char letra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                adivinada[i] = letra;
            }
        }
    }
}