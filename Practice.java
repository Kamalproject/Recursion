import java.util.Scanner;
public class Practice {
    //Using Recursion print the number from n to 1;
    public static void printNum(int i,int num){
        if(i==num+1){
            return;
        }
        else{
            System.out.print(i+" ");
            printNum(i+1,num);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print 1 to n
        System.out.println("Enter number: ");
        int n=sc.nextByte();
        printNum(1,n);
        System.out.println();
        
    }
}
