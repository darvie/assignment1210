import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
        //this part gets the user input
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter a real number: ");

        String n = ui.nextLine();

        //This part displays the user input
        int ni = n.indexOf(".");
        System.out.println("Number Entered: " + n);

        //This part prints out the integer part
        System.out.println("Integer part: " + n.substring(0,ni));

        //This part displays the decimal part
        System.out.println("Decimal Part: " + n.substring(ni));


        /* This is extra stuff i dont need anymore
         double ni = Double.valueOf(n).intValue();
        System.out.println("Integer part: " + ni);
        System.out.println()
                */









    }
}