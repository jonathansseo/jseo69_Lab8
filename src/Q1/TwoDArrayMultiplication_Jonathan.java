package Q1;
import Q1.Lab6.MyMethod;
import java.util.Scanner;
public class TwoDArrayMultiplication_Jonathan {
    public static void main(String[] args){
        MyMethod.myHeader("Jonathan Seo", 8, 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplying two 2D arrays: ");
        System.out.println("Enter array1 info: ");
        System.out.printf("\tEnter row-size: ");
        int r1 = scanner.nextInt();
        System.out.printf("\tEnter the column-size: ");
        int c1 = scanner.nextInt();

        System.out.println("Enter array2 info: ");
        System.out.printf("\tEnter row-size: ");
        int r2 = scanner.nextInt();


        while (r2!=c1){
            System.out.printf("\tRow size of the 2nd matrix has to be equal to the column size of first matrix!");
            System.out.printf("\n\tEnter again: ");
            r2 = scanner.nextInt();

        }
        System.out.printf("\tEnter the column-size: ");
        int c2 = scanner.nextInt();
        int[][] ma = new int[r1][c1];
        populate2DArrays(ma);
        System.out.printf("Elements of Array 1, Size[%d x %d]: \n", r1,c1);
        display2DArrays(ma);
        int[][] ar1 = ma;

        ma = new int[r2][c2];
        populate2DArrays(ma);
        System.out.printf("Elements of Array 2, Size[%d x %d]: \n",r2,c2);
        display2DArrays(ma);
        int[][] ar2 = ma;

        System.out.println("Multiplying two arrays [Array 1 x Array 2]..");
        System.out.printf("The resulting size is [%d x %d] \n",r1,c2);

        display2DArrays(multiplyArrays(ar1,ar2));

        MyMethod.myFooter("Goodbye from Jonathan Seo!");
    }
    public static void populate2DArrays(int[][] ma){
        int i=0;
        int j=0;
        while (i<ma.length) {
            while (j < ma[0].length) {
                ma[i][j] = (int) (2 + Math.random() * 4);
                j++;
            }
            i++;
            j = 0;
        }
    }
    public static void display2DArrays(int[][] ma) {
        for (int i = 0; i < ma.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < ma[i].length; j++) { //this equals to the column in each row.
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyArrays(int[][] a, int[][] b){
        int [][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}


