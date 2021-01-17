import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principio = scanner.nextInt();
        int numFinal = scanner.nextInt();


        for(int i =principio;  i<=numFinal;i++){

            if(i %3==0 && i %5==0){
                System.out.println("FizzBuzz");
            }else if(i %5==0 ){
                System.out.println("Buzz");
            }else if(i%3==0 ) {
                System.out.println("Fizz");
            }else {
                System.out.println (i); }

        }





    }
}