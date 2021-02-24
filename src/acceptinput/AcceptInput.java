
package acceptinput;

import java.util.Scanner;


public class AcceptInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.print("Please enter your name: ");  
        name = scanner.next();
        
        System.out.print("My name is " + name);  
    }
    
}
