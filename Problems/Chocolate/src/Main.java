import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean cond1 = k < n * m;
        boolean cond2 = k % n == 0 || k % m == 0;

        if (cond1 && cond2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}