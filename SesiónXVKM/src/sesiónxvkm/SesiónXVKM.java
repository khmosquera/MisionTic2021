/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiónxvkm;

import model_pkg.ModelDatosDB;
import model_pkg.Pool;
import view_pkg.Principal;

/**
 *
 * @author lenovo
 */
public class SesiónXVKM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDatosDB new_pool = new ModelDatosDB();
        Principal new_frame = new Principal();
        new_pool.getProducts(0);
        new_frame.setVisible(true);
        
    }
    
}
