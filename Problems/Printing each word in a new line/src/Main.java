import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner  sc = new Scanner(System.in);


        String word1 = sc.next(); // "This"
        String line1 = sc.next(); // " is a simple"
        String word2 = sc.next(); // "multiline"
        String word3 = sc.next(); // "input,"
        String line2 = sc.next(); // ""

        System.out.println(word1 + "\n"+line1+"\n"+word2+"\n"+word3+"\n"+line2);

    }
}