import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Начало диапозона A:");
        int a = in.nextInt();
        System.out.print("Конец диапаозона B:");
        int b = in.nextInt();
     recursion(a,b);
    }
     static void recursion(int a, int b){
      for(int i=a; i<b; i++){
          System.out.print(i);
      }
      System.out.println();
    }
}
