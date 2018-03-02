
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
public class Escuadron {

    private String nombre;
    private String localidadbase;
    private String lema;
    private String lider;
    private String tipoescuadron;
    private ArrayList<Superheroes> heroes = new ArrayList();
    private ArrayList<Villanos> villanos = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre, String localidadbase, String lema, String lider, String tipoescuadron) {
        this.nombre = nombre;
        this.localidadbase = localidadbase;
        this.lema = lema;
        this.lider = lider;
        this.tipoescuadron = tipoescuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidadbase() {
        return localidadbase;
    }

    public void setLocalidadbase(String localidadbase) {
        this.localidadbase = localidadbase;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipoescuadron() {
        return tipoescuadron;
    }

    public void setTipoescuadron(String tipoescuadron) {
        this.tipoescuadron = tipoescuadron;
    }

    public ArrayList<Superheroes> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Superheroes> heroes) {
        this.heroes = heroes;
    }

    public ArrayList<Villanos> getVillanos() {
        return villanos;
    }

    public void setVillanos(ArrayList<Villanos> villanos) {
        this.villanos = villanos;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", localidadbase=" + localidadbase + ", lema=" + lema + ", lider=" + lider + ", tipoescuadron=" + tipoescuadron + ", heroes=" + heroes + ", villanos=" + villanos + '}';
    }
    
}
