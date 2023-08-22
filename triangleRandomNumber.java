import java.util.Random;

public class triangleRandomNumber {
    public static void main(String[] args) {
        System.out.println("Esta es mi clase Hola Mundo!!");
        // metodo constructor del num random
        Random a = new Random();

        // obtenemos un numero aleatorio entre 1 - 10
        int b = a.nextInt(10) + 1;
        // nueva variable para saber el espacio que le tenemos que dar al inicio de cada nivel
        int espacio = b;

        // dos ciclos for anidados
        for (int nivel = 1; nivel <= b; nivel++) { // avanza el nivel
            for (int i = 1; i <= espacio; i++) { // espacio para que el triangulo este centrado
                System.out.print(' ');
            }
            espacio--;
            for (int i = 1; i <= nivel; i++) { // impresion de chars
                System.out.print("* ");
            }
            System.out.print('\n'); // salto de linea cada nivel
        }

    }
}