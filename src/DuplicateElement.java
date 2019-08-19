 //this program finds the duplicate element in the array

    public class DuplicateElement {
        public static void main(String args[]) {

            int arr[] = {10, 20, 10, 30};//array inititated
            for (int i = 0; i < arr.length - 1; i++) {//index of arrays assigned(-1 represents the number of index)
                for (int j = i + 1; j < arr.length; j++) {//variable j is inititated to determine whether 2 index values are same or not.
                    if (arr[i] == arr[j]) {

                        System.out.println("The duplicate element is : " + arr[j]);
                    }
                }
            }
        }
    }

