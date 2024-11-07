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
    String query = "INSERT INTO productos(id_producto, color, tamaño, edad, especie, stock) VALUES (?, ?, ?, ?, ?, ?)";
    
    try (Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
         PreparedStatement pst = con.prepareStatement(query)) {
        
    
        pst.setString(1, pez.getIdPez());
        
        if (pez instanceof PezTropical){
            pst.setString(2, ((PezTropical) pez).getColor());
        }else{
            pst.setNull(2, java.sql.Types.VARCHAR);
        }
        if (pez instanceof PezDorado) {
            pst.setInt(3, ((PezDorado) pez).getTamaño()); 
        } else {
            pst.setNull(3, java.sql.Types.INTEGER); 
        }
        if (pez instanceof PezKoi) {
            pst.setInt(4, ((PezKoi) pez).getEdad()); 
        } else {
            pst.setNull(4, java.sql.Types.INTEGER); 
        }
        pst.setString(5, pez.getEspecie()); 
        pst.setInt(6, pez.getStock());
        estado = pst.executeUpdate() == 1;
        
    } catch (SQLException sqle) {
        System.out.println("Error al agregar pez: " + sqle.getMessage());
    }
    return estado;
}

    
    public static Pez buscar(String idPez) theows Exception{
        Pez pez = null;
        String query = "SELECT * FROM producto WHERE id_producto = ?";
        
        try(Connection con = new AbrirBaseDeDatos().conectar("tienda_peces");
            PreparedStatement pst = con.prepareStatement(query)){
            
            pst.setString(1, id_producto);
            
        for(Pez obj : peces){
            if(obj.getIdPez().equals(idPez)){
            pez=obj;
            break;
            }
        }
        return pez;
    }
    
    public static boolean eliminar(String idPez){
        boolean estado=false;
        for(Pez obj : peces){
            if(obj.getIdPez().equals(idPez)){
                peces.remove(obj);
                estado=true;
                break;
            }
        }
        return estado;
    }
    
    public static boolean modificar(Pez pez){
        boolean estado=false;
        int pos=0;
        for(Pez obj : peces){
            if(obj.getIdPez().equals(pez.getIdPez())){
                peces.set(pos,pez);
                estado=true;
                break;
            }
            pos++;
        }
        return estado;
    }
    
    public static ArrayList<Pez> obtenerDatos(){
        return peces;
    }
    
    public static ArrayList<Pez> obtenerPezTropical(){
        ArrayList<Pez> reportes = new ArrayList();
        
        for(Pez obj : peces){
            if(obj instanceof PezTropical){
                reportes.add(obj);
            }
        }
        return reportes;
    }
    
    public static ArrayList<Pez> obtenerPezDorado(){
        ArrayList<Pez> reportes = new ArrayList();
        
        for(Pez obj : peces){
            if(obj instanceof PezDorado){
                reportes.add(obj);
            }
        }
        return reportes;
    }
    
    public static ArrayList<Pez> obtenerPezKoi(){
        ArrayList<Pez> reportes = new ArrayList();
        
        for(Pez obj : peces){
            if(obj instanceof PezKoi){
                reportes.add(obj);
            }
        }
        return reportes;
    }
    
    public static Pez buscarPezTropical(String idPez){
        Pez reportes = null;
        
        for(Pez obj : peces){
            if(obj instanceof PezTropical){
                if(obj.getIdPez().equals(idPez)){
                    reportes =obj;
                    break;
                }
            }
        }
        return reportes;
    }
    
    public static Pez buscarPezDorado(String idPez){
        Pez reportes = null;
        
        for(Pez obj : peces){
            if(obj instanceof PezDorado){
                if(obj.getIdPez().equals(idPez)){
                    reportes =obj;
                    break;
                }
            }
        }
        return reportes;
    }
    
    public static Pez buscarPezKoi(String idPez){
        Pez reportes = null;
        
        for(Pez obj : peces){
            if(obj instanceof PezKoi){
                if(obj.getIdPez().equals(idPez)){
                    reportes =obj;
                    break;
                }
            }
        }
        return reportes;
    }
    
    public static void llenar(){
        agregar(new PezTropical("aa01","Amarillo","Tropical",(int)15000,(int)74));
        agregar(new PezTropical("aa02","Rojo","Tropical",(int)17000,(int)29));
        agregar(new PezDorado("ab01","Pez Dorado",(int)20000,(int)75,(int)65));
        agregar(new PezDorado("ab02","Pez Dorado",(int)15250,(int)45,(int)38));
        agregar(new PezKoi("ac01","Pez Koi",(int)14250,(int)21,(int)88));
    }
}
