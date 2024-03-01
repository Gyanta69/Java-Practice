// to input a number of month and take out the month's name as output
import java.util.*;
public class months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();
        switch (monthNum) {
            case 1:if(monthNum == 1){
                System.out.println("January");
                break;
            }
            case 2:if(monthNum == 2){
                System.out.println("Feburary");
                break;
            }
            case 3:if(monthNum == 3){
                System.out.println("March");
                break;
            }
            case 4:if(monthNum == 4){
                System.out.println("April");
                break;
            }
            case 5:if(monthNum == 5){
                System.out.println("May");
                break;
            }
            case 6:if(monthNum == 6){
                System.out.println("June");
                break;
            }
            case 7:if(monthNum == 7){
                System.out.println("July");
                break;
            }
            case 8:if(monthNum == 8){
                System.out.println("August");
                break;
            }
            case 9:if(monthNum == 9){
                System.out.println("September");
                break;
            }
            case 10:if(monthNum == 10){
                System.out.println("Octuber");
                break;
            }
            case 11:if(monthNum == 11){
                System.out.println("November");
                break;
            }
            case 12:if(monthNum == 12){
                System.out.println("December");
                break;
            }
            case 13:if(monthNum >= 13){
                System.out.println("The months number must be less than 12");
                break;
            } 
            default: System.out.println("Please input a month number greater than 0");
                break;
                
        }
        sc.close();

    }
    
}
