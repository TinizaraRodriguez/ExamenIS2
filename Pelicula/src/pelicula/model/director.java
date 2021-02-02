
package pelicula.model;

/**
 *
 * @author tinizara
 */

public class director extends personas {
    String firstNameDirector;
    String lastNameDirector;
    
    @Override
    void setNameDirector(String firstNameDirector, String lastNameDirector){
        this.firstNameDirector = firstNameDirector;
        this.lastNameDirector = lastNameDirector;
    }
     
    
    @Override
    public String getNameDirector(){
        return firstNameDirector + " " + lastNameDirector;
    } 

  
}
