import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: (Se è compreso tra 0 e 3 lo scriverò in lettere)");
        int n = Integer.parseInt(input.nextLine());
        System.out.println(switchFunction(n));
        input.close();
    }

    public static String switchFunction(int n) {
        return switch (n) {
            case 0 -> "Z-E-R-O.";
            case 1 -> "U-N-O.";
            case 2 -> "D-U-E.";
            case 3 -> "T-R-E.";
            default -> "E-R-R-O-R-E.";
        };
    }
}
