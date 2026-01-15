package LAB2;
import java.util.Scanner;

class createobj{
    static int cnt=0;
    public createobj(){
        cnt++;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of objects to be created:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            new createobj();
        }
        System.out.print("Number of objects created:"+ createobj.cnt);
    }
}
