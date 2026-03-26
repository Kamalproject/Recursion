//it return the number from n to 1 using recursion
import java.util.Scanner;
public class Number {
    public static void printNum(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        printNum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        printNum(num);
    }
}
