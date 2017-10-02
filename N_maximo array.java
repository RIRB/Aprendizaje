package javafunda2dosemestre;
import java.util.Scanner;
public class NmaxdeArray {
    
    public static int N = 10;
    public static void main (String[]args){
        int[] numeros = new int[N];
        int i;
        int max;
        Scanner intro = new Scanner(System.in);
        //Se hace Ingreso de numeros
        for(i = 0; i < N ; i++){
            System.out.println("Ingrese un Numero para la celda n° "+i+": ");
            numeros[i] = intro.nextInt();
        }
        //Despues buscamosel N mayor
        max = numeros[0];
        for(i = 1; i < N; i++){
            if(max < numeros[i]){
                //max se cambiara segun sea mayor que los demas datos de N
                max = numeros[i];
            }
        }
        //Imprimir el N max
        System.out.println("El valor maximo es de: " +max);
    }
}