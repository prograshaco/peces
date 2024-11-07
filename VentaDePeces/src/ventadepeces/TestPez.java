/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadepeces;

import modelo.PezKoi;
import modelo.PezTropical;
import modelo.PezDorado;
import modelo.Pez;

/**
 *
 * @author javie
 */
public class TestPez {
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

        PezKoi k=new PezKoi("ac01",(int)21,"Pez Koi",(int)14250,(int)88);
        PezKoi k2=new PezKoi("ac02",(int)35,"Pez Koi",(int)25000,(int)35);
        PezKoi k3=new PezKoi("ac03",(int)30,"Pez Koi",(int)20500,(int)51);
        PezKoi k4=new PezKoi("ac04",(int)12,"Pez Koi",(int)12000,(int)64);
        PezKoi k5=new PezKoi("ac05",(int)3,"Pez Koi",(int)7000,(int)27);
        PezKoi k6=new PezKoi("ac06",(int)27,"Pez Koi",(int)17250,(int)53);
        
//------------------------------------------------------------------------------

        Pez peces[]=new Pez[20];
        peces[0]=t;
        peces[1]=t2;
        peces[2]=t3;
        peces[3]=t4;
        peces[4]=t5;
        peces[5]=t6;
        peces[6]=t7;
        peces[7]=d;
        peces[8]=d2;
        peces[9]=d3;
        peces[10]=d4;
        peces[11]=d5;
        peces[12]=d6;
        peces[13]=d7;
        peces[14]=k;
        peces[15]=k2;
        peces[16]=k3;
        peces[17]=k4;
        peces[18]=k5;
        peces[19]=k6;
        
        imprimirConPolimorfismo(peces);
        
    }
    
//------------------------------------------------------------------------------
    
    public static void imprimirConPolimorfismo(Pez[] peces){
        for(Pez obj : peces){
            
            obj.informacion();
        }
    }
}
