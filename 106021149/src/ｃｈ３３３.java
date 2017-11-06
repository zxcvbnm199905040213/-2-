import java.util.Scanner;
public class ｃｈ３３３ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        for (int a = 1; a <= c; a++) {
            for (int b = 1; b <= c; b++)
                if (a >= b)
                    System.out.print("*");
            System.out.println();
        }
    }
}
