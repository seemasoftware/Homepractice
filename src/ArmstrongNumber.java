import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is an Armstrong number or not : ");
    int num = scanner.nextInt();//number before diving by ten
    int temp = num;//to sore temporary number after dividing by 10
    int sum = 0;//Sum
    int rem;//remainder
    while (num > 0) {
        rem = num % 10;//any number modulo 10 is actually equal to the last digit of the number.
        num = num / 10;//adding the last digit to sum to get a new sum value (eg. 0+last digit)
        sum = sum + rem * rem * rem;//to get the new number after the last digit is removed.
    }

    if (temp == sum) {
        System.out.println("The number is an Armstrong Number. ");
    } else {
        System.out.println("The number is not an Armstrong Number. ");
    }

}
}

