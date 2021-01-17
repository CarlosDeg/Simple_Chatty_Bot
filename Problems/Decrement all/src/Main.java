import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        a= a-1;
        b = --b;
        c = --c;
        d = d - 1;
        System.out.println(a+" " + b+" "+ c+" "+d);
    }
}