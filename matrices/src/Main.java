public class Main {

    public static void imprimirMatriz(int [][]matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = filas -1; i >= 0 ; i--) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("Aqui trabajaremos Matrices");
//        int[][] matriz = new int[6][6];
//        int cont = 1;
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                matriz[i][j] = cont;
//                cont++;
//            }
//        }
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                System.out.print("\t" + matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Matriz invertida");
//
//        int filas = matriz.length;
//        int columnas = matriz[0].length;
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas / 2; j++) {
//                int temp = matriz[i][j];
//                matriz[i][j] = matriz[i][columnas - 1 - j];
//                matriz[i][columnas - 1 - j] = temp;
//            }
//        }
//
//        imprimirMatriz(matriz);

        int[][] matriz;
        matriz = new int[3][3];

//        matriz[0][0] = 1;
//        matriz[0][1] = ;
        matriz[0][2] = 157;
//
//        matriz[1][0] = 22;
//        matriz[1][1] = 22;
       matriz[1][2] = 22;

//        matriz[2][0] = 22;
//        matriz[2][1] = 22;
        matriz[2][2] = 9998;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println();
        }
    }

}