//it return the number from n to 1 using recursion
import java.util.Scanner;
public class Sumofdigits {
    public static void printSum(int i,int num,int sum){
        if(i==num){
            sum+=i;
            System.out.println("Sum is "+sum);
            return;
        }
        sum+=i;
        printSum(i+1,num,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("From which number to you want to see the sum: ");
        int i=sc.nextInt();
        printSum(i,num,0);
        
    }
}
