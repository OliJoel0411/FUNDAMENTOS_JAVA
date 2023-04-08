package Bucles;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Bucles {
    public static void main(String[] args) {
        
        /*
            Bucles 
         * While
         * do-While
         * For
         * For-each
        */
        
        // 
       /* While
        while(condicion){
            sentencia de código
        }
        1. inicializar el contador
        2. condicion
        3. actualizacion del contador
        */
        System.out.println("\n");
        int contador = 10;
        while(contador >= 0){
            System.out.println("contador = " + contador);
            contador--;
        }// fin while
        
        // do-While
        /*
        do{
        
        }while(condicion);
        
        */
        Scanner tc = new Scanner(System.in);
        //Ejemplo
        int opc = 0;
        do{
            
            System.out.println("Menu");
            System.out.println("1. iniciar Sesion");
            System.out.println("2. Salir");
            opc = tc.nextInt();
        }while(opc != 2);
        
    }
}
