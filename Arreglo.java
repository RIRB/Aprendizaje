//Siempre Asignar el Proceso
package javafunda2dosemestre;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Arreglo {
    public static void main(String[]args){
        int numeros[]= new int[10];
        int suma =0,i;
        float prom =0;
        BufferedReader In = new BufferedReader (new InputStreamReader(System.in));
        //Se Rellena Arreglo
        try{ 
            for (i=0; i<10; i++){
            //Se Imprimern los Datos
            System.out.println("Ingrese un numero en la posicion "+i);
            //Lee cada Dato por Posicion
            numeros[i]= Integer.parseInt(In.readLine());
            suma=suma + numeros[i];
        }
        //Calculo del Promedio
        prom = (float) suma/10;
        System.out.println("El promerio es "+prom);
        }catch (Exception e){
            e.printStackTrace();
        }
    }   
}