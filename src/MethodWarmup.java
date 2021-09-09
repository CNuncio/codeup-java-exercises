
// TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//         - If both integers are equal, the order of operands doesn't matter in the calculation.
//         - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//         *** BONUS *** allow the method to accept two doubles and return a double output

public class MethodWarmup {

    public static void main(String[] args) {
        System.out.println(getDifference(12, 4));
        System.out.println(getDifference(6, 3));
        System.out.println(14);
        System.out.println(getDifference(4.5, 2));
        System.out.println(getDifference(6.5, 3.5));
        System.out.println(getDifference(7.9));
        System.out.println(addNums(20));
    }


    public static int getDifference(int n1, int n2) {
        if (n1 > n2) return n1 - n2;
        return n2 - n1;
    }

    public static int getDifference(int nm) {
        return getDifference(nm, 0);
    }

    public static double getDifference(double nm1, double nm2) {
        if (nm1 > nm2) return nm1 - nm2;
        return nm2 - nm1;
    }
    public static double getDifference(double nm) {
        return getDifference(nm, 0);
    }







// TODO: use recursion to add all numbers up, from 1 to the given number input

//        addNums(5) would trigger a calculation of...
//            5 + 4 + 3 + 3 + 1, evaluating to 15

    // in JS:
//function numSum {
//     var total = 0;
//     for (var i = 1; i <= num; i++) {
//         total += i;
//     }
//     return total;
// };

    public static int addNums(int num) {
    if (num == 1) return 1; //base case
        return addNums(num - 1) + num;
    }

}

// or :
//public static int addNums(int num) {
//        return addNums(num, 1, 0);
//        }
//public static int addNums(int num, int i, int accumulator){
//        if (i == num){
//        return accumulator + i;
//        }
//        accumulator += i;
//        return addNums(num, ++i,accumulator);
//        }