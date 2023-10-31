import java.util.Scanner;

public class Task06 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        recursion(n);
    }
      static void recursion(int n){
        int sum=0;
        if(n==1){
            sum+=n;
        }
        System.out.print(n);
    }
}
