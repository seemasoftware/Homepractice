public class TransposeRoeIntoColumn {
    public static void main(String args[]) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//instantiated arrays' rows and columns.
        System.out.println("Printing Matrix before transpose.");
        for (int i = 0; i < 3; i++) {//
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(" ");//printing array into rows and columns
        }
        System.out.println("Printing Matrix after transpose. ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[j][i]+ " ");
            }
            System.out.println(" ");//transposing rows into columns
        }


    }
}

