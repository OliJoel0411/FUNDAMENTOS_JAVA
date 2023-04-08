package Bucles;

/**
 * @author Oliver
 */
public class Operadores {
    public static void main(String[] args) {
        // Operadores .
        /*
        - Aritmeticos
        - Incremento y Decremento
        - Relacionales y Asignacion
        - Lógicos
        */
        
        /*
        ARITMETICOS
        +  = SUMAR
        -  = RESTAR
        /  = DIVIDIR
        *  = MULTIPLICAR
        %  = RESTO
        */
        
        int n1 = 10, n2 = 3, res, modulo;
        
        res = n1 / n2;
        modulo = n1 % n2;
        System.out.println("res = " + res);
        System.out.println("modulo = " + modulo);
        
        /*
        INCREMENTO Y DECREMENTO
        
        ++  SUMA UNO AL VALOR ->  a = a + 1;
        --  RESTA UNO AL VALOR
        
        */
        // incremento
        int a = 10;
        int b = 10;
        
        a = a + 1;
        b++;
        System.out.println("\n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // decremento
        
        a = a -1;
        System.out.println("a = " + a);
        b--;
        System.out.println("b = " + b);
        
        
        /*
        RELACIONALES Y ASIGNACION
        */
        // Asignacion  " = "    variable = valor;
        int variable1, variable2, variable3;
        
        variable1 = variable2 = variable3 = 312;
        
        System.out.println("\n");
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        
        
        //Relacionales 
        /*
        ==  compara que sean iguales
        !=  compara que sean diferentes
        >   compara que sea mayor que
        <   compara que sea menor que
        >=  compara que sea mayor igual que
        <=  compara que sea menor igual que
        
        */
        
        
        /*
        LOGICOS 
        
        ! negacion
        && Y
        || O
        
        Ejemplo
        
        if(Expresion_A == 0 && Expresion_B == 0) -> se cumplen ambas
        if(Expresion_A == 0 || Expresion_B == 0) -> se cumple una
        if(!(Expresion_A == 0))
        */
        
        int usuario = 543218, contra = 123456;
        System.out.println("\n");
        System.out.println("Bienvenido");
        System.out.println("Ingrese su Usuario");
        System.out.println("Ingrese su contraseña"); 
        
        if(!(usuario == 54321)){
            System.out.println("Inicio de sesión");
        }else{
            System.out.println("error");
        }
    }
}
