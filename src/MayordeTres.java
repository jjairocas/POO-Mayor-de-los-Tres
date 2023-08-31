import java.util.*;

public class MayordeTres {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        int numero1=input.nextInt();
        System.out.println("Ingrese numero 2:");
        int numero2=input.nextInt();
        System.out.println("Ingrese numero 3:");
        int numero3= input.nextInt();

        int mayor=0;
        if((numero1>numero2) && (numero1>numero3)){
            mayor=numero1;
        }
        else if((numero2>numero1) && (numero2>numero3)){
            mayor=numero2;
        }
        else if((numero3>numero1) && (numero3>numero2)){
            mayor=numero3;
        }
        System.out.println("El numero mayor de los tres es: "+mayor);

    }
}