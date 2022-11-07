import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Introduzca un numero para calcular su factorial: ");
        int a = myInput.nextInt();
        int factorial = 1;

        for (int i = 1; i < a; i++ ) {
            factorial = factorial * i;
            


       


        }
        System.out.print(factorial);



    }


}