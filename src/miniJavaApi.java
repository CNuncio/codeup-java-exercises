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