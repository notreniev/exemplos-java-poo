/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.visibilidade;

/**
 *
 * @author everton
 */
public class ExemploJavaVisibilidade {

    public static void main(String[] args) {
        exemplos.java.visibilidade.Caneta c1 = new exemplos.java.visibilidade.Caneta(); // Criação da instância do objeto c1
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
