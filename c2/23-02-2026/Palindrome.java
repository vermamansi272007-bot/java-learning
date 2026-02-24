import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int reverse=0;
        int original=n;
        while(n>0){
            int k=n%10;
            reverse=reverse*10+k;
            n/=10;
        }
        if(original==reverse){
            System.out.println("this number is palindrome number");
        }
        else{
            System.out.println("this number is not palindrome number");
        }
    }
}