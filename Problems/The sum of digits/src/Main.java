import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        
        int numero = sc.nextInt();
        int  sumDigit =0;
        int invert = 0;
        while(numero!=0){
            sumDigit = sumDigit+(numero % 10) ;
            numero =numero/10;
     
        }
        System.out.println(sumDigit);
        

    }
}
