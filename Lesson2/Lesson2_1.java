import static java.lang.System.out;
import java.util.Scanner;

public class Lesson2_1{
    public static void main(String...args){
        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        if (a < b){
            out.print("a < b");
        }else if (a > b){
            out.print("a > b");
        }else{
            out.print("a == b");
        }
    }
}
