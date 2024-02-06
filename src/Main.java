import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame principal = new JFrame("Ingreso de calificaciones");
        principal.setContentPane(new form1().panel1);
        //principal.setContentPane(new menuInsertion().for);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.pack();
        principal.setSize(800, 500);
        principal.setLocationRelativeTo(null); // Centrar la ventana
        principal.setVisible(true);

    }
}