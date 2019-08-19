import java.util.Scanner;

//this program is to find sum of any five digit
    public class AdditionOfDigit {
        public static void main(String args []){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a 5-didit number:");
            int num= scanner.nextInt();//user input number stored here
            int sum = 0;
            int last_digit;
            while(num!=0){
                last_digit= num%10;//any number modulo 10 is actually equal to the last digit of the number.
                sum = sum + last_digit;//adding the last digit to sum to get a new sum value (eg. 0+last digit)
                num=num/10;//to get the new number after the last digit is removed.
            }
            System.out.println("Sum of 5 digits is : " + sum);
        }
    }
