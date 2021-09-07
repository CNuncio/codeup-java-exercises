import java.sql.SQLOutput;
import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
//     While

//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:

//5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


        // for refactor:
//        for (int i = 5; i < 16; i++) {
//            System.out.println(i);


//        Do While

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        2
//        4
//        16
//        256
//        65536

//        long i = 2;
//        do {
//            System.out.println(i);
////        or    i = i * i;
//        i *= i;
//        } while (i <= 1000000);
//        }

        //for loop refactor:

//        for (int i = 2; i < 1000000; Math.pow(i, 2)) {
//            System.out.println(i);
//        }


        ////// fizzbuzz


//        int i = 1;
//        while (i <= 100) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//
//                System.out.println(i);
//            }
//                i++;
//
//        }


Scanner scanner = new Scanner(System.in);

        System.out.print("What no. would you like to go up to? ");
int userInput = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Here is your table: ");
        System.out.println(" ");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInput; i++ ) {
            System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
        }


    }
}