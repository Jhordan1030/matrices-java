public class Cajero extends Persona{

    public Cajero(String nombre, String apellido, int edad, double saldo){
        super(nombre, apellido, edad, saldo);
    }

    public double Deposito(double monto){
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Has depositado $" + monto);
            return saldo;

        }else{
            System.out.println("Valor ingresado incorrecto");
            return getSaldo();
        }
    }

    public double Retirar(double monto){
        if(monto > 0 && monto <= getSaldo()){
            this.saldo -= monto;
            System.out.println("Has retirado $" + monto);
            return saldo;
        }else{
            System.out.println("Valor ingresado incorrecto");
            return getSaldo();
        }
    }


    public String mostrarDatosCajero(){
        String cadena = super.mostrarDatosPersona() +"";
        return cadena;
    }
}
