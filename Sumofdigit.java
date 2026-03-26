import java.util.Scanner;
public class Sumofdigit {
    public static int printSum(int num){
        int sum=0;
        if(num==0){
            return sum;
        }
        return num+printSum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum of first n number is "+printSum(num));
    }
}
