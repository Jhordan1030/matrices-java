public class Main {
//    public static void Multipicar(int n){
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + "\t * " + n + " =\t" + (i*n));
//        }
//    }
//    public static void Dividir(int n){
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + "\t / " + n + " =\t" + (i/n));
//        }
//    }
//    public static void Sumar(int n){
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + "\t + " + n + " =\t" + (i+n));
//        }
//    }
//    public static void Restar(int n){
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + "\t - " + n + " =\t" + (i-n));
//        }
//    }
    public static void ParImpar(int ini, int fin){
        for (int i = ini; i <= fin; i++) {
            if(i % 2 == 0){
                System.out.println(i + " Par");
            }else{
                System.out.println(i + " Impar");
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Esta es la rama for :)");
//        int n = 2;
//        System.out.println("Multiplicar");
//        Multipicar(n);
//        System.out.println("Dividir");
//        Dividir(n);
//        System.out.println("Sumar");
//        Sumar(n);
//        System.out.println("Restar");
//        Restar(n);

        ParImpar(10,30);
    }
}
