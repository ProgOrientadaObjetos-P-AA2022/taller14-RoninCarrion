/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ronni
 */
public class Enlace {
    /** 
     * Connect to a sample database 
     * @return 
    */
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
//    public void insertarEstudiante(Estudiante estudiante) {  
//  
//        try{  
//            establecerConexion();
//            Statement statement = obtenerConexion().createStatement();
//            String data = String.format("INSERT INTO estudiante (cedula, nombre, correo, sueldo, mes) "
//                    + "values ('%s', '%s', '%s', '%.2f', '%s')", estudiante.obtenerNombre(), 
//                    estudiante.obtenerApellido(),estudiante.obtenerCalificacion1(),
//                    estudiante.obtenerCalificacion2(),
//                    estudiante.obtenerCalificacion3());
//            statement.executeUpdate(data);
//            obtenerConexion().close();
//        } catch (SQLException e) {  
//             System.out.println("Exception: insertarEstudiante");
//             System.out.println(e.getMessage());  
//             
//        }  
//    }
    
    public ArrayList<Estudiante> obtenerDataEstudiante() {  
        ArrayList<Estudiante> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Estudiante estudiante = new Estudiante(rs.getString("nombre"),
                        rs.getString("apellido"), rs.getDouble("calificacion1"),
                        rs.getDouble("calificacion2"),rs.getDouble("calificacion3"));
                estudiante.establecerPromedio();
                lista.add(estudiante);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}  

