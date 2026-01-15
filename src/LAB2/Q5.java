package LAB2;
import java.util.Scanner;

class student{
    int roll;
    String name;
    double cgpa;
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n= sc.nextInt();
        student s[]=new student[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new student();
            System.out.println("Enter details of student "+ (i+1));
            System.out.print("Enetr roll no:");
            s[i].roll=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name:");
            s[i].name=sc.nextLine();
            System.out.print("Enetr CGPA:");
            s[i].cgpa=sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No.:"+s[i].roll+"Name:"+s[i].name+" CGPA:"+s[i].cgpa);
        }
        int minind=0;
        for (int i = 1; i < n; i++) {
            if(s[i].cgpa<s[minind].cgpa)
                minind=i;
        }
        System.out.println("Student with lowest CGPA: " + s[minind].name);
    }
}
