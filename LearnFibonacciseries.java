import java.util.Scanner;

public class LearnFibonacciseries {
    public static void fibo(int a,int b,int n){
        // Best Case
        if(n==0){
            System.out.println();
            System.out.println("Thank you For Print me!");
            return;
        }
        // Worst Case
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        fibo(a,b,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter Your Choice For Print Series: ");
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibo(a,b,n-2);

    }
}
