import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton comprobacionDeLaConexionButton;
    private JButton borrarButton;
    private JButton insertarEnLaBaseButton;
    private JTextField textField4;
    JPanel panel1;
    private JTextField textField5;

    public form1() {
        comprobacionDeLaConexionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Nombre de la clase de la conexion
                conexionbd miconexion=new conexionbd();
                // Conexion con la base de datos
                miconexion.conexionlocaL("jdbc:mysql://localhost:3306/estudiantes","root","");
                //
                //mensaje1.setText(miconexion.getMensaje());

            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
            }
        });
        insertarEnLaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // para almacenar los paramteros que vamos a enviar
                Dequipos miDequipos=new Dequipos();
                // Toma los valores de los textfield en los numeros cambiamos a enteros porque estan en texto y por eso el error
                //insertarDatos.ingresoDatos(textField1.getText(),textField2.getText(),Integer.parseInt(textField3.getText()),Integer.parseInt(textField4.getText()));
                miDequipos.InsertarItemBD(textField2.getText(),textField1.getText(),textField3.getText(),Integer.parseInt(textField4.getText()),textField5.getText());
                

            }
        });

    }
}
