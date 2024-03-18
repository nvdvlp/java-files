//Declara 2 variables numéricas (con el valor que desees),
// he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
// para comprobar que funciona.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double n1 , n2;

        System.out.println("ingrese el primer valor: ");
        n1 = reader.nextDouble();

        System.out.println("ingrese el primer valor: ");
        n2 = reader.nextDouble();

        if(n1 < n2){
            System.out.println(n2 + " es mayor a " + n1);
        }else{
            System.out.println(n1 + " es mayor a " + n2);
        }
    }
}