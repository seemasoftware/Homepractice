public class CommonStringElement {
   public static void main(String args[]) {
        String arr1[] = {"Bath", "Birmingham", "Briston", "York", "Manchester"};
        String arr2[] = {"Manchester", "Glasgow", "Bath", "Cottswold"};
        for (int i = 0; i < arr1.length; i++) {//looping the elements in the array 1
            for (int j = 0; j < arr2.length; j++) {//looping the elements in thr array 2
                if (arr1[i] == arr2[j]) {//comparing two arrays to find common element
                    System.out.println("The duplicate String element is " + arr1[i]);
                }
            }
        }
   }
}

