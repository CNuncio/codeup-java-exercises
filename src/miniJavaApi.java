public class miniJavaApi {
    public static void main(String[] args) {

        try {
            String testString = "this is a string";
            System.out.println(testString.length());
            System.out.println(testString.substring(177));

        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Out of bounds!");
        }
    }
}

   // Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.

//    public void subListMaker(String sentence){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        int firstInt = scanner.nextInt();
//        System.out.println("Please enter another integer");
//        int secondInt = scanner.nextInt();
//        System.out.println(sentence);
//        ArrayList<String> wordArrayList = new ArrayList<String>();
//        String[] stringArray = sentence.split(" ");
//        for (String word : stringArray){
//            wordArrayList.add(word);
//        }
//        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
//        String newSentence = String.join(" ", shorterList);
//        System.out.println(newSentence);
//    }





    //Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.

       // Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.

     //   To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.