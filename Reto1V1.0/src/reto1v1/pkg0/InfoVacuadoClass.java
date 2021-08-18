/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1v1.pkg0;

/**
 *
 * @author lenovo
 */
public class InfoVacuadoClass {
    private String nombreyapellido;
    private String tipo_documento;
    private int num_documento;
    private boolean vacunado;

    public InfoVacuadoClass(String nombreyapellido, String tipo_documento, int num_documento, boolean vacunado) {
        this.nombreyapellido = nombreyapellido;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.vacunado = vacunado;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    
    public String mostrar_informacion_basica_paciente(){
        return ">> El nombre del paciente es " + getNombreyapellido() + "identificad@ con tipo de documento " + getTipo_documento() + "número " + getNum_documento();
    }
}