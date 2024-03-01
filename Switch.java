import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        /*  Without using switch
        if(button == 1){
            System.out.println("Hello");
        }else if(button == 2){
            System.out.println("Namaste");
        }else if(button == 3){
            System.out.println("Bonjure");
        }else {
            System.out.println("The button hasn't been pressed");

        } */

        // By using switch
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Bonjure");
            break;
            default : System.out.println("The button hasn't been pressed");
        }
       
        sc.close();
    }
    
}
