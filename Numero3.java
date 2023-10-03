import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        whileFunction();
    }

    public static void whileFunction() {
        String str = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserisci una parola: (Per terminare inserisci :q )");
            str = input.nextLine();
            if (str.equals(":q")) {
                System.out.println("Esco.");
                input.close();
                break;
            } else {
                String[] arrSTR = str.split("");
                System.out.println(String.join(",", arrSTR));
            }
        }
        while (true);
    }

}
