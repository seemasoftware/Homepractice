import java.util.Scanner;

public class IndexArray{
//this program is to check whether the entered number is persent in the array or not

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 40, 15, 28, 7, 30, 9, 11, 12, 10};//initialising array from 0-10 index values
        System.out.print("Enter any value to check its array position: ");
        int b = scanner.nextInt();//user input enter a number to check if it is in the array or not
        boolean ans=false;
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == b) {
                ans = true;// stroring a boolean variable
                j = i;
                System.out.println("Number is present in array at index " + j );// saving the position of matched index in j
            }
        }

        if (ans==false)
            System.out.println("Number is not present in the array. ");
    }
}

