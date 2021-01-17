import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int  i=0;i<n;i++){
            int tamano = sc.nextInt();
            if(tamano==1){
             larger =++larger;

            }else if(tamano==-1){

                smaller =++smaller;
            }else if(tamano==0){
                perfect = ++perfect;
            }


        }
        System.out.println(perfect + " " + larger + " " + smaller);

    }
}