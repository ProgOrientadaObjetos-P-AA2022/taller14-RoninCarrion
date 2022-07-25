/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

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
        Enlace c = new Enlace();
        String mensaje = String.format("\t<--INFORMACIÓN DE ESTUDIANTE/ES-->\n\n");
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            mensaje = String.format("%s%s\n",
                     mensaje, c.obtenerDataEstudiante().get(i));

        }
        System.out.println(mensaje);
    }

}
