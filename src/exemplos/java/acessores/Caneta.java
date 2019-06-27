/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.acessores;

/**
 *
 * @author everton
 */
public class Caneta {
    
    private String modelo;
    private float ponta;
    private boolean tampar;

    public Caneta() {
    }

    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampar();
    }
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampar = true;
    }
    
    public void destampar(){
        this.tampar = false;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Caneta tampada: " + this.tampar);
    }
    
    
}
