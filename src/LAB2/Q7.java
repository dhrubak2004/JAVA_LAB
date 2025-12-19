package LAB2;
import java.util.Scanner;

class Rectangle1 {
    double length;
    double breadth;
    Rectangle1() {
        length = 0;
        breadth = 0;
    }
    Rectangle1(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle1 r1 = new Rectangle1();
        r1.area();
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Rectangle1 r2 = new Rectangle1(l, b);
        r2.area();
    }

}
