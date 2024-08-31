import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ESta es la rama-cajero");
        Cajero c1;
        c1 = new Cajero("Jhordan","Huera" , 22, 1000);
        
       System.out.println(c1.mostrarDatosCajero());
        c1.Deposito(500);
        System.out.println("Saldo actual $" + c1.getSaldo());
        
        
        System.out.println("Retiro");
        

        c1.Retirar(10);
        System.out.println(c1.mostrarDatosCajero());

    }
}
