import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    int num1, num2;
    char operation;
    System.out.println("Enter the num1:");
    num1 = sc.nextInt();
    System.out.println("Enter any Operation(+, -, *, /):");
    operation = sc.next().charAt(0);
    System.out.println("Enter the num2:");
    num2 = sc.nextInt();

    switch(operation)
    {
        //Addtion
        case'+':
        System.out.println("The addtion of these numbers  is:"+(num1+ num2));
        break;
        //Subtraction
        case'-':
        System.out.println("The addtion of these numbers  is:"+(num1- num2));
        break;
        //Multiplication
        case'*':
        System.out.println("The addtion of these numbers  is:"+(num1 * num2));
        break;
        //Division
        case'/':
        if(num2 != 0)
        {
            System.out.println("The division of the numbers:"+(num1 / num2));

        }
        else
        {
        System.out.println("Invalid division by 0:");
        break;
        }
        //default condition
        default:
            System.out.println("Invalid please enter any operation:");
        break;

     } 
    }
}