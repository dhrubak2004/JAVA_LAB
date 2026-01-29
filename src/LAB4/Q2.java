package LAB4;

import  java.util.Scanner;

class toy{
    int id;
    String name;
    int qnty;
    int price;
}
public class Q2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int n=sc.nextInt();
        toy t[]=new toy[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details of toy "+i);
            System.out.print("Enter toy id:");
            t[i].id =sc.nextInt();
            sc.nextLine();
            System.out.print("Enter toy name:");
            t[i].name =sc.nextLine();
            System.out.print("Enter toy Quantity:");
            t[i].qnty =sc.nextInt();
            System.out.print("Enter toy price:");
            t[i].price =sc.nextInt();
        }
        int bill=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Toy id:"+t[i].id+" Toy name:"+t[i].name+" Toy Quantity:"+t[i].qnty+"Toy price:"+t[i].price);
            bill+=(t[i].qnty*t[i].price);
        }
    }
}
