import static java.lang.System.out;
import java.util.Scanner;

public class Lesson2_2{
    public static void main(String...args){
        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);

        if (a < b){
            out.print("Yes");
        }else if(b < c){
            out.print("Yes");
        }else{
            out.print("No");
        }
    }
}
