package LAB4;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1=sc.nextLine();
        System.out.print("Enter String 1:");
        String s2=sc.nextLine();
        System.out.print("Enter SubString 1:");
        String ss1=sc.nextLine();
        System.out.print("Enter SubString 2:");
        String ss2=sc.nextLine();
        int i=s1.length()-1,j=ss1.length()-1;
        int flag1=0,flag2=0;
        while(i>=0 && j>=0)
        {
            if(s1.charAt(i)==ss1.charAt(j))
            {
                i--;
                j--;
            }
            else if(s1.charAt(i)!=ss1.charAt(j))
            {
                i--;
                j=ss1.length()-1;
            }
            if(j<0)
            {
                flag1=1;
                break;
            }
        }
        i=s2.length()-1;
        j=ss2.length()-1;
        while(i>=0 && j>=0)
        {
            if(s2.charAt(i)==ss2.charAt(j))
            {
                i--;
                j--;
            }
            else if(s2.charAt(i)!=ss2.charAt(j))
            {
                i--;
                j=ss2.length()-1;
            }
            if(j<0)
            {
                flag2=1;
                break;
            }
        }
        if(flag1==1 && flag2==1)
        {
            System.out.print(s1+" "+s2);
        }

    }
}
