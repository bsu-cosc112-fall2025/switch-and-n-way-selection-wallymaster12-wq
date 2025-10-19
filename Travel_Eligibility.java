 import java.util.Scanner;
public class Travel_Eligibility {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        boolean passport = input.nextBoolean();

        if (age >= 18) {
            if (passport) {
                System.out.println("Eligible to travel internationally");
            } else {
                System.out.println("Get a passport to travel");
            } 
        } else 
        if (age <18){ 
            if (passport) {
                System.out.println("Eligible to travel with guardian");
            } else {
                System.out.println("Not eligible to travel");
            }
        } 

        input.close();
    }
}
