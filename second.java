import java.util.Scanner;

class second

{
    int sum = 0;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("these are the array element you are entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The sum of the array elements will be:" );
        for (int i = 0; i < n; i++) {
            sum += arr[i];
           
            System.out.println(+sum);
        }

    }
    // sc.close();

    public static void main(String args[]) {
        second s1 = new second();
        s1.getdata();
    }
}
