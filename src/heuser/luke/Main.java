package heuser.luke;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello World Again");


        // the split method is a String instance method. This method
        // takes a String that can support regular expressions which
        // tells the method what the String should be split on
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();


        // Anonymous array initializer!
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));

    }

    private static void printText(String... textList) {


        for(String t : textList) {
            System.out.println(t);
        }
    }

}
