import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static Scanner scanner = new Scanner(System.in);//user inputs string in the first column

     static void sortnames() {
        String  [] a = new String [5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter names for the string one by one:  ");
            String names = scanner.nextLine();//user input names
            a[i] = names;//names stored in array indenx

        }
        Arrays.sort(a);//in built method for sorting array values
        System.out.println("Following names are sorted alphabetically: "+ Arrays.toString(a));

    }



    public static void sortnumbers(){
        int a []= new int [5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter numbers for the numeric array one by one:  ");
            int d= scanner.nextInt();//user input numbers
            a[i]= d;//numbers sorted in array

        }
        Arrays.sort(a);
        System.out.println("Following numbrs are sorted in ascending order: " + Arrays.toString(a));
    }
    public static void main (String args[]){
        sortnames();
        sortnumbers();

    }
}
