import java.util.Scanner;
public class CheckNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num>0){{
            System.out.println("number is positive");
        }
            if(num%2==0){
            System.out.println("even number");
        } else{
            System.out.println("odd num");
        }}
        else if(num<0){
            System.out.println("negative number");
        }else{
            System.out.println("zero");
        }
        
    }
}