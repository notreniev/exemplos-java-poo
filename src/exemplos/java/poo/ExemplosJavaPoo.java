/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.poo;

/**
 *
 * @author everton
 */
public class ExemplosJavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Criação da instância do objeto c1
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
