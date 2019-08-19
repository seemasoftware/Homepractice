import java.util.Scanner;

public class CountNumber {
   // this progam is to find number of 'a' in the string
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string. ");
        String sent = scanner.nextLine();//initialising string by user intput
        char ch[] = sent.toCharArray();//initialising charachter array for charachters in string
        int counta =0;//intilialising a variable to count the number of charachers
        for (char b : ch) {//setting a condition to declare a variable that is the same type as the base of the array

            switch (b){//switch characters in the array
                case 'a' ://looks for 'a'
                    counta++;//iteration happens
                    break;//jvm stop after finding all the 'a' in the string
            }
        }

        System.out.println("Number of 'a' in the string is :" + counta);
    }
}
