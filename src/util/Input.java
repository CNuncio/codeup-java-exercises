package util;
//
import java.util.Scanner;

public class Input {
    private Scanner scanner;
//
//    public String getString() {
//        System.out.println("Please enter a string: ");
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public boolean yesNo(String input) {
//        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
//    }
//
//    public int getInt() {
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        return userInput;
//    }
//
//    public int getInt(int min, int max) {
//        String prompt = "Enter an integer between " + min + " and " + max;
//        System.out.println(prompt);
//        int userInput = scanner.nextInt();
//        while (userInput <= max || userInput >= max) {
//            System.out.println(prompt);
//           userInput =  scanner.nextInt();
////        }
//        return userInput;
//
//    public Input() {
//            this.scanner = new Scanner(System.in);
//        }
//    }

    public double getDouble() {
        System.out.println("Enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }
}
//}
