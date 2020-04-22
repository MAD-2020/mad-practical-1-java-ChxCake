import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of numbers ;)  :");
    int numofnum = in.nextInt();
    ArrayList<Integer> numlist =new ArrayList<Integer>();
    
    int i =0;
    while (i < numofnum) 
    {
      System.out.println("Enter a number :");
      int number= in.nextInt();
      
      numlist.add(number);
      i++;

    }

    int maxcount=0; 
    int mostcount=0;

    for (int x : numlist)
    {
      //System.out.println(x);
      
      int k = 0;
      int totalcounter = 0;

      while (k<numofnum)
      {
        //System.out.println("no. k loop"+k);
        

        
        
        if(x==numlist.get(k))
        {
          totalcounter = totalcounter +1;
          System.out.println("total counter: "+ totalcounter);
        }
        k=k+1;
        //System.out.println("k end" + k);
        

      }
      if (totalcounter > maxcount)
      {
        maxcount = totalcounter;
        mostcount=x;
      }
      else if (totalcounter == maxcount)
      {
        if(x<mostcount)
        {
          mostcount=x;
        }
      }
      
    }
    System.out.println("mode is " + mostcount);
  }
}
