import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dequipos {
    int id;
    String nombreE;
    String colores;
    String pais;
    int cantidad;
    String valorE;

    public Dequipos(int id,String nombreE, String colores, String pais, int cantidad, String valorE) {
        this.id=id;
        this.nombreE = nombreE;
        this.colores = colores;
        this.pais = pais;
        this.cantidad = cantidad;
        this.valorE = valorE;
    }
    // Sin parametros

    public Dequipos() {
    }

    // Setters y Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getValorE() {
        return valorE;
    }

    public void setValorE(String valorE) {
        this.valorE = valorE;
    }


    // Metodo personalizado de agregacion a la base
    public void InsertarItemBD(String nombreE, String colores, String pais, int cantidad, String valorE){
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/datosequipos","root","")){
            // Formato para insertar los valores
            String sql="INSERT INTO equipos(nombreE,colores,pais,cantidad,valorE)VALUES(?,?,?,?,?)";
            //Para verificar si no estar repetidos los datos
            try (PreparedStatement preparedStatement=connection.prepareStatement(sql)){
                // Setear los valores String.valueOf(nota1)
                preparedStatement.setString(1, nombreE);
                preparedStatement.setString(2, colores);
                preparedStatement.setString(3, pais);
                preparedStatement.setString(4, String.valueOf(this.cantidad));
                preparedStatement.setString(5, valorE);

                int filasAfectadas=preparedStatement.executeUpdate();

                if(filasAfectadas>0){
                    System.out.println("Inserccion exitosa");

                }else{
                    System.out.println("Inserto de datos fallido");
                }

            }catch (Exception e){
                e.printStackTrace();
            }



        }catch (SQLException e){
            e.printStackTrace();
        }

    }


}
