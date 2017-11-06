import java.util.Scanner;


public class ggH1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int x = scan.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
