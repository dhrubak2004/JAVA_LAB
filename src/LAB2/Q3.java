package LAB2;

import java.util.Scanner;

class box{
    double length, width, height;
    public double vol(){
        return length * width * height;
    }
}
public class Q3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        box b=new box();
        System.out.print("Enter length:");
        b.length =sc.nextDouble();
        System.out.print("Enter breadth:");
        b.width =sc.nextDouble();
        System.out.print("Enter height:");
        b.height =sc.nextDouble();
        System.out.print("Volume:"+b.vol());
    }

}
