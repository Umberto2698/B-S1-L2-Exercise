import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero e farò il conto alla rovescia per te!");
        int n = Integer.parseInt(input.nextLine());
        forFunction(n);
        input.close();
    }

    public static void forFunction(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(n - i);

        }
    }
}
