import java.util.Scanner;

public class NestedLoop_2341720190 {
    public static void main(String[] args) {
        Scanner ct = new Scanner(System.in);
        double[][] temps = new double[5][7];
        for(int i = 0; i < temps.length; i++){
            System.out.println("This is city numeral code: " + i);
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("This is day - " + (j + 1) + ": ");
                temps[i][j] = ct.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("This is city numeral code: " + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
