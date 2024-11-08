/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author javie
 */
public class PezDAO {
    public static boolean agregar(Pez pez) throws Exception {
        boolean estado = false;
        String query = "INSERT INTO productos(id_producto, color, tamaño, edad, especie, precio, stock, img) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
             PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, pez.getIdPez());
            // Configurar Color (Solo para PezTropical)
            if (pez instanceof PezTropical) {
                pst.setString(2, ((PezTropical) pez).getColor());
            } else {
                pst.setNull(2, java.sql.Types.VARCHAR);
            }// Configurar Tamaño (solo para PezDorado)
            if (pez instanceof PezDorado) {
                pst.setInt(3, ((PezDorado) pez).getTamaño());
            } else {
                pst.setNull(3, java.sql.Types.INTEGER); 
            }// Configurar Edad (solo para PezKoi)
            if (pez instanceof PezKoi) {
                pst.setInt(4, ((PezKoi) pez).getEdad());
            } else {
                pst.setNull(4, java.sql.Types.INTEGER); 
            }
            pst.setString(5, pez.getEspecie());
            pst.setDouble(6, pez.getPrecio());
            pst.setInt(7, pez.getStock());
            if (pez.getUrlImg() != null) {
                pst.setString(8, pez.getUrlImg());  
            } else {
                pst.setNull(8, java.sql.Types.VARCHAR);  
            }
            estado = pst.executeUpdate() == 1;
        } catch (SQLException sqle) {
            System.out.println("Error al agregar pez: " + sqle.getMessage());
        }
        return estado;
    }
    
    
    // Metodo para Buscar un Producto por su id_producto
    
    public static Pez buscar(String id_pez) {
        Pez pez = null;
        String query = "SELECT * FROM productos WHERE id_producto = ?";
        try (Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
            PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, id_pez);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String especie = rs.getString("especie");
                    if("Tropical".equals(especie)){
                        pez = new PezTropical(
                                rs.getString("id_producto"),
                                rs.getString("color"),
                                rs.getString("especie"),
                                rs.getInt("precio"),
                                rs.getInt("stock"),
                                rs.getString("img")
                        );
                    }else if("Pez Dorado".equals(especie)){
                        pez = new PezDorado(
                                rs.getString("id_producto"),
                                rs.getString("especie"),
                                rs.getInt("precio"),
                                rs.getInt("tamaño"),
                                rs.getInt("stock"),
                                rs.getString("img")
                        );
                    }else if("Pez Koi".equals(especie)){
                        pez = new PezKoi(
                                rs.getString("id_producto"),
                                rs.getString("especie"),
                                rs.getInt("precio"),
                                rs.getInt("edad"),
                                rs.getInt("stock"),
                                rs.getString("img")
                        );  
                    }   
                }
            }

        } catch (SQLException sqle) {
            System.out.println("Error al buscar el pez: " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        return pez;
    }

    public static boolean eliminar(String id_pez) throws Exception {
        boolean estado = false;
        
        String query = "DELETE FROM productos WHERE id_producto = ?";
        
        try (Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, id_pez);
            estado = pst.executeUpdate() == 1;

        } catch (SQLException sqle) {
            System.out.println("Error al eliminar el producto: "+ sqle.getMessage());
        }
        return estado;
    }
    
    
    public static boolean modificar(Pez pez) throws Exception {
        boolean estado = false;

        
        String query = "UPDATE productos SET color = ?, tamaño = ?, edad = ?,"
        + " especie = ?, precio = ?, stock = ?, img = ? WHERE id_producto = ?";


        try (Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
             PreparedStatement pst = con.prepareStatement(query)) {
            String color = null;
            Integer tamaño = null;
            Integer edad = null;
            if (pez instanceof PezKoi) {
                PezKoi pezKoi = (PezKoi) pez;
                edad = pezKoi.getEdad(); // atributo de PezKoi
            } else if (pez instanceof PezTropical) {
                PezTropical pezTropical = (PezTropical) pez;
                color = pezTropical.getColor();  // atributo de PezTropical
            } else if (pez instanceof PezDorado) {
                PezDorado pezDorado = (PezDorado) pez;
                tamaño = pezDorado.getTamaño();
            }
            if(color != null){
                pst.setString(1,color);
            }else{
                 pst.setNull(1, java.sql.Types.INTEGER);
            }
            if(tamaño != null){
                pst.setInt(2,tamaño);
            }else{
                 pst.setNull(2, java.sql.Types.INTEGER);
            }
            if (edad != null) {
                pst.setInt(3, edad);
            } else {
                pst.setNull(3, java.sql.Types.INTEGER);
            }
            
            pst.setString(4, pez.getEspecie());
            pst.setInt(5, pez.getPrecio());
            pst.setInt(6, pez.getStock());
            pst.setString(7, pez.getUrlImg());
            pst.setString(8, pez.getIdPez());

            // se actualiza o se supone xd
            estado = pst.executeUpdate() == 1;

        } catch (SQLException sqle) {
            System.out.println("Error al modificar pez: " + sqle.getMessage());
        }
        return estado;
    }


    
}
