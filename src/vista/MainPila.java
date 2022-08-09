/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Pila;

/**
 *
 * @author juan_fel.salazar
 */
public class MainPila {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Productos> pilaP=new Pila<>();
        pilaP.apilar(new Productos("arroz", 2, 5000));
        pilaP.apilar(new Productos("tomate", 2, 4000));
        pilaP.apilar(new Productos("aguacate", 2, 7000));
        pilaP.apilar(new Productos("frijol", 2, 6000));
        pilaP.apilar(new Productos("lechuga", 2, 3000));
        
        
        System.out.println("Pila \n"+pilaP.toString());
        
        pilaP.desapilar();
        System.err.println("Pila \n"+pilaP.toString());
    }
    
    
}
