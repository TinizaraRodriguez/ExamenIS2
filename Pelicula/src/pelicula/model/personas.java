
package pelicula.model;

/**
 *
 * @author tinizara
 */
public class personas {
    String firstNameDirector;
    String lastNameDirector;
    
    String firstNameActor;
    String lastNameActor;
    
    void setName(String firstNameActor, String lastNameActor){
        this.firstNameActor = firstNameActor;
        this.lastNameActor = lastNameActor;
    }
      
    public String getNameActor(){
        return firstNameActor + " " + lastNameActor;
    }  
    
    void setNameDirector(String firstNameDirector, String lastNameDirector){
        this.firstNameDirector  = firstNameDirector;
        this.lastNameDirector = lastNameDirector;
    }
      
    public String getNameDirector(){
        return firstNameDirector + " " + lastNameDirector;
    } 
    
}
