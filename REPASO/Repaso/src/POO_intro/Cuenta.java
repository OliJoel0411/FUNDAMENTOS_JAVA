package POO_intro;

/**
 *
 * @author Oliver
 */
public class Cuenta {
    // Atributos
    // Tipo nombre;
    int noCuenta;
    double saldo;
    String titular;
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
              return saldo;
          }else{
          saldo += valor;
          return saldo;
            }
          
          
      }
}
