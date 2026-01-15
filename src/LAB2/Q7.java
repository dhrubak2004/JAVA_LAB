package LAB2;
import java.util.Scanner;

class rect{
    int length,breadth;
     rect(){
        length=0;
        breadth=0;
    }
    rect(int l,int b){
         length=l;
         breadth=b;
    }
    void area(){
         System.out.println("Area of rectangle:"+(length*breadth));
    }
}
public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int l=sc.nextInt();
        System.out.print("Enter breadth:");
        int b=sc.nextInt();
        rect r=new rect(l,b);
        r.area();
    }
}
