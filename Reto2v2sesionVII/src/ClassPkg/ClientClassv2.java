/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ClientClassv2 extends PersonClassv2 {

    private static Scanner inst_datos = new Scanner(System.in);
    //Modificar fondo y color del texto ANSI_RESET códigos de color
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public ClientClassv2() {
    }

    public ClientClassv2(int document, String name, String email) {
        super(document, name, email);
    }

    public void crud_clients() {
        //Método CRUD empleados -lista de clientes (Array)
        ArrayList<ClientClassv2> client_list = new ArrayList<>();
        boolean exit_program = false;
        //Ciclo para mostrar el Menú de opciones
        //While(exit_program == true) - Traducción = Mientras esto no sea falso
        while (!exit_program) {

            System.out.println(ANSI_PURPLE + "=====================================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Seleciona una opción del menú: ");
            System.out.println("    1. Crear cliente");
            System.out.println("    2. Consultar clientes de Mintic.In");
            System.out.println("    3. Editar cliente");
            System.out.println("    4. Eliminar cliente");
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
                    //Crear cliente
                    System.out.println(ANSI_BLUE + "¿Cuántos clientes deseas añadir?" + ANSI_RESET);
                    int num_clients = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" + ANSI_PURPLE + "=====================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Formulario de registro de clientes: ");
                    for (int i = 1; i <= num_clients; i++) {
                        //Se solicita la información y se guarda en variables
                        System.out.println("\n" + ANSI_BLUE + "    Cliente: " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Documento:" + ANSI_RESET);
                        int document = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET);
                        String name = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "    Email: " + ANSI_RESET);
                        String email = inst_datos.nextLine();

                        //Intancia para acceder a la información
                        ClientClassv2 client = new ClientClassv2(document, name, email);
                        client_list.add(client);
                        System.out.println(ANSI_PURPLE + "================ Cliente creado con éxito==============" + ANSI_RESET);
                    }
                    break;
                case 2:
                    //Consultar clientes Mintic
                    System.out.println(ANSI_PURPLE + "Base de datos clientes Mintic.in" + ANSI_RESET);
                    for (int i = 0; i < client_list.size(); i++) {
                        System.out.println("\n" + ANSI_PURPLE + "    Cliente " + (i + 1) + ANSI_RESET);
                        //Instancia para consultar un array list
                        ClientClassv2 client = (ClientClassv2) client_list.get(i);
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + client.getEmail());
                    }
                    break;
                case 3:
                    //Editar empleado
                    System.out.println(ANSI_BLUE + "Editar infirmación de un cliente" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a editar: ");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= client_list.size()) {
                        ClientClassv2 client = client_list.get(index);
                        System.out.println(ANSI_BLUE + "********* Información actual del cliente" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "    Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "    Email: " + ANSI_RESET + client.getEmail());

                        System.out.println("¿Qué campo deseas editar?\n     1. Documento\n      2.Nombre\n      3.Correo\n");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Documento nuevo" + ANSI_RESET);
                                int document = Integer.parseInt(inst_datos.nextLine());
                                client.setDocument(document);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                client.setName(name);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Correo nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                client.setEmail(email);
                                break;
                            default:
                                System.out.println(ANSI_PURPLE + "OPCIÓN INVÁLIDA" + ANSI_RESET);
                                break;
                        }
                        System.out.println(ANSI_RED + "============= La información del cliente se ha actualizado con éxito" + ANSI_RESET);
                    }
                    break;

                case 4:
                    System.out.println(ANSI_RED + "================Eliminar cliente de Mintic.In==============" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= client_list.size()) {
                        ClientClassv2 client = client_list.get(index_remove);
                        System.out.println(ANSI_BLUE + "********* Información actual del cliente" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "    Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "    Nombre: " + ANSI_RESET + client.getName());
                        System.out.println("¿Estás seguro de que deseas eliminar la informació del cliente " + ANSI_BLUE + client.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            client_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "*****Cancelando proceso**********" + ANSI_RESET);
                        }
                        System.out.println(ANSI_PURPLE + "Base de datos clientes Mintic.in" + ANSI_RESET);
                        for (int i = 0; i < client_list.size(); i++) {
                            System.out.println("\n" + ANSI_PURPLE + "    cliente " + (i + 1) + ANSI_RESET);
                            ClientClassv2 client_new = client_list.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + client_new.getDocument());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client_new.getName());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + client_new.getEmail());
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
