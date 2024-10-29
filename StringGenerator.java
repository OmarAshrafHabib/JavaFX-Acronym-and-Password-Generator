
/**
 * this class generates two static methods that can be used by other classes 
 * @author Omar Habib ID:3742418
 */
import java.util.Scanner;

public class StringGenerator {
    /**
     * The method generates & returns an acronym based on this
     * parameter
     * 
     * @param text
     * @return acrynom
     */
    public static String generateAcronym(String text) {
        String acromym = "";
        Scanner tokenizer = new Scanner(text);
        while (tokenizer.hasNext()) {
            String word = tokenizer.next();
            if (Character.isUpperCase(word.charAt(0))) {
                acromym += word.charAt(0);
            }
            if (word.charAt(0) >= 48 && word.charAt(0) <= 57) {
                acromym += word;
            }

        }
        return acromym;
    }

    /**
     * The method generates & returns a password based on this parameter
     * 
     * @param text
     * @return password
     */
    public static String generatePassword(String text) {
        Scanner tokenizer = new Scanner(text);
        String password = "";
        int counter = 0;
        while (tokenizer.hasNext()) {
            String word = tokenizer.next();
            char char1 = word.charAt(word.length() - 2);
            char char2 = word.charAt(word.length() - 1);
            char char3 = word.charAt(0);
            char char4 = word.charAt(1);

            if (word.length() >= 3) {
                if (counter % 2 == 0) {
                    char ch1 = Character.toLowerCase(char1);
                    char ch2 = Character.toLowerCase(char2);
                    if (ch1 == 'B') {
                        ch1 = '3';
                    }
                    if (ch1 == 'H') {
                        ch1 = '#';
                    }
                    if (ch1 == 'a') {
                        ch1 = '@';
                    }
                    if (ch1 == 't') {
                        ch1 = '+';
                    }
                    if (ch2 == 'B') {
                        ch2 = '3';
                    }
                    if (ch2 == 'H') {
                        ch2 = '#';
                    }
                    if (ch2 == 'a') {
                        ch2 = '@';
                    }
                    if (ch2 == 't') {
                        ch2 = '+';
                    }
                    password += ch1;
                    password += ch2;
                }

                else {
                    char ch3 = Character.toUpperCase(char3);
                    char ch4 = Character.toUpperCase(char4);
                    if (ch3 == 'B') {
                        ch3 = '3';
                    }
                    if (ch3 == 'H') {
                        ch3 = '#';
                    }
                    if (ch3 == 'a') {
                        ch3 = '@';
                    }
                    if (ch3 == 't') {
                        ch3 = '+';
                    }
                    if (ch4 == 'B') {
                        ch4 = '3';
                    }
                    if (ch4 == 'H') {
                        ch4 = '#';
                    }
                    if (ch4 == 'a') {
                        ch4 = '@';
                    }
                    if (ch4 == 't') {
                        ch4 = '+';
                    }
                    password += ch3;
                    password += ch4;
                }
                counter++;
            }
        }
        return password;
    }
}
