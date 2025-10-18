import java.util.Scanner;

/*public class searching {
    public static int BinarySearch(int arr[], int n, int key) {
        int start = 0, end = n - 1, mid;
        while (start <= end) {
            // mid find kro
            mid = start + end / 2;
            // mid==key
            if (arr[mid] == key) {
                return mid;
            }
            // mid<key;
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            // mid>key;
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size, n, key;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        System.out.println("Enter the number of elements of the array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be search:");
        key = sc.nextInt();
        int result = BinarySearch(arr, n, key);
        if (result == -1) {
            System.out.println("The element is not found");
        } else {

            System.out.println("The element is found at the position:" + result);
        }
        sc.close();
    }

}*/
public class searching {
    public static int linearSearch(int arr[], int n, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
            return -1;
        }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size, n, key;
        System.out.println("Enter the size of the array :");
        size = sc.nextInt();
        System.out.println("Enter the number of elements to be insert:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be search:");
        key = sc.nextInt();
        int result = linearSearch(arr, n, key);

    
        if (result != 1) {
            System.out.println("The Element is found at the postion"+result);
        } else {
            System.out.println("The element is not found");
        }
        sc.close();
    }

}