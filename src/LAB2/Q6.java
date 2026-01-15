package LAB2;
class substraction{
    void substract(int a,int b){
        System.out.println("Substraction of two integers:"+(a-b));
    }
    void substract(int a,int b,int c){
        System.out.println("Substraction of three integers:"+(a-b-c));
    }
    void substract(double a,double b){
        System.out.println("Substraction of two doubles:"+(a-b));
    }
}
public class Q6 {
    public static void main(String[] args)
    {
        substraction obj=new substraction();
        obj.substract(7,2);
        obj.substract(10,2,3);
        obj.substract(8.7,3);
    }
}
