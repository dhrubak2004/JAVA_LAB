package LAB3;
import java.util.Scanner;

class Plastic2D {
    double length, width;

    void dim2D(double l, double w) {
        length = l;
        width = w;
    }
    double calc() {
        double area = length * width;
        return area * 40;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    void dim3D(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    double calc3D() {
        double vol = length * width * height;
        return vol * 60;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of 2D sheet:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Plastic2D sheet = new Plastic2D();
        sheet.dim2D(l, w);
        System.out.println("Cost of 2D plastic sheet: Rs " + sheet.calc());
        System.out.print("\nEnter length, width and height of 3D box:");
        double l3 = sc.nextDouble();
        double w3 = sc.nextDouble();
        double h3 = sc.nextDouble();
        Plastic3D box = new Plastic3D();
        box.dim3D(l3, w3, h3);
        System.out.println("Cost of 3D plastic box: Rs " + box.calc3D());
        sc.close();
    }
}

