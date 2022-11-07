import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor introduzca un termino: ");

        int a = 0, b = 1, c, n;
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;


        }
        System.out.print(a);

    }




}