
package pelicula;

import pelicula.model.*;

public class Film extends Main{
    private final String titulo;
    private final String director;
    private final String actor;
    private final String genero;
    private final int year;
    private final int duracion;
    private final int calificacion;
    private final int orden;
    
    
    public Film (String titulo, String director, String actor, String genero, int year, int duracion, int calificacion){
        this.titulo = titulo;
        this.director = director;
        this.actor = actor;
        this.genero = genero;
        this.year = year;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }
          
    public String getTituloFilm(){
        return titulo;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public int getYear(){
        return year;
    }

    public int getOrden() {
        return orden;
    }
    
    @Override
    public String toString(){
        return titulo + " , " + director + " , " + actor + " , " + genero +" , " + Integer.toString(year)+ Integer.toString(duracion) + Integer.toString(calificacion);
    }
        

}
