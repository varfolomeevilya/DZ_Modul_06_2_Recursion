import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
     int n= scanner.nextInt();
     int n1= scanner.nextInt();
     recursion(n, n1);
    }
     static void recursion(int n, int n1){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n1; j++){
                sum= i+j;
                if(i+ j%2==0){
                    System.out.printf("%4d", i);
                    sum++;
                }else{
                    System.out.printf("%4d", j);
                    System.out.println();
                }
            }
        }
    }
}
