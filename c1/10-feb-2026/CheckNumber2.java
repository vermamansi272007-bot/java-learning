import java.util.Scanner;
public class CheckNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("positive number");
              }if(x%2==0){
            System.out.println("even number");
            }
             else{
            System.out.println("odd number");
            }
        else if(x==0){
            System.out.println("zero");
            }
            else{
                
            System.out.println("negative number");
        }
    }
}