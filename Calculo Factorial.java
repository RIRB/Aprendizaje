package javafunda2dosemestre;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner multi = new Scanner(System.in);
        //while{ (el while me sirve solo como un: Mientras hacer, Finmientras)
        //}
        System.out.println("Ingrese Numero");
        int num = multi.nextInt();
        int factorial = 1;
        int numero = num;
        while(num > 1){
            factorial = factorial * num;
            num = num - 1;
        }
        System.out.println("El factorial del "+numero+" es: "+factorial);
    }
}