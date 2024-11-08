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
public class PezDorado extends Pez{
    private int tamaño; //Puede llegar a medir 140 cm
    
    public PezDorado(String idPez, String especie, int precio, int tamaño,
            int stock, String urlImg){
        super(idPez,especie,precio,stock, urlImg);
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+", "+tamaño;
    }
    
    public void informacion(){
        System.out.println(getIdPez()+", "+getTamaño()+", "+getEspecie()+", "
                +getPrecio()+", "+getStock());
    }
}
