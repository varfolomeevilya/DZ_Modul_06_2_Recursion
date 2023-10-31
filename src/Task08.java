import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int m= in.nextInt();
        int n= in.nextInt();
        recursion(m,n);
    }
     static void recursion(int m, int n){
        int res=0;
        if(n>2){
            res= m ^ n ;
        }
        System.out.print(res) ;
    }
}
