import java.util.*;
public class Prompter{
    public static void main(String[]args) {
        int num;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number(min): ");
        int min = input.nextInt();
        System.out.print("Enter a second integer(max): ");
        int max = input.nextInt();
        do{
            System.out.print("Enter a number between min and max: ");
            num = input.nextInt();
        }while ((num<=min) || (num>=max));
        System.out.println("Yippeee");
        
    }
}