import java.util.Scanner;

public class SpaceAndWord {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string.");
        String str = scanner.nextLine();//user input string
        char[] temp = str.toCharArray();//initialising a charachter array to store the string
        int words = 1;//starting of a string with at least one word
        int spaces = 0;//starting of a string with 0 spaces
        for (int i = 0; i < temp.length; i++) {//looping the length of the string to discover number of words and spaces
            if (str.charAt(i) == ' ') {//checking spaces through the string
                spaces = spaces + 1;//increasing the number of spaces if match found
            }
        }
        words = words + spaces;//number of words =spaces +1
        System.out.println("Number of words is : " + words);
        System.out.println(" Number of spaces is : " + spaces);
    }
}
