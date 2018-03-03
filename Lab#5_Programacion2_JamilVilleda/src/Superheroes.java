
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jamil
 */
public class Superheroes extends EscuadronHeroes {

    private String nombre;
    private String poder;
    private String debilidad;
    private int fuerza;
    private int agilidadfisica;
    private int agilidadmental;

    public Superheroes() {
    }

    public Superheroes(String nombre, String poder, String debilidad, int fuerza, int agilidadfisica, int agilidadmental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadfisica = agilidadfisica;
        this.agilidadmental = agilidadmental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(int agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public int getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(int agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    @Override
    public String toString() {
        return "* Nombre superheroe => " + nombre + "" + ", Poder => " + poder;
    }

}
