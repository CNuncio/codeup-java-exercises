public class javaArraymini {
    public static void main(String[] args) {
//TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
        //Find the sum of all five double values using an enhanced for loop.

        double[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        System.out.println(total);
    }
}
