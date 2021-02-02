
package pelicula.model;


public abstract class genero {
    String accion;
    String comedia;
    String cienciaFiccion;
    String drama;
    String fantasia;
    String musical; 
    
    void setGenero(String accion, String comedia, String cienciaFiccion, String fantasia, String musical){
        this.accion = accion;
        this.comedia = comedia;
        this.cienciaFiccion = cienciaFiccion;
        this.drama = drama;
        this.fantasia = fantasia;
        this.musical = musical;
    }
    
    public String getGenero(){
        return genero;
    }

}
