
import java.util.Scanner;

public class maan {
    int num1;
    int num2;
    int num3;

    void getdata() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1:");
        num1 = sc.nextInt();
        System.out.println("Enter the num 2:");
        num2 = sc.nextInt();
        System.out.println("Enter the num 3:");
        num3 = sc.nextInt();
    }

       
    void display() {

        double average = (num1 + num2 + num3) / 3.0;
        //    System.out.println(average);

    System.out.println(average);
    }

    public static void main(String args[]) {
        maan a = new maan();
        a.getdata();
        a.display();
    }
}