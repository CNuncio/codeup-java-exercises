import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        addNum(1, 2);
        subNum(1, 2);
        multNum(1, 2);
        modNum(1, 2);
        divNum(1, 2);

        getInteger(1, 10);
    }


    public static void addNum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void subNum(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void multNum(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void modNum(int num1, int num2) {
        System.out.println(num1 % num2);
    }

    public static void divNum(int num1, int num2) {
        System.out.println(num1 / num2);
    }


    public static int getInteger(int min, int max) {
        System.out.println("Enter number btwn 1-10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput < min || userInput > max) {
            getInteger(min, max);
        } else {
            System.out.println(userInput + " is btwn " + min + " and " + max);
        }
        return userInput;
    }
}
