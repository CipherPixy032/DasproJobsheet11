import java.util.Scanner;

public class NumericalRightAngledPyramid {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Input the value of N: ");
        int N = pr.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
