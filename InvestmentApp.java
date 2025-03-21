/** Stella Bertoli
 * 3/20/2025
*/


public class InvestmentApp {
    public static void main(String[]args) {
        
        int interest; 
        double inv = 2500.0;
        int years = 0;
        
         do{
             inv += inv*0.075;
             years++;

         }while(inv<5000);
        
         System.out.println("It took " + years + " years for a $2500 investment to reach " + inv + " dollars");
        

        
    }
    
}
