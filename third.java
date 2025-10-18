
import java.util.Scanner;

class third

{ 
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays is:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
        
        }
       // int max = arr[0];
        int min = arr[0];
        //System.out.println("The maximum elements in this arrays will be:");
       // System.out.println(max);
         System.out.println("The minimum element arrays in this arrays is:");
         System.out.println(min);
    }

    public static void main(String args[]) {
        third th = new third();
        th.getdata();

    }
}