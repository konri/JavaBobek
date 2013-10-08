/*
 * Program sprawdzajacy logowanie
 */
package pack;


import javaIn.JIn;
/**
 *
 * @author Szymon
 */
public class LoginProgram {
    public static void main(String[] argv){
      Login log = new Login ("ala", "makota");
	  
      System.out.println("Wpisz swoj login:");
      String login = JIn.getString();
      System.out.println("Wpisz swoj login:");
      String password = JIn.getString();
      
     
      if(log.check(login,password))
      {
    	  System.out.println("Zalogowano pomyslnie");
      }
      else
      {
    	  System.out.println("Nie zalogowano!");
      }
    }
}
