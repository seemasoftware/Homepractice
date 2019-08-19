import java.util.Scanner;

public class MulticationTable {
    //this java program prints fibonacci series till n number
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range for fibonacci series. ");
        int n = scanner.nextInt();
        int a = 0;//first index
        int b = 1;//second index

        for (int i = 2; i < n; i++) {//iteration starts from 2
            int sum = a + b;
            a = b;// asigning first index value to the second
            b = sum;//second index value is being added to 0 first and then 1 and then so on..
            if (sum > n)
                break;//when the sum gets bigger than the number of series jvm breaks
            System.out.print(sum + " ");
        }
    }
}
