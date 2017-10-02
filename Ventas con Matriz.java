package javafunda2dosemestre;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjemploVentasClaseMatriz {
    public static void main(String[]args){
        
        Scanner notaria = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Vendedores: ");
        int VENDEDORES = notaria.nextInt();
        System.out.println("Ingrese la cantidad de Dias de Trabajo: ");
        int DIAS = notaria.nextInt();
        
        int ventas[][]= new int [VENDEDORES][DIAS];
        int suma =0,i,j;
        float promedio=0;
        BufferedReader In = new BufferedReader (new InputStreamReader(System.in));
        
        try{
            for(i=0; i< VENDEDORES; i++){
                System.out.println("Ingrese las ventas de la semana para el vendedor: "+i);
                for(j=0; j<DIAS; j++){
                    System.out.println("Ingrese las ventas para el dia: "+j);
                    ventas[i][j]= Integer.parseInt(In.readLine());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for(i=0; i<VENDEDORES; i++){
            suma=0;
            for(j=0; j<DIAS; j++){
                suma= suma+ ventas[i][j];
            }
            promedio = (float) suma/DIAS;
            System.out.println("El promedio de ventass para el vendedor:- " + i + " -es:-> "+promedio);
        }
    }
}