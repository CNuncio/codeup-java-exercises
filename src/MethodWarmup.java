public class MethodWarmup {


    public static int getDiffernce(int n1, int n2) {
        return Math.max(n1, n2) - Math.min(n1, n2);
    }

    public static int getDiffernce(int n1) {
        return Math.max(n1, 0) - Math.min(n1, 0);
    }

    public static int getDiffernce(double d1, double d2) {
        return Math.max(d1, d2) - Math.min(d1, d2);
    }

    public static int main(String[] args) {
     getDiffernce(11, 23);
     getDiffernce(-8);
     getDiffernce(4.7, 2.3);
    }
}
// TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//         - If both integers are equal, the order of operands doesn't matter in the calculation.
//         - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//         *** BONUS *** allow the method to accept two doubles and return a double output