package Q2;
import Q1.Lab6.MyMethod;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
    public static void main(String[] args) throws IOException{
        MyMethod.myHeader("Jonathan Seo", 8, 2);

        System.out.print("Reading the file...\n");
        System.out.print("Here is this week's sale data...\n");
        File file = new File("C:\\ES1036a\\jseo69_Lab8\\src\\Q2\\Text.txt");
        Scanner input = new Scanner(file);

        int i = 0;
        double[] array = new double[7];
        while (i<array.length){
            array[i] = input.nextDouble();
            i++;
        }
        input.close();

        WeeklySaleData_Jonathan wsd = new WeeklySaleData_Jonathan(array);
        wsd.displaySaleData();

        System.out.print("\nHighest weekly sale: ");
        wsd.getHighestSale();
        System.out.printf("%.2f",wsd.getHighestSale());

        System.out.print("\nLowest weekly Sale: ");
        wsd.getLowestSale();
        System.out.printf("%.2f",wsd.getLowestSale());

        System.out.print("\nAverage Weekly sales: ");
        wsd.getAverageSale();
        System.out.printf("%.2f",wsd.getAverageSale());

        System.out.print("\nStandard deviation of Weekly Sales: ");
        wsd.getStandardDeviation();
        System.out.printf("%.2f",wsd.getStandardDeviation());

        PrintWriter p = new PrintWriter("C:\\ES1036a\\jseo69_Lab8\\src\\Q2\\Text.txt");

        i=0;
        while (i<array.length){
            p.println(array[i]);
            i++;
        }
        p.printf("\nHighest weekly sale: %.2f",wsd.getHighestSale());
        p.printf("\nLowest weekly sale: %.2f", wsd.getLowestSale());
        p.printf("\nAverage weekly sale: %.2f", wsd.getAverageSale());
        p.printf("\nStandard deviation of Weekly Sales: %.2f",wsd.getStandardDeviation());

        p.close();
        System.out.println("Updating the file with the above info...");
        System.out.println("Closed the file...\n");
        MyMethod.myFooter("Goodbye from Jonathan Seo!");
    }
}
