package LAB2;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0,odd=0;
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter number:");
            int num=sc.nextInt();
            if(num%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even:"+even);
        System.out.print("Odd:"+odd);
    }
}
