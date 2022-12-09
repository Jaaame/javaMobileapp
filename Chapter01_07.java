import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter01_07 {
    public static void main(String[] args) {
        int total;
        int counter;
        int score;
        double average;
        Scanner scan = new Scanner(System.in);

        total = 0;
        counter = 0;

        System.out.print("Enter Integer Score  or  -1 to Quit : " );
        score = scan.nextInt();

        while(score != -1) {
            total =total + score;
            counter = counter + 1;
            System.out.print("Enter Integer Score or -1 to Quit : ");
            score = scan.nextInt(); 
        }

        DecimalFormat twoDigit = new DecimalFormat("0.00");
        if (counter != 0) {
            average = (double) total / counter;
            System.out.println("Class average is " + twoDigit.format(average));
        }
        else 
            System.out.println("No score were entered");
            scan.close();
    }
    
}
