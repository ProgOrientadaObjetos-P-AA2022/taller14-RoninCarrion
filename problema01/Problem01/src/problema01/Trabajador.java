/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author ronni
 */
public class Trabajador {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mes;

    public Trabajador(String a, String b, String c, double d, String e) {
        cedula = a;
        nombre = b;
        correo = c;
        sueldo = d;
        mes = e;
    }

    public void establecerCedula(String a) {
        cedula = a;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerCorreo(String a) {
        correo = a;
    }

    public void establecerSueldo(double a) {
        sueldo = a;
    }

    public void establecerMes(String a) {
        mes = a;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMes() {
        return mes;
    }

    @Override
    public String toString() {
        String mensaje = String.format("\t<--INFORMACIÓN DE TRABAJADOR/ES-->\n"
                + ">> Nombre del Trabajador: %s\n"
                + ">> Cédula del Trabajador: %s\n"
                + ">> Correo del trabajador: %s\n"
                + ">> Sueldo del trabajador: %.2f\n"
                + ">> Mes del sueldo: %s\n", nombre, cedula, correo, sueldo, mes);
        return mensaje;
    }
}
