import java.util.*;
/***Stella Bertoli
 * 3/18/25
 * NumberSum
 */
public class NumberSum {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        int cntr =1;
            
        while (cntr<=num){
            
            
            System.out.println(cntr);
            sum+=cntr;
            cntr++;}

        System.out.println("The sum of the integers is " + sum);



        
       

        
    }


}