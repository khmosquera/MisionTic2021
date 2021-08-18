/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;
import personpackage.EmployeePersonClass;
import personpackage.ClientPersonClass;
import personpackage.personClass;
import personpackage.AdminPersonClass;

/**
 *
 * @author lenovo
 */
public class principalR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inst_input_data = new Scanner(System.in);
        ArrayList listEmployeePersons = new ArrayList();
        ArrayList listClientPersons = new ArrayList();

        System.out.println("Deseas añadir:\n        1. Empleados\n       2: Clientes\n ");
        int add_person_type = inst_input_data.nextInt();

        System.out.println("Cuántas personas deseas añadir: ");
        int cant_persons_add = inst_input_data. nextInt();

        if (add_person_type == 1) {
            for (int i = 1; i <= cant_persons_add; i++) {

                System.out.println("************************** EMPLEADO " + i + "**************\nNombre empleado: ");
                String name_employee = inst_input_data.next();

                System.out.println("Ingrese su Emmail: ");
                String emmail_employee = inst_input_data.next();
                System.out.println("¿El empleado ocupa un cargo administrativo? (Si, no)");
                String admin_position = inst_input_data.next();
                if (admin_position.toLowerCase().equals("si") || (admin_position.toLowerCase().equals("si"))) {
                    AdminPersonClass inst_admin = new AdminPersonClass(name_employee, emmail_employee, "Category", 23);
                    listEmployeePersons.add(inst_admin);
                } else if (admin_position.toLowerCase().equals("no")) {
                    EmployeePersonClass inst_employee = new EmployeePersonClass(name_employee, emmail_employee);
                    listEmployeePersons.add(inst_employee);
                } else {
                    System.out.println("Opción invalida");
                }
            }
            
            for (int i = 0; i < listEmployeePersons.size(); i++) {
                EmployeePersonClass inst_employee_get = (EmployeePersonClass) listEmployeePersons.get(i);
                System.out.println("Nombre: " + inst_employee_get.getName());
                System.out.println("Emmail: " + inst_employee_get.getEmail());
         
                    }
            System.out.println("¿Qué más deseas  hacer?\n    1. Listar los Empleados     2. Editar un empleado   3. Eliminar un empleado     4. Salir del sistema");
            int opcion_intermedia = inst_input_data.nextInt();
            if (opcion_intermedia == 1) {
                System.out.println("EMPLEADOS");
                for (int i = 0; i < listEmployeePersons.size(); i++) {
                    System.out.println("***********************************************************************");
                    System.out.println("Empleado: " + i);
                    //Obtener la información de cada persona
                    EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeePersons.get(i);
                    System.out.println("Nombre: " + inst_employee.getName());
                    System.out.println("Emmail: " + inst_employee.getEmail());
                    System.out.println("***********************************************************************");
                }
            } else if (opcion_intermedia == 2) {
                System.out.println("Posición del empleado que deseas editar: ");
                int index_employee = inst_input_data.nextInt();
                if (index_employee >= 0 && index_employee < listEmployeePersons.size());
                EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeePersons.get(index_employee);
                System.out.println("Nombre actual: " + inst_employee.getName());
                System.out.println("Emmail actual: " + inst_employee.getEmail());
                System.out.println("¿Qué quieres editar:?\n    1. Nombre     2. Emmail");
                int option_edit = inst_input_data.nextInt();
                if (option_edit == 1) {
                    System.out.println("Nombre");
                    String new_name = inst_input_data.next();
                    inst_input_data.nextLine();
                    inst_employee.setName(new_name);
                } else if (option_edit == 2) {
                    System.out.println("Emmail");
                    String new_Emmail = inst_input_data.next();
                    inst_employee.setEmail(new_Emmail);
                } else {
                    System.out.println("Opción invalida");
                }
                System.out.println("Informción actualizada");
                System.out.println("Nombre: " + inst_employee.getName());
                System.out.println("Emmail: " + inst_employee.getEmail());

            } else if (opcion_intermedia == 3) {
                System.out.println("Posición del empleado que deseas eliminar del sistema: ");
                int index_employee = inst_input_data.nextInt();
                if (index_employee >= 0 && index_employee < listEmployeePersons.size()) {
                    EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeePersons.remove(index_employee);

                    for (int i = 0; i < listEmployeePersons.size(); i++) {
                        EmployeePersonClass inst_employee_get = (EmployeePersonClass) listEmployeePersons.get(i);
                        System.out.println("Nombre: " + inst_employee.getName());
                        System.out.println("Emmail: " + inst_employee.getEmail());
                    }

                } else if (opcion_intermedia == 4) {
                    System.out.println("Salir: ");

                    if (add_person_type == 1) {
                        for (int i = 1; i <= cant_persons_add; i++) {

                            System.out.println("************************** CLIENTE " + i + "**************\nNombre cliente: ");
                            String name_client = inst_input_data.next();
                            inst_input_data.nextLine();

                            System.out.println("Ingrese su Emmail: ");
                            String emmail_client = inst_input_data.next();
                            inst_input_data.nextLine();

                            ClientPersonClass inst_client = new ClientPersonClass(name_client, emmail_client);
                            listClientPersons.add(inst_client);
                        }
                        System.out.println("¿Qué más deseas hacer?\n    1. Listar Clientes     2. Editar información de un cliente  3. Eliminar cliente     4. Salir del sistema");
                        if (opcion_intermedia == 1) {
                            System.out.println("Clientes");
                            for (int i = 0; i < listClientPersons.size(); i++) {
                                System.out.println("***********************************************************************");
                                System.out.println("Cliente: " + i);
                                //Obtener la información de cada persona
                                ClientPersonClass inst_client = (ClientPersonClass) listClientPersons.get(i);
                                System.out.println("Nombre: " + inst_client.getName());
                                System.out.println("Emmail: " + inst_client.getEmail());
                                System.out.println("***********************************************************************");
                            }
                        } else {
                            System.out.println("Opción invalida");

                        }

                    }
                }
            }
        }
    }
}
