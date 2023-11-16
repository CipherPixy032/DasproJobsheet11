import java.util.Scanner;

public class ExpandingSquareWithNumbers {
    public static void main(String[] args) {
        Scanner expand = new Scanner(System.in);
        System.out.print("Input the value of N: ");
        int N = expand.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
