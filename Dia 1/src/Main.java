import java.util.Locale;
import java.util.Scanner;

//nesse caso temos o package java util, default que tem o methodo MAIN
//abaixo temos a class
public class Main { //public pode ser acessada por outra parte do nosso codigo
//esse e nosso method
    public static void main(String[] args ) { //metodo que nao retorna nada, VOID
        //aqui temos o statements(o que ira ser codificado)
        Scanner scamNumber = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numberOne = scamNumber.nextInt();
        System.out.println("Digite outro numero: ");
        int numberTwo = scamNumber.nextInt();
        System.out.println("Resultado: "+(numberOne + numberTwo));

    }
}