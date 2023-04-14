package POO_intro;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        
        Cuenta cuentaOli = new Cuenta();
        
        cuentaOli.saldo = 300.0;
        cuentaOli.noCuenta = 12345;
        System.out.println("Implementando metodos sin retorno y sin par...");
        cuentaOli.consultarSaldo();
        
        System.out.println(" ");
        System.out.println("Implementando metodos con retorno y sin par...");
        System.out.println(cuentaOli.consultarNoCuenta());
        double valor = 0.0;
        System.out.println("Ingrese el monto a depositar");
        valor = tc.nextDouble();
        cuentaOli.depositar(valor);
        cuentaOli.consultarSaldo(); // 800.0 // -500 valor no es valido
    }
}
