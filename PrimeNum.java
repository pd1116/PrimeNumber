

import java.util.Scanner;
public class PrimeNum
{


    public static void main(String[] args) {
        System.out.print("Please insert a number : ");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();        
        
        if(n % 2 == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
        num.close();
    }
}
