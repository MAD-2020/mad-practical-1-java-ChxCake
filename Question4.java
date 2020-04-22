import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter maximum number of stars: ");
    int max = in.nextInt();
    int stars = max;
    
   
    for (int i = 0; i < max; i++)
    {
      for (int j = stars; j>0;j--)
      {
        System.out.print("*");
        

      } 
      
      System.out.print("\n");
      stars = stars -1 ;
    
  }
}
