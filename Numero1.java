import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola e ti dirò se ha un numero pari o dispari di lettere:");
        String word1 = input.nextLine();
        System.out.println(stringaPariDispari(word1) ? word1 + " ha un numero pari di lettere." : word1 + " ha un numero dispari di lettere.");
        System.out.println("Inserisci un anno e ti dirò se è bisestile o meno:");
        int anno = Integer.parseInt(input.nextLine());
        System.out.println(annoBisestile(anno) ? anno + " è bisestile." : anno + " non è bisestile.");
        input.close();
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0 && n % 400 == 0) {
                return true;
            } else return n % 100 != 0;
        } else {
            return false;
        }
    }
}
