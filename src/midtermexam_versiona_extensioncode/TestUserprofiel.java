/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author Admin
 */
public class TestUserprofiel {
    public static void main (String args[]) {
        
    
    Scanner inp = new Scanner(System.in);
    System.out.print("Please enter a username: ");
    String inputName = inp.nextLine();
    System.out.print("Which is your favourite genre?: Comedy? Drama? Action? or Mystery?: ");
    String inputGenre = inp.nextLine();
    boolean proceed = true;
    if (inputGenre.equalsIgnoreCase("Comedy") == false && inputGenre.equalsIgnoreCase("Drama") == false && inputGenre.equalsIgnoreCase("Action") == false && inputGenre.equalsIgnoreCase("Mystery") == false) {
        proceed = false;
        System.out.println("Invalid input!");
    }
    if (proceed == true) {
            UserProfile profile = new UserProfile(inputName, inputGenre);
                 System.out.println("You have created your account.");
    }

    }
    
}
