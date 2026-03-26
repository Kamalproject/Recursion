import java.util.Scanner;
public class Factorialofnumber {
    public static int printFact(int num){
        if(num==1){
            return 1;
        }
       return num*printFact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        System.out.println("Factorial of the number is "+printFact(num));
        
    }
}
