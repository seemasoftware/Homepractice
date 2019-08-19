import java.util.Scanner;

public class Natural {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range of natural numbers. ");
        int n = scanner.nextInt();//store user input for n series of numbers
        int sum = 0;
        System.out.println("List of natural number is : ");
        for (int i = 1; i <=n ; i++) {
            System.out.println(" " +i);//to print the list natural numbers till n series
        }
        for (int i = 0; i <=n ; i++) {//for loop executes for n times
            sum = sum + i;//value of i increases by new value of i
        }

        System.out.println("The sum  of 1 to " + n + " natural numbers is : " + sum);
    }
}

