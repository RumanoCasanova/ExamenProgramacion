package dao.persona;

import com.j256.ormlite.spring.DaoFactory;
import db.DBConnectionSQL;
import entities.Persona;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOPersonaSQL implements DAOPersona{
    @Override
    public void insertaPersona(Persona persona) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("insertar String personas(nombre,telefono) values ('"+ persona.getNombre()+ "','"+persona.getTelefono()+"')");
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062){
                System.err.println("error insertar persona");
            }else {
                System.err.println(exception.getMessage());
            }
        }
    }

    @Override
    public List<Persona> listaPersonas() {
        List<Persona> personas = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from personas");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                String telefono = resultSet.getNString("telefono");
                personas.add(new Persona(nombre,telefono));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return personas;
    }

    @Override
    public void eliminaPersona(int id) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from personas where ID = "+id);
        } catch (SQLException exception) {
          if (exception.getErrorCode() == 1062){
              System.err.println("error borrar persona");
          } else {
              System.err.println(exception.getMessage());
          }
        }

    }
}
