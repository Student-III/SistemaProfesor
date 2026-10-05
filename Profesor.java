
package com.mycompany.sistemaprofesor;

public class Profesor {
    private String nombre;
    private int edad;
    private String categoriadocente;

    public Profesor(String nombre, int edad, String categoriadocente) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoriadocente = categoriadocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoriadocente() {
        return categoriadocente;
    }

    public void setCategoriadocente(String categoriadocente) {
        this.categoriadocente = categoriadocente;
    }
    
}
