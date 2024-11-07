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
public abstract class Pez implements ICalculable {
    private String idPez;
    private String especie;
    protected int precio;
    protected int stock;
    
    public Pez(String idPez, String especie, int precio, int stock){
        this.idPez = idPez;
        this.especie = especie;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIdPez() {
        return idPez;
    }

    public void setIdPez(String idPez) {
        this.idPez = idPez;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return idPez+", "+especie+", "+precio+", "+stock;
    }
    
    public abstract void informacion();
}
