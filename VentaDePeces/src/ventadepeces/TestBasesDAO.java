/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadepeces;

import modelo.PezTropical;
import modelo.PezDorado;
import modelo.PezKoi;
import modelo.Pez;
import controlador.PezDAO;
import java.util.ArrayList;

/**
 *
 * @author jassa
 */
public class TestBasesDAO {
    public static void main(String[] args) {
        PezTropical t = new PezTropical("aa08", "Color prueba", "Tropical", 9990, 100, 
                "UrlRandomParaEsto"); 

        try {
            // Intentar agregar el pez a la base de datos
            if(PezDAO.agregar(t)) {
                System.out.println("Bien, datos agregados");
            } else {
                System.out.println("Error, datos no agregados");
            }
        } catch (Exception e) {
            System.out.println("Error al agregar datos: " + e.getMessage());
            e.printStackTrace();
        }
        
        
        
        Pez pez = PezDAO.buscar("aa08");
        System.out.println("Buscando ID... ");
       
        
        if(pez != null){
            if (pez instanceof PezTropical){
                PezTropical pezTropical = (PezTropical) pez;
                System.out.println("Pez Tropical encontrado "+ pezTropical);
            }else if( pez instanceof PezDorado){
                PezDorado pezDorado = (PezDorado)pez;
                System.out.println("Pez Dorado encontrado "+ pezDorado);
            }else if(pez instanceof PezKoi){
                PezKoi pezKoi = (PezKoi)pez;
                System.out.println("Pez Koi encontrado "+ pezKoi);
            }else{
                System.out.println("Error, No encontrado");
            }
        }else{
            System.out.println("Error, ID no encontrada");
        }
        
        
        // Me entrego un error caleta de rato y tuve que capturar con el
        // Exception e para que dejara de botar el error, asi que si te sale algo
        // que diga unreported exception Exception o
        // must be caught or declared to be thrown es por eso probablemente
        // throws Exception tambien eso xd
        
        try {
            boolean eliminado = PezDAO.eliminar("aa08");
            if (eliminado) {
                System.out.println("Eliminacion exitosa.");
            } else {
                System.out.println("No se pudo eliminar el pez.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            }


        
        // Ya esta creado el Modificar pero nose si funciona aun.
        
        // Crea una instancia de PezKoi con los datos actualizados
        PezKoi pezKoi = new PezKoi("ac06","Pez Koi", 16500, 15,100,"urlfalsaParaKoi");

        // Llamar al metodo modificar, pasando el pez que deseas actualizar
        try {
            boolean resultado = PezDAO.modificar(pezKoi);
            if (resultado) {
            System.out.println("El pez ha sido modificado exitosamente.");
            }else {
            System.out.println("Error al modificar el pez.");
            }
            
        }catch (Exception e){
            System.out.println("Ocurrio un error: "+ e.getMessage());
        }
        
        
        
        try {
            ArrayList<Pez> pecesTropicales = PezDAO.obtenerDatosPorEspecie("Tropical");

            if (!pecesTropicales.isEmpty()) {
                for (Pez pez1 : pecesTropicales) {
                    System.out.println(pez1);
                }
            } else {
                System.out.println("No se encontraron peces de la especie 'Tropical'.");
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }


        

        
    }
    
   
    
}