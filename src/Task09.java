import java.util.Scanner;

public class Task09 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Начало диапозона m");
        int m=scanner.nextInt();
        System.out.print("Конец диапозона n");
        int n= scanner.nextInt();
        recursion(m,n);
    }
     static void recursion(int m, int n){

        for(int i=m; i<n; i++){

            System.out.print(i);
        }
    }
}
