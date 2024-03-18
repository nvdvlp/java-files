//Haz una aplicación que calcule el área de un círculo(pi*R2).
// El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
// Usa la constante PI y el método pow de Math.

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Por, favor Ingrese el radio"));
        double area = Math.pow(radio, 2)* pi;
        JOptionPane.showMessageDialog(null,"el area del círculo es : "+ area);

    }
} 