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
public class AdminPersonClass extends EmployeePersonClass {
    private String category;
    private int num_subordinates;
  
    public AdminPersonClass(String name, String email,String category, int num_subordinates) {
        super(name, email);
        this.category = category;
        this.num_subordinates = num_subordinates;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNum_subordinates() {
        return num_subordinates;
    }

    public void setNum_subordinates(int num_subordinates) {
        this.num_subordinates = num_subordinates;
    }
    
}
