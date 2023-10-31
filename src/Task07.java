import java.util.Scanner;

public class Task07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     String str= scanner.nextLine();
     recursion(str);
    }
    static String recursion(String str){
        if(str==str){

            System.out.print("Yes\n");
        }
        if(str==str){

            System.out.print("No\n");
        }

        return str;
    }
}
