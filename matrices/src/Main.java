import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aqui trabajaremos vectores");
        Scanner entrada = new Scanner(System.in);
        int vector1 [] = new int[4];
        vector1[0] =35;
        vector1[1] =28;
        vector1[2] =16;
        vector1[3] =44;
        System.out.println("Imprimir de uno en uno");
        System.out.println(vector1[0]);

        System.out.println("Imprimir todo el vector");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println((i + 1) + ": " + vector1[i]);
        }

        int []vector2 = new int [4];
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Increse un numero para la posicion " + i + ": ");
            vector2[i] = entrada.nextInt();
        }
        System.out.println("El vector es ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Posición " + i + ": " + vector2[i]);
        }
    }
}