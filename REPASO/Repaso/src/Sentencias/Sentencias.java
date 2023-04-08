package Sentencias;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Sentencias {
    
    public static void main(String[] args){
        // Scanner 
        
        Scanner tc = new Scanner(System.in);
        
        
        // SENTENCIAS
        
        /* Condicional If
       
        1era forma
        if(condicion){
            bloque de codigo a ejecutar, si es Verdadero
        }
        
        if(condicion)
            linea a ejecuatar, si es Verdadero
        */
        /*
        boolean condicion = true;
        byte n1 = 1;
        byte n2 = 2;
        */
      /*  if(n1 == n2){
            System.out.println("Una sola linea");
            System.out.println("Otra Linea");
        }*/
            
        /* Condicional If Else 
        
        if(condicion){
            Se ejecuta si es Verdadero
        }else{
            Se ejecuta si es Falso
        }
        */
        /*
        boolean condicion = false;
        byte n1 = 1;
        byte n2 = 2;
        
        if(n1 == n2){
            System.out.println("Verdadero");
        }// fin if
        else{
            System.out.println("Falso");
        }// fin else
        */
        
        // Condicional de If Anidado
        
        /*
        if(condicion1){
            Bloque 1 Verdadero
        }else{
            if(condicion2){

            }else{
            if(condicion3){
            
            }
        }
        
        */
        /*
        boolean condicion = false;
        byte n1 = 1;
        byte n2 = 2;
        byte n3 = 3;
        byte n4 = 4;
        byte n5 = 1;     
        
        if(n1 == n2){
            System.out.println("Numeros iguales b1");
        }// if 1
        else{
            if(n1 == n3){
                System.out.println("Numeros iguales b2");
            }// if 2
            else{
                if(n1 == n4){
                    System.out.println("Numeros iguales b3");
                }// if 3
                else{
                    if(n1 == n5){
                        System.out.println("Numeros iguales b4");
                    } // if 4
                }//else 3
            }// else 2
        }// else 1
        
        // Ejemplo de if no Anidados 
        System.out.println(" ");
        System.out.println(" ");
        
        if(n1 == n2){
            System.out.println("if 1");
        }else{
            System.out.println("falso");
        }
        if(n1 == n2){
            System.out.println("if 2");
        }else{
            System.out.println("falso");
        }
        */
        
        // Condicional Switch
        /*
        condicion = entero
        
        
        switch(condicion){
        case 1:
        
        case 2:
        
        case 3:
        
        }
        condicion = char
        
        switch(condicion){
        case 'a':
        
        case 'b':
        
        case 'c':
        
        }
        
        condicion = String
        switch(condicion){
        case "juan":
            break;
        case "william":
            break;
        case "alberto":
            break;
        }
        */
        /*
        char opc = 'c';
        
        switch(opc){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            default:
                System.out.println("Error, numero incorrecto");
                break;
        }
        */
        // inicio de sesion 
        /*
        
        contraseña  = 12345
        usuario = 54321
        operador de comparacion ==
        
        escoja entre los menus de comida que desea
        Solamente si inicia sesion correctamente
        1. Pollo Azado
        " Usted ha escogido Pollo Azado" 
        2. Carne a la plancha
        " Usted ha escogido Carne a la plancha "
        3. Pescado 
        " Usted ha escogido Pescado "
        */
        
    } // fin de clase main
    
} // fin de clase Sentencias
