/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author javie
 */
public class PezTropical extends Pez {
    private String color;
    
    public PezTropical(String idPez,String color, String especie, int precio, 
            int stock){
        super(idPez,especie,precio,stock);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+", "+color;
    }
    
    public void informacion(){
        System.out.println(getIdPez()+", "+getColor()+", "+getEspecie()+", "
                +getPrecio()+", "+getStock());
    }
}
