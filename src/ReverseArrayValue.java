import java.util.Scanner;

public class ReverseArrayValue {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int c = scanner.nextInt();//user inputs array length
        int arr[] = new int[c];//array initialised for user to input values
        System.out.println("Enter array values:  ");
        for (int i = 0; i < c; i++) {//value is inserted in index starting from 0, 1, 2, and so on
            arr[i] = scanner.nextInt();//user input array values.
        }
        System.out.println("Reversing array is :  ");
        for (int i = c - 1; i >= 0; i--) {//value is getting reversed c-1, c-2, c-3 and so on
            System.out.println(arr[i] );
        }
    }

}


