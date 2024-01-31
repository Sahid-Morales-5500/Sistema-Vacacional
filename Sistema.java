import java.util.Scanner;

public class Coca_Cola {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de vacaciones de Coca-Cola Company");
        Scanner escaner = new Scanner(System.in);
        String Nombre = "";
        String Apellido = "";
        int Clave = 0;
        int Antiguedad = 0;

        System.out.println("");
        System.out.print("¿Como se llama el trabajador?");
        Nombre = escaner.nextLine();
        System.out.println("Cual es su Apellido");
        Apellido = escaner.nextLine();
        System.out.print("¿Nummero de su departamento?");
        Clave = escaner.nextInt();
        System.out.print("¿Cuantos años lleva trabajando?");
        Antiguedad = escaner.nextInt();

        System.out.println("Gracias por usar");

        // Clave 1 (Departamento de atencion al cliente //

        if (Clave == 1) {
            if (Antiguedad == 1) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 6 dias de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El trabajador"  + Nombre + Apellido + " Tiene derecho a 14 dias de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 20 dias de vacaciones");
            } else {
                System.out.println("El año ingresado es incorrecto");
            }

            // Clave 2 (Departamento de Logistica) //

        } else if (Clave == 2) {
            if (Antiguedad == 1) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 7 dias de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 15 dias de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 22 dias de vacaciones");
            } else {
                System.out.println("El año ingresado es incorrecto");
            }

            // Clave 3 (Gerencia) //

        } else if (Clave == 3) {
            if (Antiguedad == 1) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 10 dias de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 20 dias de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El trabajador" + Nombre + Apellido + " Tiene derecho a 30 dias de vacaciones");
            } else {
                System.out.println("El año ingresado es incorrecto");
            }

        } else {
            System.out.println("El numero de clave que intentas ingresar es incorrecto");
        }

    }
}