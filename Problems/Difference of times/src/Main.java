import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();

        int minutes = scanner.nextInt();

        int seconds = scanner.nextInt();
        int hoursSecond = scanner.nextInt();
        int minutesSecond = scanner.nextInt();
        int secondsSecond = scanner.nextInt();

        int momento1 = hours*60*60+minutes*60+seconds;
        int momento2 = hoursSecond*60*60+minutesSecond*60+secondsSecond;
        System.out.println(momento2-momento1);






    }
}
