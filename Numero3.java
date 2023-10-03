import java.util.Arrays;
import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        whileFunction();
    }

    public static void whileFunction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola: (Per terminare inserisci :q )");
        String word = input.nextLine();
        char[] arr = word.toCharArray();
        String[] arrStr = new String[word.length()];
        String newWord = StringUtils.repeat("*", 10);
        int i = 0;
        while (i < arrStr.length) {
            if (i == arrStr.length - 1) {
                arrStr[i] = Character.toString((arr[i]));
            } else {
                arrStr[i] = Character.toString(arr[i]).concat(",");
            }
            i++;
        }
        if (!word.equals(":q")) {
            System.out.println(Arrays.toString(arrStr));
            whileFunction();
        }
    }
}
