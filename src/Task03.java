import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
      recursion(n);
    }
    static  int recursion(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            sum= sum+n;
        }
        return n;
    }
}
