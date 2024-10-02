public class Main {

    public static void imprimirMatriz(int [][]matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("\t" + matriz[i][j] + " ");
            }
            System.out.println();
       }
    }

    public static int[][] SumaMatrices(int[][]matriz1,int[][]matriz2,int n){
        int[][] resultado = new int[n][n];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }
        imprimirMatriz(resultado);
        return resultado;
    }

    public static int[][]Inferior(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    }
    public static int[][]Superio(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    }
    public static int[][]SuperioCompleta(int[][]matriz,int n){
        int r = n / 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < r){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    }
    public static int[][]InferiorCompleta(int[][]matriz,int n){
        int r = n / 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > r){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    }
    public static void main(String[] args) {

        System.out.println("Aqui trabajaremos Matrices");
        int n = 10;
        int[][] matriz = new int[n][n];
        int cont = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = cont;
                cont++;
            }
        }
        System.out.println("Matriz1");
        imprimirMatriz(matriz);

        int r = n / 2;
        System.out.println(r);

        //SuperioCompleta(matriz,n);

        InferiorCompleta(matriz,n);

//        System.out.println("Matriz inferior");
//      //  inferior(matriz);
//        System.out.println("Matriz superio");
//        Superio(matriz);

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                System.out.print("\t" + matriz[i][j] + " ");
//            }
//            System.out.println();
//        }

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



//        int[][] matriz2 = new int[n][n];
//        int cont2 = 4;
//        for (int i = 0; i < matriz2.length; i++) {
//            for (int j = 0; j < matriz2[0].length; j++) {
//                matriz2[i][j] = cont2;
//                cont2 += 2;
//            }
//        }
//        System.out.println("Matriz 2");
//        imprimirMatriz(matriz2);
//
//        System.out.println("Suma de Matrices");
//        int [][] resultado = new int[n][n];
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                resultado[i][j] = matriz[i][j] * matriz2[i][j];
//            }
//        }
//        SumaMatrices(matriz,matriz2,n);
//        int[][] matriz;
//        matriz = new int[3][3];
//
////        matriz[0][0] = 1;
////        matriz[0][1] = ;
//        matriz[0][2] = 157;
////
////        matriz[1][0] = 22;
////        matriz[1][1] = 22;
//       matriz[1][2] = 22;
//
////        matriz[2][0] = 22;
////        matriz[2][1] = 22;
//        matriz[2][2] = 9998;
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                System.out.print(matriz[i][j] +"\t");
//            }
//            System.out.println();
//        }
    }

}