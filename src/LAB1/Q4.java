package LAB1;

public class Q4 {
    public static void main(String[] args){
        int num=1221;
        int rev=0;
        int temp=num;
        while(temp!=0)
        {
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
