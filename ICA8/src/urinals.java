import java.util.Scanner;

/**
 * @author Subham Kumar
 */

public class urinals {
    public static void main(String[] args) {
        urinals newUrinal = new urinals();
        String inputUrinals = newUrinal.getInputKeyboard();
        int count = newUrinal.countFreeUrinals(inputUrinals);
        System.out.println(count);
    }

    public Boolean goodString(String str) {
        boolean flag = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '1' && str.charAt(i - 1) == '1' || str.charAt(i) == '1' && str.charAt(i + 1) == '1')
                flag = false;
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

    public int countFreeUrinals(String inputUrinals) {
        int count = 0;
        char ch = '1';
        String str = inputUrinals;
        for (int i = 0; i < str.length(); i++) {
            Boolean flag = false;
            if (i == 0 && str.charAt(i) == '0') {
                if(str.charAt(i+1) == '0'){
                    count++;
                    flag = true;
                }
            } else if (i == str.length() - 1 && str.charAt(i) == '0' && str.charAt(i - 1) == '0' ) {
                count++;
                flag = true;
            } else if (str.charAt(i) == '0' && str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                count++;
                flag = true;
            }
            if (flag) {
                StringBuilder string = new StringBuilder(str);
                string.setCharAt(i, ch);
                str = String.valueOf(string);
            }

        }
        return count;
    }
}