public class recursion {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        else{
        return n * fact(n - 1);
    }
}

    public static void main(String args[]) {
        int n = 5;
        System.out.println("The factorial of all the natural number is:" + fact(n));
    }
}
