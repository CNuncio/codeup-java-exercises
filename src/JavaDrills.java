import java.util.ArrayList;

public class JavaDrills {
//
//    public static String flipOuterCase(String input) {
//
//        for (int i = 0, i <chars.length;
//        i++){
//
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
//work in progress


//        In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
//        Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“caT”)); // Cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT


//public static int returnTotalDifference(){
//    ArrayList<Double> n = new ArrayList<Double>();
//    ArrayList<Double> b = new ArrayList<Double>();
//    double sumN = 0;
//    double sumB = 0;
//    for(int i = 0; i < n.size(); i++) {
//        sumN += n.get(i);
//    }
//    return (int) sumN;
//    }


//      for(int i = 0; i < b.size(); i++) {
//
//        sumB += b.get(i);
//    }
//    return (int) sumB;


//from: https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist

//work in progress
//Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//        returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2

public static String flipInnerCase(String str){
            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                } else {
                    ch = Character.toUpperCase(ch);
                }
                sb.append(ch);
            }
            return sb.toString();
        }
}

public class Main {
    public static void main(String[] args) {
        // Tests
        System.out.println(flipInnerCase("cOdEup"));
        System.out.println(flipInnerCase("CoDeUP"));
    }

}

//work in progress
// from: https://stackoverflow.com/questions/63969822/java-method-to-reverse-upper-lower-case-doesnt-reverse-all-letters
//but only switches all letters
//In `codeup-java-exercises`, in`JavaDrills`, add the following:
//        Create a public static method, `flipInnerCase`, that takes in a string and returns the string
//        with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipInnerCase(“cat”)); // cAt
//        System.out.println(flipInnerCase(“CaT”)); // CAT
//        System.out.println(flipInnerCase(“caT”)); // cAT
//        System.out.println(flipInnerCase(“codeup”)); // cODEUp
//        System.out.println(flipInnerCase(“CoDeup”)); // COdEUp