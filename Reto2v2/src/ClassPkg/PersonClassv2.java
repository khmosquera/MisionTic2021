/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPkg;

/**
 *
 * @author lenovo
 */
public class PersonClassv2 {

    //Atributos de la clase (Superclase) persona 
    private int document;
    private String name;
    private String email;

    // Despues de agregar atributos a la superclase, encapsulamos las variables, y creamos constructor
    public PersonClassv2() {
    }

    public PersonClassv2(int document, String name, String email) {
        this.document = document;
        this.name = name;
        this.email = email;
    }

    /**
     * @return the document
     */
    public int getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(int document) {
        this.document = document;
    }

    /**
     * @return the name
     */
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
}
