import java.util.*;

public class octal {
       public static void main(String []args)
       {
            //octal to binary 
            Scanner sc = new Scanner(System.in);

            int i = 0;

            int j = 0;

            int decimal = 0;

            int[] arr;

            arr = new int[40];

            int temp = 0;

            //octal to decimal conversion

            System.out.println("enter the octal number.");

            int oct = sc.nextInt();

            while(oct != 0)
            {
                  temp = oct%10;

                  decimal += (int) (decimal + temp*Math.pow(8, i));

                  i++;

                  oct = oct/10;
            }

            System.out.println("decimal equivalent of the octal num is "+decimal);


            while(decimal != 0)
            {     
                     
                    arr[i] = decimal%2;
                     
                    decimal = decimal/2;

                    i++;

            }

            for(j = i; j >= 0; j--)
            {
                  System.out.print(arr[j]);
            }
       }
}
