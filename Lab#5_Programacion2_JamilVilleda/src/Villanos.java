
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
public class Villanos {

    private String nombre;
    private int poder;
    private int debilidad;
    private ArrayList<Escuadron> escuadronvillano = new ArrayList();
    private int fuerza;
    private int agilidadfisica;
    private int agilidadmental;

    public Villanos() {
    }

    public Villanos(String nombre, int poder, int debilidad, int fuerza, int agilidadfisica, int agilidadmental) {
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(int debilidad) {
        this.debilidad = debilidad;
    }

    public ArrayList<Escuadron> getEscuadronvillano() {
        return escuadronvillano;
    }

    public void setEscuadronvillano(ArrayList<Escuadron> escuadronvillano) {
        this.escuadronvillano = escuadronvillano;
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
        return "Villanos{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadronvillano=" + escuadronvillano + ", fuerza=" + fuerza + ", agilidadfisica=" + agilidadfisica + ", agilidadmental=" + agilidadmental + '}';
    }

}
