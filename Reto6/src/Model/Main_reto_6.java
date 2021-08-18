/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.IntHospital;

/**
 *
 * @author lenovo
 */
public class Main_reto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_connect = new Conexion();
        IntHospital inst_frame = new IntHospital();
        inst_connect.getConnection();
        inst_frame.setVisible(true);
        DataModelDB model = new DataModelDB();
        model.getOwners(1);
        model.getBreed();
        model.getHospital();
    }
    
}
