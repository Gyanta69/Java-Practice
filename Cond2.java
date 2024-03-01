// To input any two numbers and find out weather they are equal,greater and smaller
import java.util.*;
public class Cond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Both are equal numbers");
        }else if(num1 > num2){
            System.out.println("The first number is greater than the second one");
        }else if (num1 < num2){
            System.out.println("The first number is smaller than the second one");
        }
        sc.close();
    }
    
}
