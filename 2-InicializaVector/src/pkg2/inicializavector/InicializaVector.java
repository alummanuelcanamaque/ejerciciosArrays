/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.inicializavector;

/**
 *
 * @author Manuel Cañamaque
 */
public class InicializaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.println("posicion "+i+": valor "+array[i]);
        }
    }
    
}
