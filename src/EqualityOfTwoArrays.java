import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String args[]) {

        int arr1[] = {10, 20, 30, 40, 50};//initialising array 1
        int arr2[] = {10, 20, 30, 40, 50};//initialising array 2 for comparison.


        System.out.println("The condition is " + Arrays.equals(arr1, arr2));//arrays.equals determines whether the condition is true or false
    }
}
