import java.util.Scanner;
public class Grade_feedback {
    public static void main (String[] args){
Scanner input = new Scanner(System.in);
int score =input.nextInt();
String grade ="";
if (score>= 90){
grade = "A";
System.out.println("Grade:"+grade+"  Excellent");
}
else if (score>= 80){
    grade = "B";
    System.out.println("Grade:"+grade+"  Good job!");
}
else if (score>= 70){
    grade = "C";
    System.out.println("Grade:"+grade+"  Fair effort");
}
else if (score>= 60) {
    grade = "D";
    System.out.println("Grade:"+grade+ "  Needs improvement");
}
else if(score>=50){
    grade = "F";
    System.out.println("Grade:"+grade+"   Failing grade");
}
else {
    System.out.println("failing grade");
}
    }

}
