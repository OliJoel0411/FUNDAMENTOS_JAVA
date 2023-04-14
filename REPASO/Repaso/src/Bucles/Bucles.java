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
        /*
        Ejercicio
        
        1. Escriba un programa que muestre en pantalla los 
        numeros de 1 al 30 de dos en dos
        Ej. 2
            4
            6 ...
        2. Del programa realizado de inicio de sesión
        implemente el bucle necesario para que sea un programa
        iterativo
        
        */
        
        // For
        
        /*
        
        for(inici.. ; condicion ; avance){
            
            bloque de codigo
        
        }// fin for
        
        */
        
        for(int i=0;i<=30; i++){
            System.out.println("i = " + i);
            i++;
        }// fin for
        
        
        //NOTA
        
        /*
        ¿Cuando usar cada bucle?
        While = solo si no conocemos su limite
        for =  solo si conocemos su limite
        */
        
        // Imprimir en pantalla los numeros de 1 a 30
        // y imprimir a la par de cada numero si es par
        // o si es impar
        // Ejemplo:
        // 1 = impar
        // 2 = par ...
        
    }
}
