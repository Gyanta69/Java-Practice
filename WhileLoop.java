import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i<11){
            System.out.println(i);
            i = i + 1 ;
        }
        sc.close();
    }
}
