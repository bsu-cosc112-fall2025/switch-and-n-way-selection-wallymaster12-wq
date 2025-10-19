import java.util.Scanner;
public class TVSelector {
    public static void main(String[] args) {
Scanner Input = new Scanner(System.in);
System.out.println("Option 1: Model 100");
System.out.println("Option 2: Model 200");
System.out.println("Option 3: Model 300");
System.out.println("Enter the Model You want: ");
int ModelNumber = Input.nextInt();


switch (ModelNumber) {
case 100 -> System.out.println("Remote control, timer, stereo sound — $1000");
case 200 -> System.out.println("Adds picture-in-picture — $1200");
case 300 -> System.out.println("Adds HDTV, flat screen, 16x9 aspect ratio — $2400");
default -> System.out.println("Please pick a number from the option");
}


}
}