//Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
// Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Por, favor Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido/a "+ nombre);
    }
}