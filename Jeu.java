import java.utilisé.Scanner;
public class Jeu{
static Scanner clavier = new Scanner (Système.in)
   public static main void (String[] arcs) {
   
  int number_user, number_secret;
  
  do{
      System.out.println("Saisir un nombre : (1-50) ");
      number_user = clavier.nextInt(); 
    
      if(number_user > number_secret){
       System.out.println(" Le nombre est trop grand !");
      }
  
  }while(number_user != number_secret)
 }
}
