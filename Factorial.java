import java.util.*;
/**Stella Bertoli
 * 3/21
 */
public class Factorial {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        int fact = 1;
        
        for(int i=num; i>0; i-- )
        {
            fact = fact*i;
            
           
        }
        System.out.println("The factorial of your number is: " + fact);
    }
    
}
