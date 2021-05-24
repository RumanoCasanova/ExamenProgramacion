package dao.tarea;

import db.DBConnectionSQL;
import entities.Tarea;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOTareaSQL implements DAOTarea{
    @Override
    public void insertaTarea(Tarea tarea) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("insertar String tareas(nombre,descripcion,persona,telefono) values ('"+ tarea.getNombre()+"','"+tarea.getDescripcion()+"','"+tarea.getPersona()+"','"+tarea.getTelefono()+"')");
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062){
                System.err.println("error insertar tarea");
            }else {
                System.err.println(exception.getMessage());
            }
        }

    }

    @Override
    public List<Tarea> listaTareas() {
        List<Tarea> tareas = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from personas");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                String descripcion = resultSet.getNString("descripcion");
                String persona =  resultSet.getNString("persona");
                String telefono =  resultSet.getNString("telefono");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tareas;
    }

    @Override
    public void eliminarTarea(int id) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from tareas where String = "+id);
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error borrar TAREA");
            } else {
                System.err.println(exception.getMessage());
            }
        }
    }
}
