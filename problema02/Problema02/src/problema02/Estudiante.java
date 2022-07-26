/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author ronni
 */
public class Estudiante {

    private String nombre;
    private double promedio;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Estudiante(String a, String b, double c, double d, double e) {
        nombre = a;
        apellido = b;
        calificacion1 = c;
        calificacion2 = d;
        calificacion3 = e;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCalificacion1(double a) {
        calificacion1 = a;
    }

    public void establecerCalificacion2(double a) {
        calificacion2 = a;
    }

    public void establecerCalificacion3(double a) {
        calificacion3 = a;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String mensaje = String.format("%s %s\n  Calificaciones:\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  Promedio %.2f\n", nombre, apellido,
                calificacion1, calificacion2, calificacion3, promedio);
        return mensaje;

    }

}
