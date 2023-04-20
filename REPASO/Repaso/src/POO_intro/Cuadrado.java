package POO_intro;

/**
 *
 * @author Oliver
 */
public class Cuadrado {
    // Atributos
    private int lado1;
    private int lado2;
    
    // Sobrecarga de Constructores 
    
    // tipo 1 Constructor
    public Cuadrado(){
        this.lado1 = 4;
        this.lado2 = 8;
    }
    // tipo 2 Constructor
    public Cuadrado(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Consultores

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }
    
    // Modificadores

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    // Analizadores 
    
    public String calcularPerimetro(){
        int perimetro = 0;
        
        perimetro = (this.lado1 + this.lado2)*2;
        
        return "El perimtro es: " + perimetro;
    }
    
    
}
