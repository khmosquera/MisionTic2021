/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author lenovo
 */
public class ItemDoctorInt {
    
    private int idHospital;
    private String hospital;

    public ItemDoctorInt(int idHospital, String hospital) {
        this.idHospital = idHospital;
        this.hospital = hospital;
    }

    public ItemDoctorInt() {
    }
    
    

    /**
     * @return the idHospital
     */
    public int getIdHospital() {
        return idHospital;
    }

    /**
     * @param idHospital the idHospital to set
     */
    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
        return getHospital();
    }
    
}
