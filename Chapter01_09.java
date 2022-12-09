import java.util.Scanner;

import javax.print.attribute.standard.DialogTypeSelection;

public class Chapter01_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menuStr = "<< Main Menu >>\n 1. Menu\n 2. Menu\n 3. Exit";
        int choice = 0;
        boolean Done = true;

        do{
            System.out.println(menuStr);
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if(choice == 1)
            System.out.println("You select choice 1 ");
            else if(choice == 2)
            System.out.println("You select choice 2 ");
            else if(choice == 3){
            System.out.println("You select choice 3 exit ");
                Done = false;
            }      
        }while (Done);
    }
}
