/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lenovo
 */
public class DataDB {
    private int idOwner;
    private String owner;
    
    private int idBreed;
    private String breedName;
    
    private int idHospital;
    private String hospitalName;

    public DataDB() {
        this.idOwner = 0;
        this.owner = "";
        
        this.idBreed = 0;
        this.breedName = "";
        
        this.idHospital = 0;
        this.hospitalName = "";
    }

        
    /**
     * @return the idOwner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * @param idOwner the idOwner to set
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the idBreed
     */
    public int getIdBreed() {
        return idBreed;
    }

    /**
     * @param idBreed the idBreed to set
     */
    public void setIdBreed(int idBreed) {
        this.idBreed = idBreed;
    }

    /**
     * @return the breedName
     */
    public String getBreedName() {
        return breedName;
    }

    /**
     * @param breedName the breedName to set
     */
    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    /**
     * @return the idDoctor
     */
    public int getIdDoctor() {
        return idHospital;
    }

    /**
     * @param idDoctor the idDoctor to set
     */
    public void setidHospital(int idDoctor) {
        this.idHospital = idDoctor;
    }

    /**
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
}
