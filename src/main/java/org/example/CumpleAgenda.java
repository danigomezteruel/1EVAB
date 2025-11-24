package org.example;
/**
 * @author Dani
 *
 */
public class CumpleAgenda {
    /**
     * Esta clase crea las variables de los datos del usuario
     * y les asigna el valor que este introduzca.
     */
    private String nombre;
    private int dia;
    private int mes;

    public CumpleAgenda(String nombre, int dia, int mes) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
}
