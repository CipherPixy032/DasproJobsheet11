import java.util.Scanner;

public class NestedLoop_2341720190 {
    public static void main(String[] args) {
        Scanner ct = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] sum = new double[5];
        for(int i = 0; i < temps.length; i++){
            System.out.println("City numeral code- " + (i + 1));
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("This is day - " + (j + 1) + ": ");
                temps[i][j] = ct.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("City numeral code- " + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0;i < temps.length;i++) {
            for (int j = 0; j < temps[0].length;j++) {
                sum[i] = sum[i] + temps[i][j];
            }
            System.out.println("|");

        } for (int i = 0;i < sum.length;i++) {
            System.out.println("Average temperature: ");
            double cityAverage = sum[i] / temps[0].length;
            System.out.println("City " + (i+1) + " " + "\n" + cityAverage);
        }


    }
}
