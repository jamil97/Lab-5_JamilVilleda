
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
public class EscuadronHeroes {

    private String nombre;
    private String localidadbase;
    private String lema;
    private String lider;
    private ArrayList<Superheroes> heroes = new ArrayList();
    private boolean tipo = false;
   

    public EscuadronHeroes() {
    }

    public EscuadronHeroes(String nombre, String localidadbase, String lema, String lider) {
        this.nombre = nombre;
        this.localidadbase = localidadbase;
        this.lema = lema;
        this.lider = lider;
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

    public ArrayList<Superheroes> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Superheroes> heroes) {
        this.heroes = heroes;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "Escuadron Heroes!    " + "Nombre: " + nombre + "  Localidad: " + localidadbase;
    }
    
}
