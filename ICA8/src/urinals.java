import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Subham Kumar
 */

public class urinals {
    public static void main(String[] args) throws IOException {
        urinals newUrinal = new urinals();
        FileWriter fWrite;
        int version = 1;
        File file = new File("./src/rule.txt");
        if(file.exists()) {
            String newFileName = "./src/rule" + version + ".txt";
            File newFile = new File(newFileName);
            while (newFile.exists()) {
                version++;
                newFileName = "./src/rule" + version + ".txt";
                newFile = new File(newFileName);
            }
            fWrite = new FileWriter(newFileName);
        }
        else{
            fWrite = new FileWriter("./src/rule.txt");
        }
        ArrayList inputUrinals = newUrinal.getInputFile();
        for (int i = 0; i < inputUrinals.size(); i++) {
            String str = (String) inputUrinals.get(i);
            boolean inputStr = goodString(str);
            if (inputStr) {
                int count = newUrinal.countFreeUrinals(str);
                String text = String.valueOf(count);
                fWrite.write(text);
                fWrite.write("\n");
            }
        }
        fWrite.close();
//        String inputUrinals = newUrinal.getInputKeyboard();
//        if (inputUrinals != null) {
//            int count = newUrinal.countFreeUrinals(inputUrinals);
//            System.out.println(count);
//        }
    }

    public static Boolean goodString(String str) {
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
        if (!goodString(input)) {
            System.out.println("Invalid Input");
            return null;
        }
        return input;
    }

    public int countFreeUrinals(String inputUrinals) {
        int count = 0;
        char ch = '1';
        String str = inputUrinals;
        for (int i = 0; i < str.length(); i++) {
            Boolean flag = false;
            if (i == 0 && str.charAt(i) == '0') {
                if (str.charAt(i + 1) == '0') {
                    count++;
                    flag = true;
                }
            } else if (i == str.length() - 1 && str.charAt(i) == '0' && str.charAt(i - 1) == '0') {
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

    public ArrayList<String> getInputFile() throws IOException {
        ArrayList<String> input = new ArrayList<>();
        String file = "./src/InputStrings.txt";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            input.add(line);
        }
        return input;
    }
}