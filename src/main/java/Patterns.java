package main.java;

import java.sql.SQLOutput;

public class Patterns {

    public static void main(String[] args) {
        //Pattern1();
        Pattern2();
        //Fibonacci();

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
        int i = 0, j = 1;
        System.out.print(i + " " + j + " ");

        for(int x = 0; x<10; x++)
        {
            System.out.print(i+j + " ");
            int temp = j;
            j = i + j;
            i = temp;
        }
    }

}//end of class
