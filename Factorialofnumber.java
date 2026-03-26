//it return the number from n to 1 using recursion
import java.util.Scanner;
public class Factorialofnumber {
    public static void printfact(int i,int num,int fact){
        if(i==num){
            fact*=i;
            System.out.println("Sum is "+fact);
            return;
        }
        fact*=i;
        printfact(i+1,num,fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        printfact(1,num,1);
        
    }
}
