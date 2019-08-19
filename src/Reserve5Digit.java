import java.util.Scanner;

public class Reserve5Digit {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a 5-digit number you want to be reversed : ");
            int num = scanner.nextInt();//storing user input in this variable
            int reverse = 0;//reverse starts with 0
            int remainder = 0;//remainder starts with 0
            while (num > 1) {
                remainder = num % 10;//for eg number is 54 (remainder = 54/10=5.4,rem =4
                reverse = reverse * 10 + remainder;// rev=0*10+(rem=4) = 4
                num = num / 10; // num = (54-4=50) 50/10=5
                // remainder = num % 10; 5
                // reverse = reverse *10 + remainder= (4*10+5=45) number reversed
            }
            System.out.println("Reverse number is " + reverse);
        }
    }

