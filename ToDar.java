package oops;

public class ToDar {


    public static void main(String args[]) {
        int a[][] = new int[2][3];
        int k = 0, i, j;

        // Assigning values to the 2D array
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = k;
                k++;
            }
        }

        // Printing the 2D array
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
