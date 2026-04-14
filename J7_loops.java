// public class J7_loops {
//     public static void main(String args[])
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.print(i+" ");
//             i++;
//         }

//     }
// }


// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;
//         while(counter <=range)
//         {
//             System.out.print(counter +" ");
//             counter++;
//         }
//     }
// }

// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum =0;
//         int i = 0;
//         while(i<=n)
//         {
//             sum += i++;
//         }
//         System.out.println("Sum = "+sum);
//     }
// }

//for loop
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.print(i+" ");
//         }
//     }
// }

// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         for(int line = 0;line<4;line++)
//         {
//             for(int cols = 0;cols<4;cols++)
//             {
//                 System.out.print( "* ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = n;
//         int rev = 0;
//         while(x > 0 )
//         {
//             int rem = x % 10;
//             rev = rev * 10 + rem ;
//             x /=10; 
//         }
//         System.out.println(rev);
//     }
// }

// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         int i = 0;
//         do
//         {
//             System.out.println(i);
//             i++;
//         }while(i<10);
//     }
// }
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         for(int i=1;i<10;i++)
//         {
//             if(i==3)
//             {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }

//break;
// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);

//         do
//         {
//             System.out.print("Enter you number :- ");
//             int n = sc.nextInt();
//             if(n%10 == 0)
//             {
//                 break;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

//continue
//skip the iteration
// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         for(int i=0;i<10;i++)
//         {
//             if(i%3 == 0)
//             {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//print except multiple of 10
// import java.util.Scanner;
// public class J7_loops
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         do
//         {
//             System.out.print("Enter your Number :- ");
//             int n = sc.nextInt();
//             if(n%10 == 0)
//             {
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

import java.util.Scanner;
public class J7_loops
{
    public static void main(String args[])
    {
        Scanner sc =new  Scanner(System.in);
        int n = sc.nextInt();
        int i=2;
        if(n==2 )
             System.out.println("Prime");
        else{
        boolean isPrime = true;
        while(i< Math.sqrt(n))
        {
            if(n%i == 0) 
            {
                // System.out.println("Number is not prime");
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime == false) System.out.println("composite");
        else System.out.println("Prime");
    }

    }
}