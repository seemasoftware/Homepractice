import java.util.Scanner;

public class ValueSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter three numbers one by one : ");//user inputs values in the array index
            int b = scanner.nextInt();
            a[i] = b;
        }
        int total = (a[0] + a[1] + a[2]);//adding values of the array
        System.out.println("Sum of numbers entered = " + total);
    }
}