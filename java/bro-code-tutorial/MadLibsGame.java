import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action ending in -ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter one more adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println();
        System.out.println("Today I went to a " + adjective1 + " university. ");
        System.out.println("I have seen a lot of " + noun1 + "s.");
        System.out.println("One of them was so " + adjective2 + ". That " + noun1 + " was " + verb1 + ".");
        System.out.println("I was " + adjective3 + ".");

        scanner.close();
    }
}
