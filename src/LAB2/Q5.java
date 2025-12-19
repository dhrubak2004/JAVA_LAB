package LAB2;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] roll = new int[n];
        String[] name = new String[n];
        double[] cgpa = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter CGPA: ");
            cgpa[i] = sc.nextDouble();
        }
        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + cgpa[i]);
        }
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < cgpa[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("\nStudent with lowest CGPA: " + name[minIndex]);
    }
}
