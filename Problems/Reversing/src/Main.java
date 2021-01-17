import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numero = sc.nextInt();
        int invert = 0,res;
        while(numero!=0){
        res =numero%10;
        invert = invert*10+res;
        numero= numero/10;
        }
       // System.out.println(sumDigit);
        System.out.println(invert); 
        
   }
}
