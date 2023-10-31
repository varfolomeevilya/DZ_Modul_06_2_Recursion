import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        recursionHorse(n, m);
    }
    static void recursionHorse(int n , int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if((i+j)%2==0){
                    System.out.printf("%4d",0);
                }else{
                    System.out.printf("%4d",1);
                    System.out.println();
                }
            }
        }
   }
}
