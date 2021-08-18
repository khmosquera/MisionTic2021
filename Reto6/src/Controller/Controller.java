/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataDB;
import Model.DataModelDB;
import Model.ReportPetByBreed;
import Model.ReportPetByGender;
import View.IntDoctors;
import View.IntPets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Controller implements ActionListener {
    
    private final IntPets view;
    private final IntDoctors view2;
    
    public final void events() {
        view.cb_petOwner.addActionListener(this);
        view.cb_breed.addActionListener(this);
    }
    
    public final void events2() {
        view2.cb_hospital.addActionListener(this);
    }

    
    DataModelDB model = new DataModelDB();


    public Controller(IntPets view) {
        this.view = view;
        this.view2 = null;
        getOwners();
        Item item = (Item) view.cb_petOwner.getSelectedItem();
        events();
        
        getBreed();
        Item item_breed = (Item) view.cb_breed.getSelectedItem();
        events();
        
    }
    
    public Controller(IntDoctors view2) {
        this.view = null;
        this.view2 = view2;
        getHospital();
        ItemDoctorInt item = (ItemDoctorInt) view2.cb_hospital.getSelectedItem();
        events2();
    }
    

    public final void getOwners() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getOwners(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                view.cb_petOwner.addItem(new Item(idOwner, owner));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public final void getBreed() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getBreed();
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idBreed = list.get(i).getIdBreed();
                String breedName = list.get(i).getBreedName();
                view.cb_breed.addItem(new Item(idBreed, breedName));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public final void getHospital() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getHospital();
        System.out.println(list.size());
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idHospital = list.get(i).getIdDoctor();
                String hospitalName = list.get(i).getHospitalName();
                view2.cb_hospital.addItem(new ItemDoctorInt(idHospital, hospitalName));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public LinkedList<ReportPetByGender> ListPetByGender() {
        LinkedList<ReportPetByGender> report = this.model.ListPetByGender();
        return report;        
    }

    public LinkedList<ReportPetByBreed> ListPetByBreed() {
        LinkedList<ReportPetByBreed> report = this.model.ListPetByBreed();
        return report;        
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    
    
        
}
