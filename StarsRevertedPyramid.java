import java.util.Scanner;

public class StarsRevertedPyramid {
    public static void main(String[] args) {
        Scanner inv = new Scanner(System.in);
        System.out.print("Input the value of N: ");
        int N = inv.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
