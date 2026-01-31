package LAB3;
import java.util.Scanner;
class Plate{
    double length,breadth;
    Plate(double l,double b){
        length=l;
        breadth=b;
        System.out.println("Dimensions of the plate are:");
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
    }
}
class Box extends Plate{
    double height;
    Box(double l, double b, double h) {
        super(l,b);
        height = h;
        System.out.println("\nBox Constructor:");
        System.out.println("Height = " + height);
    }
}
class WoodBox extends Box {
    double thickness;
    WoodBox(double l, double b, double h, double t) {
        super(l, b, h);
        thickness = t;
        System.out.println("\nWoodBox Constructor:");
        System.out.println("Thickness: " + thickness);
    }
}
public class Q2 {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter length:");
            double l=sc.nextInt();
            System.out.print("Enter breadth:");
            double b=sc.nextInt();
            System.out.print("Enter height:");
            double h=sc.nextInt();
            System.out.print("Enter thickness:");
            double t=sc.nextInt();
            WoodBox w=new WoodBox(l,b,h,t);
        }
}
