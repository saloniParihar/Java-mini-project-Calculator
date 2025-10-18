import java.util.Scanner;

public class sorting{
public static int partition(int arr[], int start, int end)
{
int pos = start;
for(int i = start; i<= end; i++)
{
    if(arr[i]<= arr[end])
    {
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
        pos++;
    }

}
return pos-1;
}
public static  void QuickSort(int arr[], int start, int end)
{
    if(start>=end)
    {
        return;
    }
int pivot = partition(arr, start, end);
QuickSort(arr, start, pivot-1);
QuickSort(arr, pivot+1, end);
}
public static void main(String args[])
{
    int size, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    size = sc.nextInt();
    System.out.println("Enter the number of element in the array :");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i< n; i++)
    {
        arr[i] = sc.nextInt();
    }
    QuickSort(arr, 0, arr.length-1);
            System.out.println("The sorted array is:");
    for(int i = 0; i< n; i++)
    {
        System.out.println(arr[i]);
    }

}
}



/*public class sorting {

    // Merge function to combine two sorted halves
    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;

        // Merge both halves into temp[]
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements of left half (if any)
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements of right half (if any)
        while (right <= end) {
            temp[index++] = arr[right++];
        }
                    index = 0;
            while(start <= end)
            {
                arr[start] = temp[index];
                start++;
                index++;
                 
            }


        // Copy sorted elements back into original array
       // for (int i = 0; i < temp.length; i++) {
       //     arr[start + i] = temp[i];
        }
    

    // Recursive function for merge sort
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("The sorted array is:");
        for (int i =  0; i< arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}*/
