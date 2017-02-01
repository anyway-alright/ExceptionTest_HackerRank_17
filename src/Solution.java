import java.util.Scanner;

/**
 * Created by Lenovo on 2/1/2017.
 */
public class Solution {
    public static void main(String[] args)

    {
        Calculator myCalculator=new Calculator();
        int T=new Scanner(System.in).nextInt();
        while (T>0)
        {
            int n = new Scanner(System.in).nextInt();
            int p = new Scanner(System.in).nextInt();
            try {
                System.out.println(myCalculator.power(n,p));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
