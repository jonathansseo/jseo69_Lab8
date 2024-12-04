package Q2;
import Q1.Lab6.MyMethod;

public class WeeklySaleData_Jonathan {
    private double[] sale;

    public WeeklySaleData_Jonathan(){
        sale = null;
    }

    public void displaySaleData() {
        int i=0;
        System.out.println("[");
        while (i<7){
            System.out.printf("%.2f,", sale[i]);
            i++;
        }
        System.out.println("\b\b]");
    }
    public WeeklySaleData_Jonathan(double[] data){
        sale = data;
    }

    public double getHighestSale(){
        double high = 0;
        int i =0;
        while (i<7){
            if (high<sale[i]) {
                high = sale[i];
            }
            i++;
        }
        return high;
    }

    public double getLowestSale() {
        double low = 7777777;
        int i = 0;
        while (i<7){
            if (low>sale[i]){
                low = sale[i];
            }
            i++;
        }
        return low;
    }

    public double getAverageSale(){
        double avg = 0;
        double sum = 0;
        int i = 0;
        while (i<7){
            sum += sale[i];
            i++;
        }
        avg = sum/7;
        return avg;
    }
    public double getStandardDeviation(){
        int i = 0;
        double sd=0;
        double sum = 0;
        double div=0;

        while(i<=sale.length-1){
            sum+=MyMethod.myPow((sale[i]-getAverageSale()),2);
            i++;
        }
        div = sum/sale.length;
        sd = Math.sqrt(div);
        return sd;
    }
}
