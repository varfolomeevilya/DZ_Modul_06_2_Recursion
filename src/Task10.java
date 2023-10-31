import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        recursion(a, b);
    }

     static void recursion(int a, int b) {
        int res = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (a > b) {
                    res = a % b;
                }
                if (a < b) {
                    res = b % a;
                }
                System.out.print("Наибольший делитель" + res);
            }

        }
    }
}
