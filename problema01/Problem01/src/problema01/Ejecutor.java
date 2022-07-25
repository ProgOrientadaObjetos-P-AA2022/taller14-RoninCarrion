/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Enlace enlace = new Enlace();
        String name;
        String ide;
        String email;
        double sueld;
        String mes;
        boolean bandera = true;
        String respuesta;
        while (bandera) {
            System.out.println("Bienvenido al Sistema de Registro Laboral");
            System.out.println("Ingrese el nombre del usuario: ");
            name = entrada.nextLine();
            System.out.println("Ingrese la cedula del usuario: ");
            ide = entrada.nextLine();
            System.out.println("Ingrese el correo del usuario: ");
            email = entrada.nextLine();
            System.out.println("Ingrese el sueldo del usuario: ");
            sueld = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes del sueldo: ");
            mes = entrada.nextLine();
            Trabajador trabajador = new Trabajador(ide, name, email, sueld, mes);
            enlace.insertarTrabajador(trabajador);

            System.out.println("¿Desea seguir ingresando datos?\n[SI][NO]");
            respuesta = entrada.nextLine().toUpperCase();
            if (!respuesta.equals("SI")) {
                bandera = false;
            }
        }
        for (int i = 0; i < enlace.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s\n", enlace.obtenerDataTrabajador().get(i));

        }

    }
}
