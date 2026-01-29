package LAB3;
import java.util.Scanner;

class apple{
    void show(){
        System.out.println("This is Apple class show() method");
    }
}

class banana extends apple{
    void show(){
        System.out.println("This is Banana class show() method");
    }
}

class cherry extends apple{
    void show(){
        System.out.println("This is cherry class show() method");
    }
}
public class Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        apple ref;

        ref=new apple();
        ref.show();

        ref=new banana();
        ref.show();

        ref=new cherry();
        ref.show();
    }
}
