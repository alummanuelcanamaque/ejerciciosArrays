/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.vectorseleccion;

import java.util.ArrayList;

/**
 *
 * @author Manuel Cañamaque
 */
public class NewMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] origen = {1,4,10,32,60,91,34,56,73,88,86};
        ArrayList<Integer> pares = new ArrayList();        
        for (int i = 0; i < origen.length; i++) {
            if(origen[i]%2==0 && origen[i]>50){                
                pares.add(origen[i]);
            }
        }
        System.out.println("Valores pares: ");
        for(Integer valor:pares){
            System.out.print(" " +valor);
        }
//        int[] origen = {1,4,10,32,60,91,34,56,73,88,86};        
//        int contador_pares =0;
//        int contador = 0;
//        for (int i = 0; i < origen.length; i++) {
//            if(origen[i]%2==0 && origen[i]>50){                
//                ++contador_pares;
//            }
//        }
//        int[] pares = new int[contador_pares];
//        
//        for (int i = 0; i < origen.length; i++) {
//            if(origen[i]%2==0 && origen[i]>50){               
//                pares[contador]=origen[i];
//                ++contador;
//            }
//        } 
//        
//        System.out.println("Vector origen:");
//        for (int i = 0; i < origen.length; i++) {
//            System.out.print(" "+origen[i]);
//        }
//        
//        System.out.println("\nVector pares: ");
//        for (int i = 0; i < pares.length; i++) {            
//            System.out.print(" "+pares[i]);
//        }

    }
}
