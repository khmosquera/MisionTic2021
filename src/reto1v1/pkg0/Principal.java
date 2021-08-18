/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1v1.pkg0;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear instancia de la clase persona
        PersonaClass inst_persona = new PersonaClass("Karen", "C.C", "1018466", 'F', 69, 1.73f, "Bogotá", "Tv 59 # 75 08 sur ", "Sierra Morena", "7150522", "Estudiante", "Soltera", false, false, false);
        System.out.println("Nombre: " + inst_persona.getNombreyapellido_user() + "\n" + "Tipo de documento: " + inst_persona.getTipo_documento() + "\n" + "Número: " + inst_persona.getNumero_documento() + "\n" + "Sexo: " + inst_persona.getSexo() + "\n" + "Peso: " + inst_persona.getPeso() + "\n" + "Estatura: " + inst_persona.getEstatura()+ "\n" + "Lugar de nacimiento: " + inst_persona.getLugar_nacimiento() + "\n" + "Dirección: " + inst_persona.getDireccion() + "\n" + "Barrio: " + inst_persona.getBarrio() + "\n" + "Telefono: " + inst_persona.getTelefono() + "\n" + "Ocupación: " + inst_persona.getOcupacion() + "\n" + "Estado civil: " + inst_persona.getEstado_civil() + "\n" + "Presenta discapacidades: " + inst_persona.isPresenta_discapacidad() + "\n" + "Presenta cormobilidades: " + inst_persona.isPresenta_cormobilidades() + "\n" + "Se encuentra vacunado: " + inst_persona.isEstado_vacunado() + "\n");
        // Modificar estado vacunado
        inst_persona.setEstado_vacunado(true);
        PersonaClass inst_paciente1 = new PersonaClass("Karen", "C.C", "1018466", 'F', 69, 1.73f, "Bogotá", "Tv 59 # 75 08 sur ", "Sierra Morena", "7150522", "Estudiante", "Soltera", false, true, true);

        //consultar edad del paciente
        // Modificar el antecedente de padece cormobilidades
//Llamar función mostrar_informacion_PersonaClass




    }

}
