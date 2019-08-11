/*
Remove all 0's from the sequence (i.e. warmup1).

If the sequence is now empty (no elements left), stop and return true.

Sort the sequence in descending order (i.e. warmup2).

Remove the first answer (which is also the largest answer, or tied for the largest) from the sequence and call it N. The sequence is now 1 shorter than it was after the previous step.

If N is greater than the length of this new sequence (i.e. warmup3), stop and return false.

Subtract 1 from each of the first N elements of the new sequence (i.e. warmup4).

*/
package challenge.pkg378;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Horikss
 */
public class Challenge378 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         long number2 = 0;
         int numberL = 0;
        
        do{
           try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        number2 = scanner.nextInt();
      }catch(InputMismatchException n){
          System.out.println("Type only numbers");
      }
      }
      while(number2 == 0 );
       
    number hakimi = new number();


    hakimi.putList(number2);
    
    hakimi.Option1();
        System.out.println("Option1 Remove all 0's from the sequence, ");
    hakimi.showList();
        System.out.println("Option2");
        hakimi.Option2();
        hakimi.showList();
        System.out.println("Option 3");
        hakimi.Option3();
        System.out.println("Option 4");
        hakimi.Option4();
        

        
  
    



    }
}

