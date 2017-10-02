package javafunda2dosemestre;
import java.util.Scanner;
public class MetodoBurbujaClaseArreglo {
    public static int N = 10;
    public static void main(String[]args){
        int[]numeros = new int[N];
        int i,j,buscar_n,k,aux;
        boolean esta = true;
        Scanner orden= new Scanner(System.in);
        //Primero ingresamos los numeros
        for(i=0; i<N; i++){
            System.out.println("Ingrese un numero para la celda n°" +i+": ");
            numeros[i] = orden.nextInt();
        }
        //despues ordenaremos los numeros
        for(i=0; i<=N; i++){
            for(j=0; j <N-1; j++){
                if(numeros[j+1] > numeros[j]){//(numeros[j+1]> numeros[j])->de mayor a menor Y (numeros[j]> numeros[j+])->de menor a mayor
                    //intercambiamos las variables
                    aux = numeros[j];
                    numeros[j]= numeros [j+1];
                    numeros[j+1]= aux;
                }
            }
        }
        System.out.println("---------------------");
        //finalmente mostraremos los numeros ordenados en el arreglo
        for(i=0; i<N; i++){
            System.out.println("Numeros ["+i+"]"+numeros[i]);
        }
        //busquemos ahora un numero
        System.out.println("ingrese el numero a buscar: ");
        buscar_n = orden.nextInt();
        //ahora se buscara el numero ingresado
        for(i=0; i<N; i++){
            if(buscar_n == numeros[i]){
                //cambiamos la variable esta para que sea enncontrado
                esta= false;
            }else if(numeros[i] != buscar_n){
                esta= true;
            }
        }
        if(esta = false){//si el valor sigue estando != de los numeros[i]
            System.out.println("El numero "+buscar_n+" Si pertence a este Arreglo");
        }else if(esta = true){
            System.out.println("El numero "+buscar_n+" No pertenece a este Arreglo");
        }
    }
}