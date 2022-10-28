import java.util.Scanner;

/**
 * @author Subham Kumar
 */

public class urinals {
    public static void main(String[] args) {
        urinals newUrinal = new urinals();
        String inputUrinals = newUrinal.getInputKeyboard();
        System.out.println(newUrinal.goodString(inputUrinals));
    }

    public Boolean goodString( String str ) {
        boolean flag = false;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1')
                flag =  true;
        }
        return flag;
    }
    public String getInputKeyboard() {
        System.out.println("Enter 1 for occupied and 0 for unoccupied urinals");
        System.out.println("Enter the input representing the urinals.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}