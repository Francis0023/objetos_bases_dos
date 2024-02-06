import java.sql.Connection;
import java.sql.DriverManager;

public class conexionbd {
    String servidor;
    String  usuario;
    String contraseña;
    String mensaje;

    public conexionbd(String servidor, String usuario, String contraseña) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //
    public conexionbd(){
    }
    //
    public void conexionlocaL(String servidor,String usuario,String contraseña){
        // Creado el objeto de la clase connection
        try(Connection connection= DriverManager.getConnection(servidor,usuario,contraseña)){
            if(connection != null){
                System.out.println("Conexion Correcta");
            }

        }catch (Exception e){
            System.out.println("Error. La conexion esta deshabilitada");
            // Para mostrar los errores
            e.printStackTrace();

        }
    }
    // Setters t getters de mensaje
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}