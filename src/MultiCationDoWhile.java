import java.util.Scanner;

public class MultiCationDoWhile {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table.");
        int number = scanner.nextInt();//stores user input number for multiplication table.
        System.out.println("To what value you would like to display?");
        int n = scanner.nextInt();
        int i = 1;
        int j = 1;
        int total = 0;


        do {
            j = 1;
            do {
                total = i * j;//multiplying and storing the total in the variable
                System.out.print(" " + total);//prints the value after multiplying i and j
                j++;//iterating value of j after each loop
            }
            while (j <= n);//value of j less than or equal to n number
            {
                System.out.println("");//prints in the next line for evey new iteration loop
                i++;//increasing value of i
            }
        }
        while (i <= number) ;


    }

}


