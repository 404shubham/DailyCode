import java.util.*;

public class DecimalToBinary 
{
       public static void main(String []args)
       {
               //decimal to binary 

               Scanner sc = new Scanner(System.in);

               int i = 0;

               System.out.println("enter the decimal number to be converted.");

               int decimalnum = sc.nextInt();

               if(decimalnum > 0)
               {
                int arr[] = new int[40];

               int k = 0;

               while(decimalnum > 0)
               {
                 arr[i++] = decimalnum%2;

                 decimalnum = decimalnum/2;

                 k++;
               }
               
               System.out.println("the binary equivalent of the number is ");


               for(int j = k; j >= 0; j--)
               {
                  System.out.print(arr[j]);

               }
               }else
               {
                System.out.println("enter the correct decimal vlaue.");
               }
            


       }
}
