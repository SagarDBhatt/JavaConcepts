package main.java;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class Patterns {

    public static void main(String[] args) {
        //Pattern1();
        //Pattern2();
        //Fibonacci();
        //PalindromeNumber();
        //perfectNumber();
        armstrongNumber();

    }//end of main()

    public static void Pattern1()
    {
        for(int i =1; i<=4;i++)
        {
            for(int j=1; j<=4;j++)
            {
//	            1 2 3 4
//              2 3 4 1
//              3 4 1 2
//              4 1 2 3

                int k = i + j - 1;

                if(k>4)
                    System.out.print(k-4 + " ");

                else
                    System.out.print(k + " ");

            }
            System.out.println();
        }
    }

    public static void Pattern2()
    {
/*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Fibonacci()
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of terms"));

        int i = 0, j = 1;
        System.out.print(i + " " + j + " ");

        for(int x = 0; x<n-1; x++)
        {
            System.out.print(i+j + " ");
            int temp = j;
            j = i + j;
            i = temp;
        }
    }

    public static void PalindromeNumber()
    {
        //n = 121
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
        int rev=0,temp = n,r=0;

        while(n>0) {
            r = n % 10; //1, 2, 1
            n = n / 10;  // 12, 1, 1
            rev = (rev * 10) + r ; // 1, 12, 121
        }
        //System.out.println(rev);
        if(rev==temp)
            JOptionPane.showMessageDialog(null,"Number is Palindrome");

        else
            JOptionPane.showMessageDialog(null,"Not Palindrome");
    }

    public static void perfectNumber()
    {
/*        Number whose sum of factors is equal to the number itselt is Perfect number.
        eg. Factors of 6 = 1,2,3. Sum = 1+2+3 = 6. So, 6 is a perfect number. */

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
        int sum=0, fact=0;

        for(int i=1;i<n;i++)
        {
            if(n%i == 0)
            {
                sum += i;
            }
        }
        if(sum == n)
            JOptionPane.showMessageDialog(null,"Number is Perfect");

        else
            JOptionPane.showMessageDialog(null,"Not a Perfect number");
    }

    public static void armstrongNumber()
    {
/*        Armstrong Number: Sum of Cube of each number is same as number.
        Eg. 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 */
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
        int sum=0, rem=0, temp = n;

        while(n>0)
        {
            rem = n%10; // 3, 5, 1
            n = n/10;   // 15, 1, 1
            sum += (rem*rem*rem);   // 27, (27 + 125 = 152), (152 + 1 =153)
        }

        if(sum==temp)
            JOptionPane.showMessageDialog(null,"Number is Armstrong");

        else
            JOptionPane.showMessageDialog(null,"Not a Armstrong number");
    }

}//end of class
