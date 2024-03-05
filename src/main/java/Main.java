import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        Main main = new Main();
        main.compute();

        // create a new object of class Main

        // call the compute() method on that new object
    }

    public void compute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("You are neither Alice nor Bob.");
        }


        // Get input string of name from user
        
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
