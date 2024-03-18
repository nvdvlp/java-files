//Declara dos variables numéricas (con el valor que desees), muestra por consola
// la suma, resta, multiplicación, división y módulo (resto de la división).
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double n1, n2, sum, res, mult, div, mod;
        int operationType;

        System.out.println("Ingresa el primer número:");
        n1 = reader.nextDouble();

        System.out.println("Ingresa el segundo número:");
        n2 = reader.nextDouble();

        System.out.println("Ingresa que operación se quiere realizar: 1) suma, 2) resta, 3) multiplicacion, 4) división y 5) mod ");
        operationType = reader.nextInt();
        switch(operationType){
            case 1:
                sum = n1 + n2;
                System.out.println("la suma es" + sum );
                break;
            case 2:
                res = n1 - n2;
                System.out.println("la resta es" + res);
                break;
            case 3:
                mult = n1 * n2;
                System.out.println("la multiplicación es" + mult);
                break;
            case 4:
                div = n1 / n2;
                System.out.println("la división es" + div);
                break;
            case 5:
                mod = n1 % n2;
                System.out.println("el residuo es" + mod);
                break;
            default:
                System.out.println("ingresa un tipo de operación valido");
        }
    }
}