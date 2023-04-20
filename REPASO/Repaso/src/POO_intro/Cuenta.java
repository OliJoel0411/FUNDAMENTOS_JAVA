package POO_intro;

/**
 *
 * @author Oliver
 */
public class Cuenta {
    // Atributos
    // Tipo nombre;
    
    // Modificadores de acceso
    /*
    
    public: Se puede acceder desde cualquier clase. 
    private: Se puede acceder solo desde la clase donde es creada. (paquete donde se encuentra)
    protected: Se puede acceder desde una clase heredada
    
    */
    
    
    private int noCuenta;
    //private String IdUsuario;
    private double saldo;
    private String titular;
    
    // modificadores de acceso
    /*
    Get y Set
    Get: Consultores
    Set: Modificar
    Apuntador this
    this.noCuenta
    this.saldo
    
    
    
    */
    // Metodo consultor No. cuenta
    // modAcceso tipoRetorno nombreMetodo(){}
    public int getNoCuenta(){
        return this.noCuenta;
    }// Fin getNoCuenta
    
    // Metido modificador No Cuenta
    public void setNoCuenta(int cuenta){
    
        this.noCuenta = cuenta;
    
    }// fin setNoCuenta
    
    
    // Metodos
    /*
    Tipos de métodos
    Constructores, Modificadores, Consultores, Analizadores
    
    // Estructuras de métodos
    - Sin retorno y sin parametros --void--
    - Con retorno y sin parametros
    - con retorno y con parametros
    */
    // public void retirar(){}
    // public void depositar(){}
    // void transferir(){}
    
    // - Sin retorno y sin parametros
    //modAcceso tipoRetorno nombre (parametros){}
      public     void    consultarSaldo(){
          System.out.println(saldo);
      }
    // Con retorno y sin parametros
    //modAcceso tipoRetorno nombre (parametros){}
      public     String      consultarNoCuenta(){
        String msj = "El No de cuenta es: " + this.noCuenta;
        return  msj;
      }
    //- con retorno y con parametros ( tipoDato nombre)
      // Analizador
      public double depositar(double valor){
          
          if(valor<0){
              System.out.println("El valor es incorrecto");
              return this.saldo;
          }else{
          this.saldo += valor;
          return this.saldo;
            }
          
          
      }
}
