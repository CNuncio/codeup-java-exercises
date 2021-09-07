import java.util.Scanner;

public class java_operators_mini_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.

//        System.out.println("What is your age: ");
//        int Age = scanner.nextInt();
//        if (Age >= 13 && Age < 20) {
//            System.out.println("You are a teenager. Ew. ");
//        } else {
//            System.out.println("You are not a teenager. There's hope for you. ");
//
//        }

//    int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//                while (i < 10){
//        System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//        i = i + 1;
//        System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);


//do while loop:

//    int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//                do {
//                System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//                i = i + 1;
//                System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//                } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);


        // big red cans on the wall:

        int numberOfCansOfBigRedOnTheWall = 99;
//        while (numberOfCansOfBigRedOnTheWall > 0) {
//            System.out.println(numberOfCansOfBigRedOnTheWall + "cans of Big Red on the wall ");
//            System.out.println(numberOfCansOfBigRedOnTheWall + " cans of Big Red");
//            System.out.println("Take one down, pass it around ");
//            numberOfCansOfBigRedOnTheWall--;
//            System.out.println(numberOfCansOfBigRedOnTheWall + " cans of Big Red on the wall. ");
//
//        }

        //fixed grammar:

        String word = " cans";
        while (numberOfCansOfBigRedOnTheWall > 0) {

            System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall");
            System.out.println(numberOfCansOfBigRedOnTheWall + " " + " of Big Red");
            System.out.println(" Take one down, pass it around ");
            numberOfCansOfBigRedOnTheWall--;
            if (numberOfCansOfBigRedOnTheWall == 1) {
                word = " can";
            }
            if (numberOfCansOfBigRedOnTheWall == 0) {
                System.out.println(" No more cans of Big Red on the wall");

            } else {
                System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall. ");
            }
        }
    }
}


