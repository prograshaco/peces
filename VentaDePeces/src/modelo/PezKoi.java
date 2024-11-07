/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Pez;

/**
 *
 * @author javie
 */
public class PezKoi extends Pez{
    private int edad; //Tiene una esperanza de vida de entre 25 a 35 años
    
    public PezKoi(String idPez,String especie, int precio, int edad, int stock){
        super(idPez,especie,precio,stock);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+", "+edad;
    }
    
    public void informacion(){
        System.out.println(getIdPez()+", "+getEspecie()+", "+getPrecio()+", "
                +getEdad()+", "+getStock());
    }
}
