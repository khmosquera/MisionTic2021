/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personpackage;

/**
 *
 * @author lenovo
 */
public class PositionClass {

    private String name;
    private String hierarchy_level;
    private EmployeePersonClass employee;
    
    public PositionClass(String name, String hierarchy_level, EmployeePersonClass employee) {
        this.name = name;
        this.hierarchy_level = hierarchy_level;
        this.employee = employee;

        //Hasta aquí estpy trayendo toda la información que tiene la clase persona
    }

    public EmployeePersonClass getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeePersonClass employee) {
        this.employee = employee;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hierarchy_level
     */
    public String getHierarchy_level() {
        return hierarchy_level;
    }

    /**
     * @param hierarchy_level the hierarchy_level to set
     */
    public void setHierarchy_level(String hierarchy_level) {
        this.hierarchy_level = hierarchy_level;
    }

}
