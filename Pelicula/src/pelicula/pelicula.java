
package pelicula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;


/**
 *
 * @author tinizara
 */


public class pelicula {
    
    public class Pelicula <T>{
    private String nombre;
    private SortedSet<Film> peliculas;
    
    
    public boolean add(Film peli){
        Iterator<Film> i = peliculas.iterator();
        while(i.hasNext()){
            Film actual= i.next();
            if(actual.getTituloFilm().equals(peli.getTituloFilm()) && actual.getYear() == peli.getYear()){
                return false;
            }
        }
        peliculas.add(peli);
        return true;

    }
    
    
    public List <String> getGenero (){
        SortedMap <String, Integer> mapa = new TreeMap <> ();
        List <String> strings = new ArrayList<>();
        for(Film f: peliculas){
            int i = 1;
            if(mapa.containsKey(f.getGenero())){
                i += mapa.get(f.getGenero());
            }
            mapa.put(f.getGenero(),i);
        }
        for(Map.Entry<String,Integer> dupla: mapa.entrySet()){
            String res = dupla.getKey()+": "+dupla.getValue();
            strings.add(res);
        }
        return strings;
        }
    
    @Override
    public String toString(){
        String res = this.nombre + ":\n";
        int cont = 0;
        for(Film f: peliculas ){
            cont++;
            res += cont + ") " + f.toString() + "\n";
        }
        return res;
    }
    
    }
}
