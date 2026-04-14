/*import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 30;
        if(a>=b) System.out.println("A is greater ");
        else{ System.out.println("B is greater");System.out.println("this is second line");}
    }
}*/
/*import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0) 
        {
            System.out.println(a + " is even ");

        }
        else
        {
            System.out.println(a + " is odd");
     
        }
        sc.close();
    }
}*/
/*public class Condition
{
    public static void main(String args[])
    {
        int age=20;
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else if(age<=13)
        {
            System.out.println("Child");
        }
        else
        {
            System.out.println("Teenager");
        }
    }
}*/
/*
import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        long tax;
        if(income < 500000)
        {
            tax = 0;
        }
        else if(income >=500000 && income < 1000000)
        {
            tax = (long)( 0.2 * income);
        }
        else
        {
            tax = (long) (0.3 * income);
        }
        System.out.println("Income :- "+tax);
        sc.close();
    }
}*/
/*
public class Condition
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 10;
        int c = 30;
        if( a > b && a > c)
        {
            System.out.println("A is greater");
        }
        else if(b>c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is greater");
        }
    }
}*/
/*public class Condition
{
    public static void main(String args[])
    {
        // int larger = (5>30) ? 5 : 3;
        // System.out.println(larger);
        String type = (6%2 == 0 ) ? "Even":"Odd";
        System.out.println(type);
    }
}*/
/*public class Condition
{
    public static void main(String args[])
    {
        int marks=35;
        String status = (marks > 33 ) ? "Pass":"Fail";
        System.out.println(status);
    }
}*/
//switch case
/*public class Condition
{
    public static void main(String args[])
    {
        int number = 4;
        switch(number)
        {
            case 1:
                {
                System.out.println("1");
                break;
                }
            case 2:
                System.out.println("2");
                
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Wrong Selection");
        }
    }
}*/
/*
import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operation = sc.next().charAt(0);
        int b = sc.nextInt();
        
        switch(operation)
        {
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            case '%' -> System.out.println(a%b);
            default -> System.out.println("Invalid Operation");

        }
    }
}*/
/*import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       if(a>0)
       {
         System.out.println("Positive");
       }
       else if(a<0)
       {
          System.out.println("Negative");
       }
       else
       {
          System.out.println("Zero");
       }
    }
}*/
/*
public class Condition
{
    public static void main(String args[])
    {
        double temp=13.5;
        if(temp > 100)
        {
            System.out.println("Fever");

        }
        else
        {
            System.out.println("Not Fever");
        }
    }
}*/
/*
import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thurday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
    }
}*/
/*
import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 ==0 ) 
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
    */