
package pelicula.model;

/**
 *
 * @author tinizara
 */

public class actor extends personas{
    String firstNameActor;
    String lastNameActor;
    
    @Override
    void setName(String firstNameActor, String lastNameActor){
        this.firstNameActor = firstNameActor;
        this.lastNameActor = lastNameActor;
    }
     
   @Override
    public String getNameActor(){
        return firstNameActor + " " + lastNameActor;
    }  

}
