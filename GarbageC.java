/*Input will be the nubmer of garbage cans present and Howmuch weight is there in every can
One Garbage collector can collect garbage 3 kg at a time.
WTP to determine for Howmany times Collector will Collect the garbage  */
import java.util.*;
public class GarbageC
{
    public static void main (String args[])
    {
        float sum = 0;
        float res;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cans are there:");
        int n =sc.nextInt();
        System.out.print("Number of weights");
        System.out.println();
        for (int i = 0;i<n;i++)
        {
            float num = sc.nextFloat();
            sum = sum + num;
        }
        System.out.print("Sum of the weights ");
        System.out.println(sum);
        if (sum%3==0)
        {
            res= sum/3;
            System.out.println("Number of times he has to collect: "+res);
        }
        else
        {
            res = (sum/3)+1;
            System.out.println("Number of times he has to collect: "+(int)res);
        }
    }
}