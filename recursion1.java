/*public class recursion1 {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
            else
            {
        return n + sum(n - 1);
    }
}

    public static void main(String args[]) {
        int n = 10;
        int result = sum(n);
        System.out.println("The sum of all the natural number is:" +result);
    }
}
    */
/*public class recursion1 {
    static int printnum(int n) {
        if (n == 5) {
            System.out.println(n);
            return 1;
        } else {
            System.out.println(n);
          return printnum(n + 1);
        }
    }

    public static void main(String args[]) {
    
         
        System.out.println(printnum(n));

    }
}*/
public class recursion1 {
    static int fib(int n) {
        if (n == 0) {
            return 0;

        }
        else if(n==1)  
        {
         return 1;   
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String args[]) {
        int n = 10;
        
        System.out.println("The fibonacci series is:");
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + " ");
        }
    }
}
