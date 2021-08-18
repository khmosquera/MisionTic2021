/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPkg;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class EmployeeClassV2 extends PersonClassv2 {
    //Hereda de la clase persona(Extends); luego se agrega el constructor

    private int salary;
    private static Scanner inst_datos = new Scanner(System.in);
    //Modificar fondo y color del texto ANSI_RESET códigos de color
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public EmployeeClassV2() {
    }

    public EmployeeClassV2(int document, String name, String email, int salary) {
        super(document, name, email);
        this.salary = salary;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void crud_employees() {
        //Método CRUD empleados -lista empleados(Array)
        ArrayList<EmployeeClassV2> employee_list = new ArrayList<>();
        //Menú de opciones
        boolean exit_program = false;
        //Ciclo para mostrar el Menú de opciones
        //While(exit_program == true) - Traducción = Mientras esto no sea falso
        while (!exit_program) {

            System.out.println(ANSI_PURPLE + "=====================================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Seleciona una opción del menú: ");
            System.out.println("    1. Crear empleado");
            System.out.println("    2. Consultar empleados de Mintic.In");
            System.out.println("    3. Editar empleado");
            System.out.println("    4. Eliminar empleado");
            System.out.println("    5. " + ANSI_RED + "Salir del sistema");
            System.out.println(ANSI_BLUE + "Ingresa tu respuesta" + ANSI_RESET);
            //"Convertir número recibido como texto a entero (PARSEO)
            int option = Integer.parseInt(inst_datos.nextLine());
            //Metodos para ArrayList
            //add(valor) - Método para añadir al final
            //get(v indice)- Método para consultar un valor
            //set(indice, valor nuevo)- Método para modificar
            //Remove(Indice) Método para eliminar 

            //Estructura condicional SWITH CASE (varios casos de acuerdo con la elección de usuario)
            switch (option) {
                case 1:
                    //Crear empleado
                    System.out.println(ANSI_BLUE + "¿Cuántos empleados deseas añadir?" + ANSI_RESET);
                    int num_employees = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" + ANSI_PURPLE + "=====================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Formulario de registro de empleados: ");
                    for (int i = 1; i <= num_employees; i++) {
                        //Se solicita la información y se guarda en variables
                        System.out.println(ANSI_BLUE + "    Documento: " + ANSI_RESET);
                        int document = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET);
                        String name = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "    Email: " + ANSI_RESET);
                        String email = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "    Salario: " + ANSI_RESET);
                        int salary = Integer.parseInt(inst_datos.nextLine());

                        //Intancia para acceder a la información
                        EmployeeClassV2 employee = new EmployeeClassV2(document, name, email, salary);
                        employee_list.add(employee);
                        System.out.println(ANSI_PURPLE + "================Empleado creado con éxito==============" + ANSI_RESET);
                    }
                    break;
                case 2:
                    //Consultar empleados Mintic
                    System.out.println(ANSI_PURPLE + "Base de datos empleados Mintic.in" + ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println("\n" + ANSI_PURPLE + "    Empleado " + (i + 1) + ANSI_RESET);
                        //Instancia para consultar un array list
                        EmployeeClassV2 employee = employee_list.get(i);
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee.getSalary());
                    }
                    break;
                case 3:
                    //Editar empleado
                    System.out.println(ANSI_BLUE + "Editar infirmación de un empleado" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a editar: ");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        EmployeeClassV2 employee = employee_list.get(index);
                        System.out.println(ANSI_BLUE + "********* Información actual del empleado" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "    Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "    Email: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "    Salario: " + ANSI_RESET + employee.getSalary());
                        System.out.println("¿Qué campo deseas editar?\n     1. Documento\n      2.Nombre\n      3.Correo\n      4.Salario");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Documento nuevo" + ANSI_RESET);
                                int document = Integer.parseInt(inst_datos.nextLine());
                                employee.setDocument(document);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                employee.setName(name);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Correo nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                employee.setEmail(email);
                                break;
                            case 4:
                                System.out.println(ANSI_PURPLE + "Salario nuevo" + ANSI_RESET);
                                int salary = Integer.parseInt(inst_datos.nextLine());
                                employee.setSalary(salary);
                                break;
                        }
                        System.out.println(ANSI_PURPLE + "================La información del empleado ha sido actualizada con éxito==============" + ANSI_RESET);

                    }
                    break;
                case 4:
                    System.out.println(ANSI_RED + "================Eliminar empleado de Mintic.In==============" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= employee_list.size()) {
                        EmployeeClassV2 employee = employee_list.get(index_remove);
                        System.out.println(ANSI_BLUE + "********* Información actual del empleado" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "    Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println("¿Estás seguro de que deseas eliminar la informació del empleado " + ANSI_BLUE + employee.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            employee_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "*****Cancelando proceso**********" + ANSI_RESET);
                        }
                        System.out.println(ANSI_PURPLE + "Base de datos empleados Mintic.in" + ANSI_RESET);
                        for (int i = 0; i < employee_list.size(); i++) {
                            System.out.println("\n" + ANSI_PURPLE + "    Empleado " + (i + 1) + ANSI_RESET);
                            //Instancia para consultar un array list
                            EmployeeClassV2 employee_new = employee_list.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee.getDocument());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee.getName());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee.getSalary());
                        }
                    }
                    break;
                case 5:
                    exit_program = true;
                    System.out.println(ANSI_RED + "************Saliendo del programa************" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "\\************Opción inválida****************//" + ANSI_RESET);

            }
        } 

    }
}
