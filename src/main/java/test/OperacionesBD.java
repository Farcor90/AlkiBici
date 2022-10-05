/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.Peliculas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesBD {
    
    public static void main(String[] args) {
       // listarPeliculas();
        actualizarPelicula(1, "Romance/Fantasia");
        
    }
    public static void actualizarPelicula(int id, String modalidad){
        DBConnection con = new DBConnection();
        String sql = "UPDATE peliculas SET modalidad = '"+modalidad+"' WHERE id = "+id;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void listarPeliculas(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM peliculas";
        
         try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String modelo = rs.getString("modelo");
                String modalidad = rs.getString("modalidad");
                String marca = rs.getString("marca");
                int disponibles = rs.getInt("disponibles");
                boolean novedad = rs.getBoolean("novedad");
                
                Peliculas peliculas = new Peliculas(id, modelo, modalidad, marca, disponibles, novedad);
                System.out.println(peliculas.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
         finally{
             con.desconectar();
         }
        
    }
    
}
