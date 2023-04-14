package Ejercicios;

/**
 *
 * @author Oliver
 */
public class Ejercicio02 {
  public static void main(String[] args){
      
      for(int i = 0; i<=30; i++){
          if(i%2== 0){
              System.out.println(i+" = Par");
          }else{
              System.out.println(i+ " = impar");
          }
          
          if(i==15){
              for (int j = 15; j>=0; j--) {
                 if(j%2==0){
                     System.out.println(j + " = par");
                 }else{
                     System.out.println(j+" = impar");
                 }
              }
              i=30;
          }
      }
      
      
  }   
}
