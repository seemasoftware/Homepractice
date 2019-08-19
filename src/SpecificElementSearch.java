import java.util.Scanner;

public class SpecificElementSearch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 4, 5, 8, 7, 3, 9, 11, 2, 10};//initialising array from 0-10 index values
        System.out.print("Enter any value : ");
        int b = scanner.nextInt();//user input enter a number to check if it is in the array or not
        boolean ans=false;

        for (int i = 0; i < array.length; i++) {//looping through the array length to search for element
            if (array[i] == b) {
                ans = true;// stroring a boolean variable
            }
        }
        if (ans == true){
            System.out.println("Number is present in array. " );
        }
        else {
            System.out.println("Number is not present in the array. ");
        }
   }
}

