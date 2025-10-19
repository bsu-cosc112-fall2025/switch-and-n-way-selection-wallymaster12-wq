import java.util.Scanner;
public class Flooring_Option_Selector {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("The different options you can choose from:");
       System.out.println("Option one is Scored concrete — $3000");
       System.out.println("Option two is Carpeting — $5000");
       System.out.println("Option three is Wood floors in living areas, carpeting in bedrooms, tile in bath areas — $10,000");
       int option = input.nextInt();
       switch (option){
        case 1:  
       System.out.println( "Scored concrete — $3000"); 
       
        break;
       
        case 2: System.out.println( "Carpeting — $5000"); 
        
        break;
       
        case 3: System.out.println( "Wood floors in living areas, carpeting in bedrooms, tile in bath areas — $10,000");
        break;
        
        default: System.out.println( "Invalid");
        return;
       }

        }
    
}
