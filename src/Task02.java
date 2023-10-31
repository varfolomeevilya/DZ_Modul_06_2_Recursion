import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n= in.nextInt();
      recursion(n);
    }
    static int recursion(int n){

        for(int i=1; i<n; i++){
            while (i<n){
                i=i*2;
            }
            if(n==i){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }
        return n;
    }
}
