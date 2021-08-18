/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2v2sesionvii;

import ClassPkg.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class PrincipalReto2v2sesionVII {

    private static Scanner inst_datos = new Scanner(System.in);
    //Modificar fondo y color del texto ANSI_RESET códigos de color
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeClassV2 employee = new EmployeeClassV2();
        ClientClassv2 client = new ClientClassv2();
        System.out.println(ANSI_BLUE + "************************" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "MINTIC. INC 2021" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "************************" + ANSI_RESET);
        System.out.println("Deseas trabajar con: \n     1. Empleados\n     2. Clientes");
        int option = Integer.parseInt(inst_datos.nextLine());
        if (option == 1) {
            employee.crud_employees();
        } else if (option == 2) {
            client.crud_clients();
        } else {
            System.out.println(ANSI_RED + "Opción invalida"+ANSI_RESET);
        }
    }
}
