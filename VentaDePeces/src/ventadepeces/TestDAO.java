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

/**
 *
 * @author javie
 */
public class TestDAO {
    public static void main(String[] args) {
        PezTropical t=new PezTropical("aa01","Amarillo","Tropical",(int)15000,(int)74);
        PezTropical t2=new PezTropical("aa02","Rojo","Tropical",(int)17000,(int)29);
        PezTropical t3=new PezTropical("aa03","Verde","Tropical",(int)15250,(int)83);
        PezTropical t4=new PezTropical("aa04","Naranjo","Tropical",(int)16500,(int)56);
        PezTropical t5=new PezTropical("aa05","Rosado","Tropical",(int)18250,(int)12);
        PezTropical t6=new PezTropical("aa06","Blanco y Negro","Tropical",(int)20000,(int)97);
        PezTropical t7=new PezTropical("aa07","Azul","Tropical",(int)19750,(int)41);
        
//------------------------------------------------------------------------------

        PezDorado d=new PezDorado("ab01","Pez Dorado",(int)20000,(int)75,(int)65);
        PezDorado d2=new PezDorado("ab02","Pez Dorado",(int)15250,(int)45,(int)38);
        PezDorado d3=new PezDorado("ab03","Pez Dorado",(int)16250,(int)50,(int)91);
        PezDorado d4=new PezDorado("ab04","Pez Dorado",(int)19750,(int)73,(int)47);
        PezDorado d5=new PezDorado("ab05","Pez Dorado",(int)18250,(int)67,(int)59);
        PezDorado d6=new PezDorado("ab06","Pez Dorado",(int)12000,(int)29,(int)22);
        PezDorado d7=new PezDorado("ab07","Pez Dorado",(int)17990,(int)55,(int)76);
        
//------------------------------------------------------------------------------

        PezKoi k=new PezKoi("ac01","Pez Koi",(int)14250,(int)21,(int)88);
        PezKoi k2=new PezKoi("ac02","Pez Koi",(int)25000,(int)35,(int)35);
        PezKoi k3=new PezKoi("ac03","Pez Koi",(int)20500,(int)30,(int)51);
        PezKoi k4=new PezKoi("ac04","Pez Koi",(int)12000,(int)12,(int)64);
        PezKoi k5=new PezKoi("ac05","Pez Koi",(int)7000,(int)3,(int)27);
        PezKoi k6=new PezKoi("ac06","Pez Koi",(int)17250,(int)27,(int)53);
        
//------------------------------------------------------------------------------
//---------------------------Agregar datos a la lista---------------------------
//------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------");
        System.out.println("-------------Agregar datos a la lista------------");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
        
        
        if(PezDAO.agregar(t)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t2)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t3)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t4)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t5)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t6)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(t7)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d2)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d3)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d4)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d5)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d6)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(d7)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k2)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k3)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k4)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k5)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        if(PezDAO.agregar(k6)==true){
            System.out.println("Bien, datos agregados");
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        System.out.println("");
        System.out.println("------------------Generando lista------------------");
        System.out.println("");
        
        for(Pez obj : PezDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("----------------Buscar en la lista---------------");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        Pez pez = PezDAO.buscar("aa01");
        
        System.out.println("Buscando ID 'aa01'... ");
        System.out.println("");
        
        if(pez != null){
            System.out.println("Bien, ID encontrada");
            pez.informacion();
        }else{
            System.out.println("Error, ID no encontrada");
        }
        
        Pez pez2 = PezDAO.buscar("ab01");
        
        System.out.println("");
        System.out.println("Buscando ID 'ab01'... ");
        System.out.println("");
        
        if(pez2 != null){
            System.out.println("Bien, ID encontrada");
            pez2.informacion();
        }else{
            System.out.println("Error, ID no encontrada");
        }
        
        Pez pez3 = PezDAO.buscar("ac01");
        
        System.out.println("");
        System.out.println("Buscando ID 'ac01'... ");
        System.out.println("");
        
        if(pez3 != null){
            System.out.println("Bien, ID encontrada");
            pez3.informacion();
        }else{
            System.out.println("Error, ID no encontrada");
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("--------------Eliminar de la lista---------------");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("Eliminar ID 'ac08'...");
        System.out.println("");
        
        if(PezDAO.eliminar("ac08")==true){
            System.out.println("Bien, datos eliminados");
        }else{
            System.out.println("Error, ID no existe");
        }
        
        System.out.println("");
        System.out.println("------------------Generando lista------------------");
        System.out.println("");
        
        for(Pez obj : PezDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("--------------Modificar en la lista--------------");
        System.out.println("-------------------------------------------------");
        
        System.out.println("");
        
        System.out.println("Modificar ID 'ac01'...");
        System.out.println("-Nuevos datos-");
        System.out.println("ID: ac01");
        System.out.println("Edad: 19");
        System.out.println("Especie: Pez Koi");
        System.out.println("Precio: $13.000");
        
        PezKoi pk=new PezKoi("ac01","Pez Koi",(int)13000,(int)19,(int)22);
        
        System.out.println("");
        System.out.println("Buscando ID coincidente...");
        System.out.println("");
        
        if(PezDAO.modificar(pk)==true){
            System.out.println("Bien, datos modificados");
        }else{
            System.out.println("Error, ID no existe");
        }
        
        System.out.println("");
        System.out.println("------------------Generando lista------------------");
        System.out.println("");
        
        for(Pez obj : PezDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("----------------Lista por especies---------------");
        System.out.println("-------------------------------------------------");
        
        System.out.println("");
        
        System.out.println("\nListado de peces tropicales");
        for(Pez obj : PezDAO.obtenerPezTropical()){
            obj.informacion();
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("\nListado de peces dorados");
        for(Pez obj : PezDAO.obtenerPezDorado()){
            obj.informacion();
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("\nListado de peces koi");
        for(Pez obj : PezDAO.obtenerPezKoi()){
            obj.informacion();
        }
    }
}
