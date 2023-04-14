package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Ejercicios {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int user = 54321, pass = 12345, opc1 = 0, opc2 = 0,opc3 = 0;
        do{
            
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese su usuario");
        opc1 = tc.nextInt();
        if(opc1 == user){
            System.out.println("Ingrese su contraseña");
            opc2 = tc.nextInt();
            if(opc2 == pass){
                opc1 = 1;
            }else{
                System.out.println("Error de contraseña Intente de nuevo");
            }
        }else{
            System.out.println("Error de Usuario Intente de nuevo");
        }
        }while(opc1 != 1);
        
        do{
        System.out.println("Menu de comida");
        System.out.println("1. Pollo Azado");
        System.out.println("2. Carne a la Plancha");
        System.out.println("3. Pescado");
        System.out.println("4. Salir");
        opc3 = tc.nextInt();
        
        switch(opc3){
            case 1:
                System.out.println("Ha seleccionado Pollo Asado");
                break;
            case 2:
                System.out.println("Ha seleccionado Carne a la Planca");
                break;
            case 3:
                System.out.println("Ha seleccionado Pescado");
                break;
            case 4:
                System.out.println("Bye");
                opc3 = 4; 
                break;
            default:
                System.out.println("Error ingrese una opcion correcta");
        }
        
        
        }while(opc3 != 4 && opc3 < 5);
    }
}
