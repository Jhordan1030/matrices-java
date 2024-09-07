public class Main {
    public static void main(String[] args) {
        
        System.out.println("Aqui trabajaremos vectores");
        
        int [] vectores = {1,2,3,4,5};

        for (int i = 0; i < vectores.length; i++) {
            System.out.println(vectores[i]);
        }
        System.out.println("Ciclo For");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nCiclo invertido");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}