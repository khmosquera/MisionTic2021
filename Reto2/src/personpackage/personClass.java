/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class personClass {
    // 1. Decalarar las variables con vivisibilidad private  

    private String name;
    private String email;

    //2. Insertar el constructor de la clase con todos los parámetros
    public personClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * @return the name
     */
    // 3.Añadir los getter and setter 
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public void person_crud() {

        Scanner inst_input_data = new Scanner(System.in);
        ArrayList listPersons = new ArrayList();

        System.out.println("Deseas añadir:\n        1. Empleados\n       2: Clientes\n ");
        int add_person_type = inst_input_data.nextInt();

        System.out.println("Cuántas personas deseas añadir: ");
        int cant_persons_add = inst_input_data.nextInt();

        if (add_person_type == 1) {
            for (int i = 1; i <= cant_persons_add; i++) {

                System.out.println("************************** EMPLEADO " + i + "**************\nNombre empleado: ");
                String name_employee = inst_input_data.nextLine();
                inst_input_data.nextLine();
                System.out.println("Ingrese su Emmail: ");
                String emmail_employee = inst_input_data.nextLine();
                
                EmployeePersonClass inst_employee = new EmployeePersonClass(name_employee, emmail_employee);
                listPersons.add(inst_employee);
            }
        }
    }

}


