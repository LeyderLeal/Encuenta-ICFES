/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author SENA
 */
public class Rum {

    static String getnombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String identificacion;
    private String nombre;
    private int icfes;

    public Rum(String identificacion, String nombre, int icfes) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.icfes = icfes;
    }

    public String getIdentificacion() {
        return identificacion;
    }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIcfes() {
        return icfes;
    }

    public void setIcfes(int icfes) {
        this.icfes = icfes;
    }
}
