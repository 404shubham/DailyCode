import java.util.*;

public class octal {
       public static void main(String []args)
       {
            //octal to binary 
            Scanner sc = new Scanner(System.in);

            int sum = 0;

            int i = 0;

            int temp = 0;

            //octal to decimal conversion

            System.out.println("enter the octal number.");

            int oct = sc.nextInt();

            while(oct != 0)
            {
                  temp = oct%10;

                  sum += (int) (sum + temp*Math.pow(8, i));

                  i++;

                  oct = oct/10;
            }

            System.out.println("decimal equivalent of the octal num is "+sum);
       }
}
