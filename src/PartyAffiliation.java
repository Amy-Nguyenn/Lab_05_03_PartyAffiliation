import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args) {
        // start PartyAffiliation

        // import java.util.Scanner

        // main method
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input
        String affiliation; // Declare affiliation variable

        System.out.print("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): "); // Prompt for user input

        // read user input
        affiliation = in.nextLine(); // Read the entire line

        // check the affiliation using a cascaded if structure
        if (affiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (affiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }

        // Close scanner
        in.close(); // Close scanner
        // END PartyAffiliation
    }
}