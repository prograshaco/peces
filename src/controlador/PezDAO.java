/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.*;
/**
 *
 * @author javie
 */
public class PezDAO {
    private static ArrayList<Pez> peces=new ArrayList();
    
    public static boolean agregar(Pez pez){
        boolean estado=false;
        
        if(pez != null && buscar(pez.getIdPez())==null){
            peces.add(pez);
            estado=true;
        }
        return estado;
    }
    
    public static Pez buscar(String idPez){
        Pez pez = null;
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
        agregar(new PezDorado("ab01","Dorado",(int)20000,(int)75,(int)65));
        agregar(new PezDorado("ab02","Dorado",(int)15250,(int)45,(int)38));
        agregar(new PezKoi("ac01","Koi",(int)14250,(int)21,(int)88));
    }
}
