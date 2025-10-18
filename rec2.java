/*public class rec2
{
    public static void towerOfHanoi(int n, String src, String helper, String dest)
    {
        if(n==1)
        {
System.out.println("Transfer Disk"+ " "+n+"from"+"  "+src+ "  "+To" +"  "+ dest);
return;
        }
        towerOfHanoi( n-1, src, dest, helper);
        System.out.println("Transfer Disk"+" "+n+ " "+from"+src+" "+to"+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[])
    {
    int n=3;
    towerOfHanoi(n,"S","H","D");
    System.out.println("Total moves ="+(int)(Math.pow(2,n)-1));
    }
}*/
    /*public class rec2
    {
    public static void printrev(String str, int idx)
    {
    if(idx==0)
    {
    System.out.println(str.charAt(idx));
    return;
    }
    System.out.print(str.charAt(idx));
    printrev(str,idx-1);
    }
    public static void main(String args[])
    {
    String str= "saloni";
    printrev("saloni", str.length()-1);
    }
}*/
/*public class rec2
{
    public static boolean isSorted(int arr[], int idx)
    {
        if(idx == arr.length-1)
        {
            return true;
        }
        if(arr[idx]<arr[idx+1])
        {
            return isSorted(arr,idx+1);
        }
        else
        {
            return false;
        }

    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,5,2};
        System.out.println(isSorted(arr,0));
    }
    
}*/
public class rec2{
    public static boolean isPalindrome(String str, int start, int end)
    {
        //base case if string is empty or single char palindrome
        if(start >= end)
        {
return true;
        }
       // Base case if mismatch found not Palindrome   
            if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }
       // recursive case:check inside the substring;
        else{
            return isPalindrome(str,start +1, end -1);
        }
    }
    public static void main(String args[])
    {
        String str = "madam";
        if(isPalindrome(str, 0,str.length()-1))
        {
            System.out.println(str+"String is Palindrome");
        }
        else
        {
            System.out.println(str+"String is not Palindrome");
        
        }
    }
}
