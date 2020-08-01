import java.util.Scanner;

class PrintDayInWord {
    // this code prints the days of the week base on a corresponding number
    public static void main(String[] args){
        int dayNumber;

        System.out.println("Welcome to our game: PrintDayInWord");
        System.out.println("Note: days are numbered from 1 to 6, corresponding to Monday till Saturday");
        System.out.println("Which day of the week in number do you want to print in word ?");

        Scanner wk = new Scanner(System.in);
        dayNumber =  wk.nextInt();
        wk.close();
        
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thursday");
                break;  
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; 
            default:
                System.out.println("Not a valid day!");
        }

    }
}