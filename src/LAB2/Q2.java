package LAB2;
import java.util.Scanner;
class ObjectCount {
    static int count = 0;
    ObjectCount() {
        count++;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            new ObjectCount();
        }
        System.out.println("Number of objects created = " + ObjectCount.count);
    }
}
