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
public class ClientPersonClass extends personClass {
    
    public ClientPersonClass(String name, String email) {
        super(name, email);
    }
    
    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }
}
