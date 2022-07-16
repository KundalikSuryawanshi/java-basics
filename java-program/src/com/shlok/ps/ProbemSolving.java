package com.shlok.ps;


import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class ProbemSolving {
    /*public static void main(String args[])
    {
        gaurav:                         //java lable break statement
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==3)
                    break gaurav;       //calling the break statment
                System.out.println("*");
            }
            System.out.print("  ");
        }
    }*/

    //ASCII - American Standard Code Information Interchange
 /*   public static void main(String[] args) {
        //Range = 7 bits = 2^7 = 128
        //asci value start from 0 to 127 each character have its own value
        for(int i=0;i<=127;i++)
        {
            System.out.println("%d \n %c",i,i);
        }
    }*/

    //if you know start and end point then - for loop
    //execute condition at least one condition is true either false - do while loop
    //if number of column depends on no of rows then j<=i


   /* public static void main(String[] args)
    {
        *//*fibonacci series - a series of number in which each number is the sum of two preceding number *//*
        int k=0, a=1, b=1;
        System.out.println("| |");
        while (k<=50)
        {
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }
    }*/

    /*public static void main(String[] args) {
        int k,a=1,b=1;
        Scanner sc = new Scanner(System.in);
        //in order to use scanner class we have to import scanner class
        k=0;
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("| |");
        while (k<=n)
        {
            k=a+b;
            if (k>=n)
                break;
            System.out.print(k+" ");
            a=b;
        }
    }*/
   /* public static void main(String[] args) {
        //palindrome number - a number that remains same when its number are reversed
        //logic to reverse the number
        System.out.println("execution is start");
        int n=123;
        int r=0;
        int s=0;
        int t=n;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;

        }
        if (t==s) {
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not a palindrome");
        }

    }*/

    //perfect number - a positive integer that is equal to the sum of its proper divisor
    //eg- 6--> 1+2+3 = 5
    /*public static void main(String[] args) {
        int n = 6;
        boolean b = isPresent(n);
        if (b)
        {
            System.out.println("is perfect number ");
        }
        else
        {
            System.out.println("it is not a perfect numeber ");
        }
    }

    private static boolean isPresent(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if (n==sum)
        {
            return true;
        }
        return false;
    }*/

    //Armstrong Number - it is the three digit integer such that the sum of all three cubes
    /* 1^3=1
     *  5^3=25
     *  3^3=9
     *  1+25+9=153
     */
    /*public static void main(String[] args)
    {
        int n=153;
        int temp=n;
        int r,sum=0;
        while(n>0)
        {
            r = n % 10;     //logic to revers number
            n = n / 10;
            sum = sum + r * r * r;// add digit with cubes
        }
            if(temp==sum)
            {
                System.out.println("it is armstrong");
            }
            else
            {
                System.out.println("it is not armstrong");
            }
    }*/

    // prime number - the number that is divisible only itself
   /* public static void main(String[] args) {
        int num=2;
        boolean isPrime=true;
        for (int i=2;i<num;i++)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        if (isPrime)
        {
            System.out.println(num+"is prime");
        }
        else
        {
            System.out.println(num+"is not prime");
        }
    }*/
    /*i<num we also write i<num/2 to execute up to half of that number
     * and its make ultimate code fast*/

    /*/swapping two number -
     * take one extra temp variable
     * to use + - -
     * use xor(^) operator //it save on extra bit*/
    /*public static void main(String[] args) {
        int a=5;    //101
        int b=4;    //100
        //^ --> xor  1-1->0   1 0 ->1   00 ->0   0 1->1
        a=a^b;
        b=a^b;
        a=a^b;
        //we also swap number b=a+b-(a=b)
        System.out.println("a:"+a);
        System.out.println("a:"+b);
    }*/

    //decimal to binary
   /* public static void main(String[] args) {
        int number, i=0;
        int binary[] = new int[100];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number :");
        number =userInput.nextInt();

        while(number!=0)
        {
            binary[i]=number%2;
            number=number/2;
        }
        System.out.println("binary value is :");
        for (int j=i-1;j>=0;j--)
        {
            System.out.print(" "+binary[i]);
        }
    }*/

    /*array theory - in array element each element have unique index number
     * its start from the 0 and ends n-1
     * in java array is an object */
/*    public static void main(String[] args) {
        int a[] =new int[5];
        a[0]=5;
        a[1]=4;
        a[2]=3;
        a[3]=2;
        a[4]=1;
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("length of array:"+a.length);//length function is used to find length of array

    }*/

    //Enhance for loop
    /*public static void main(String[] args) {
        int arr[]=new int[5];
        for(int j=0;j< arr.length;j++)
        {
            arr[j]=j+1;
        }
       *//* for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*//*
        for (int i:arr)
        {
            System.out.println(arr[i]);
        }
    }*/

    //Random Class- it is used to assign random value in array //in order to use this we have to import the random package
    //ArrayIndexOfBound - if you give value more than assign size of array then this Exception Throws
   /* public static void main(String[] args) {
        Random r = new Random();
        int a[]=new int[50];
        for (int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(50);
        }
        //System.out.println(a[24]);//by using this we can print 24th number element
        for (int j:a)//Enhanced for loop
        {
            System.out.println(j);
        }
    }*/

    // 2D 3D and multi dimensional array

    //classes and objects
    /*constructor -
     * is the member method which has the same name as  class name
     * constructor will do not return anything
     * no any return type has mension before constructor
     * java will give you one default constructor
     * at the time of creating object constructor will create
     * we don't have to create constructor
     * */

   /* public static void main(String[] args) {
       //for string
        // Abc obj=new Abc("");
        Abc obj=new Abc(4.4,5);
        //parameter given that constructor will call from class Abc
    }
}
class Abc
{
    public Abc()
    {
        System.out.println("in first constructor");
    }
    public Abc(int a)
    {
        System.out.println("with one integer constructor");
    }
    public Abc(String s)
    {
        System.out.println("in string constructor");
    }
    public Abc(double d,int i)
    {
        System.out.println("double + integer constructor");
    }
}
*/
//how to pass object as a parameter in method
//in java every thing is object


    /* dsa + java + notes */
    public static void main(String[] args) {

    }
}

