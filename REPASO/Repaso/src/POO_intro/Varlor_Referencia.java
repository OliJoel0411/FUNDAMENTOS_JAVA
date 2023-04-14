package POO_intro;

/**
 *
 * @author Oliver
 */
public class Varlor_Referencia {
    public static void main(String[] args) {
        //Instancia
        //Creación de Objetos
    // TipoObjeto  nombreRef =  new (instancia-Ref_Memoria)
         // ref_Memoria
        Cuenta cuentaOli  = new Cuenta();
        Cuenta cuentaJoel = cuentaOli;
        Cuenta cuentaJose = cuentaOli;
        Cuenta cuentaMag  = cuentaOli;
        Cuenta cuentaHey  = new Cuenta();
        cuentaOli.noCuenta  = 12345;
        cuentaJoel.noCuenta = 88881;
        cuentaJose.noCuenta = 85881;
        cuentaMag.noCuenta  = 99999;
        cuentaHey.noCuenta  = 77777;
        
        
        
        int numero  = 10;// Primitivo (espacio de memoria) 
        int numero2 = numero;
        numero2 = 15;
        System.out.println(numero);// 10
        System.out.println(numero2);// 15
        System.out.println(cuentaOli);
        System.out.println(cuentaJoel);
        // referencias
        
        System.out.println(cuentaOli.noCuenta);//99999
        System.out.println(cuentaJoel.noCuenta);//99999
        System.out.println(cuentaJose.noCuenta);//99999
        System.out.println(cuentaMag.noCuenta);//99999
        System.out.println(cuentaHey.noCuenta);// 77777
    }
}
