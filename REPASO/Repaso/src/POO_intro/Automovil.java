package POO_intro;

/**
 *
 * @author Oliver
 */
public class Automovil {
    // Atributos
    
    private String marca;
    private int modelo;

    // Metodo Constructor
    /* modAcceso nombreClase(parametros){
        Se inicializan los atributos
    }
*/
    
    public Automovil(String marca, int modelo){
        // inicializan
        this.marca = marca;
        this.modelo = modelo;
        
    }// fin constructor
    
    
    
    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }
    
    
    
}
