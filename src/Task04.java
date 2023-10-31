import java.util.Scanner;

public class Task04 {
   public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
    int n= scanner.nextInt();
    recursion(n);
   }
   static int recursion(int n){

      if(n==0){
      }
      System.out.print("После обратного порядка " + n);
      return n;
   }
}
