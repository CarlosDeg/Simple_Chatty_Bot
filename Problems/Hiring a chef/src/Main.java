//put imports you need here
import java.util.Scanner;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        int age= scanner.nextInt();
        String stageOfEducation = scanner.next();
        int yearOfExperience =scanner.nextInt();
        String cuisinePreference = scanner.next();

       /* System.out.println(firstName);
        System.out.println(age);
        System.out.println(stageOfEducation);
        System.out.println(yearOfExperience);
        System.out.println(cuisinePreference);
*/
      /*  System.out.print("The form for " + firstName + " is completed. "
                + "We will contact you if we need a chef that cooks " + cuisinePreference+ " dishes.");
   */
        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks "+cuisinePreference+" dishes.");


    }
}