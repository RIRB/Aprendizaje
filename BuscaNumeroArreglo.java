package javafunda2dosemestre;
import java.util.Scanner;
public class BuscaNumeroArreglo {
    
    public static int N = 11;
    public static void main (String[]args){
        int[] numeros = new int[N];
        int i;
        boolean esta = true;// 0 quiere decir que iremos a suponer que el N° que desea buscar el Usuario No esta en el Arreglo*/
                            //Y por la parte boolean, se dice que el numero a ingresar siempre sera true, hasta que el arreglo diga que no se encontro
        int Nbuscar;
        Scanner busqueda = new Scanner(System.in);
        //Se hace el ingreso de un numero
        for(i=1 ; i<N; i++){
            System.out.println("Ingrese un numero en el Arreglo para la Celda n°: "+i+": ");
            numeros[i] = busqueda.nextInt();
        }
        System.out.println("------------------------------------");
        //luego ingresa el numero que se desea buscar
        System.out.println("Ingrese el numero que desea buscar: ");
        Nbuscar = busqueda.nextInt();
        //siguiendo lo anterior, ahora el numero ingresado sera buscado en el arreglo
        for(i=0 ;i<N; i++){
            if(Nbuscar == numeros[i]){
                //cambiamos la variable esta para que sea 1
                //cambiamos la variable esta para que sea false el numero que se encontrara en el arreglo
                esta= false;
            }else if(numeros[i] != Nbuscar){
                esta= true;
            }
            break;
        }
        if(esta = false){//si el valor sigue siendo 0 o != de numeros[i], es porque no se esncuentra el numero
            System.out.println("El "+ Nbuscar +" Si esta en el arreglo");
        }else if (esta = true){
            System.out.println("El "+Nbuscar+" No esta en el arreglo");            
        }
    }    
}