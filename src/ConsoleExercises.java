import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %-10.2f.%n.", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printIn(userInput);


//        Scanner scanner = new Scanner(System.in);
//        System.out.printIn("Enter three words: ");
//        String Word1 = scanner.next();
//        String Word2 = scanner.next();
//        String Word3 = scanner.next();
//
//        System.out.printf("The three words: ", Word1, Word2, Word3);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

//        Scanner scanner = new Scanner(System.in);
//        int LngthFt = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please enter the length of a classroom in ft: ");
//        int WdthFt = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please enter the width of a classroom in ft: ");
//        System.out.printf("Area = " + (WdthFt * LngthFt) + " sq ft abd the perimeter = " + (2 * (LngthFt + WdthFt)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("The Width in ft of a room: ");
        int WidthFt = scanner.nextInt();
        System.out.println("The Length in ft of that room: ");
        int LengthFt = scanner.nextInt();
        int PerimeterFt = (2 * (WidthFt + LengthFt));
        int AreaFt = (WidthFt * LengthFt);
        System.out.println("The perimeter in ft is " + PerimeterFt + "\n" + "The area in ft is: " + AreaFt);
        }
    }

