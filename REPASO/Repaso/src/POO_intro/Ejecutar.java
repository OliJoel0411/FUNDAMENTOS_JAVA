package POO_intro;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        /*
        
        Cuenta cuentaOli = new Cuenta();
        
        // cuentaOli.saldo = 300.0;
        // System.out.println(cuentaOli.saldo);
        cuentaOli.setNoCuenta(88888);
        //cuentaOli.noCuenta = 12345;
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
        System.out.println(cuentaOli.consultarNoCuenta());
        
        */
        
        
        
        // Automovil
        
        /*
        Automovil auto1 = new Automovil("Toyota",2023);
        Automovil auto2 = new Automovil("Honda",2015);
        // auto1
        System.out.println("auto1");
        System.out.println(auto1.getMarca());
        System.out.println(auto1.getModelo());
        
        // auto2
        System.out.println("auto2");
        System.out.println(auto2.getMarca());
        System.out.println(auto2.getModelo());*/
        
        // Tipo1 Constructor
        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado1_1 = new Cuadrado();
        
        // Tipo2 Constructor
        Cuadrado cuadrado2 = new Cuadrado(10, 15);
        Cuadrado cuadrado2_2 = new Cuadrado(20,30);
        /*
        System.out.println("Constructor sin parametros");
        System.out.println(cuadrado1.getLado1());
        System.out.println(cuadrado1.getLado2());
        System.out.println("cuadrado1_1");
        System.out.println(cuadrado1_1.getLado1());
        System.out.println(cuadrado1_1.getLado2());
        
        
        System.out.println("");
        System.out.println("Constructor con Parametros");
        System.out.println(cuadrado2.getLado1());
        System.out.println(cuadrado2.getLado2());
        System.out.println("cuadrado2_2");
        System.out.println(cuadrado2_2.getLado1());
        System.out.println(cuadrado2_2.getLado2());
        */
        
        System.out.println("Ingrese el valor del lado1");
        int lado1 = tc.nextInt();
        System.out.println("Ingrese el valor del lado2");
        int lado2 = tc.nextInt();
        
        cuadrado2.setLado1(lado1);
        cuadrado2.setLado2(lado2);
        
        //cuadrado2.calcularPerimetro();
        
        System.out.println("Lado 1 = " + cuadrado2.getLado1());
        System.out.println("Lado 2 =" + cuadrado2.getLado2());
        //System.out.println(cuadrado2.calcularPerimetro());
        
    }
}
