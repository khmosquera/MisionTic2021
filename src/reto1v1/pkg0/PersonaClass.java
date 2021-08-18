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
public class PersonaClass {
//1. Declarar atributos globales de la clase
//2.Encapsulate fields click 
//3. Insertar el constructor de la clase.
//4. Creamos el metodo o la fución que devuelve la información de los getter

private String nombreyapellido_user;
private String tipo_documento;
private String numero_documento;
private char sexo;
private int peso;
private float estatura;
private String lugar_nacimiento;
private String direccion;
private String barrio;
private String telefono;
private String ocupacion;
private String estado_civil;
private boolean presenta_discapacidad;
private boolean presenta_cormobilidades;
private boolean estado_vacunado;

//Forma 1: Constructor de la clase

    public PersonaClass(String nombreyapellido_user, String tipo_documento, String numero_documento, char sexo, int peso, float estatura, String lugar_nacimiento, String direccion, String barrio, String telefono, String ocupacion, String estado_civil, boolean presenta_discapacidad, boolean presenta_cormobilidades, boolean estado_vacunado) {
        this.nombreyapellido_user = nombreyapellido_user;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.lugar_nacimiento = lugar_nacimiento;
        this.direccion = direccion;
        this.barrio = barrio;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.estado_civil = estado_civil;
        this.presenta_discapacidad = presenta_discapacidad;
        this.presenta_cormobilidades = presenta_cormobilidades;
        this.estado_vacunado = estado_vacunado;
    }
//Forma 2: Encapsulamiento de variables
    //La función GET para obtener o consultar el valor de un atributo
    //El método SET para modificaro o editar el valor de un atributo

    public String getNombreyapellido_user() {
        return nombreyapellido_user;
    }

    public void setNombreyapellido_user(String nombreyapellido_user) {
        this.nombreyapellido_user = nombreyapellido_user;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public boolean isPresenta_discapacidad() {
        return presenta_discapacidad;
    }

    public void setPresenta_discapacidad(boolean presenta_discapacidad) {
        this.presenta_discapacidad = presenta_discapacidad;
    }

    public boolean isPresenta_cormobilidades() {
        return presenta_cormobilidades;
    }

    public void setPresenta_cormobilidades(boolean presenta_cormobilidades) {
        this.presenta_cormobilidades = presenta_cormobilidades;
    }

    public boolean isEstado_vacunado() {
        return estado_vacunado;
    }

    public void setEstado_vacunado(boolean estado_vacunado) {
        this.estado_vacunado = estado_vacunado;
    }

}
