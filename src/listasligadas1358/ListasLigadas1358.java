/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasligadas1358;

import fes.aragon.unam.adts.DoubleLinkedList;
import fes.aragon.unam.modelo.Empleado;

/**
 *
 * @author LENOVO
 */
public class ListasLigadas1358 {
    public static void main(String[] args) {
        // aquí está el código de la lista simplemente ligada
        
        DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        
        System.out.println(".......-.......-.......");
        
        DoubleLinkedList ldl2 = new DoubleLinkedList();
        ldl2.append(new Empleado(12, "José", "Pérez", "García", 2300.0f, 4, 2018));
        ldl2.append(new Empleado(13, "María", "Pérez", "García", 2300.0f, 4, 2018));
        ldl2.append(new Empleado(14, "Diego", "Pérez", "García", 2300.0f, 4, 2018));
        ldl2.transversal();
        
               
    }
}
