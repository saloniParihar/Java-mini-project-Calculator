
import java.util.Scanner;

//public class fun 
/*{

    static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i < n; i+= 2) {
            sum += i;

        }
        return sum;
    }

    static int sumofEven(int n) {
        int sum = 0;
        for (int i = 2; i < n; i+=2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        fun f1 = new fun();
        int odd = sumOfOdd(5);
        int even = sumofEven(5);
        System.out.println("sum of even numberis:" + even);
        System.out.println("sum of odd numberis:" + odd);
    }
}*/

/*public class fun {

    static int greater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = s.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = s.nextInt();
        int result = greater(num1, num2);
        System.out.println("the  greater number between num1 and num2 is:" +result);
    }
}*/
/*public class fun
{
    static double setcircumferenceOfCircle(int radius)
    {
        double circum  = 2*Math.PI*radius;

    
    return circum;
    }
    static double setarea(int radius)
    {
        double area = Math.PI*radius*radius;
        return area;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
      int radius = s.nextInt();
        double ans = setcircumferenceOfCircle(radius);
        double ans1= setarea(radius);
        System.out.println("The circumfernce of the circle is:"+ans);
        System.out.println("The area of the circle is:"+ans1);


    }
}*/
public class fun {
    static long power(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
         System.out.println("Enter the base number:");
        int x = s.nextInt();
        System.out.println("Enter the exponents number:");
        int n =s.nextInt();
        long ans = power(x,n);
      //  System.out.println(x + "raised to the power of " + n + "is" + ans);
                System.out.println("raised to the power of " + ans);

    }
}