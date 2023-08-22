import java.util.Random;

public class MiClase {
    public static void main(String[] args) {
        System.out.println("Esta es mi clase Hola Mundo!!");
        // metodo constructor
        Random a = new Random();

        // obtenemos un numero aleatorio entre 1 - 10
        int b = a.nextInt(10) + 1;

        //dos ciclos for anidados
        for (int nivel = 1; nivel <= b; nivel++) { //avanza el nivel
            for (int i = 1; i <= nivel; i++) { //impresion de chars
                System.out.print('*');
            }
            System.out.print('\n'); //salto de linea cada nivel
        }

    }
}