package dao.tarea;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import dao.persona.DAOPersonaORM;
import db.DBConnectionORM;
import entities.Tarea;

import java.sql.SQLException;
import java.util.List;

public class DAOTareaORM implements DAOTarea{
    Dao<Tarea , String> daotareaORM;
    public DAOTareaORM() throws SQLException{
        this.daotareaORM = DaoManager.createDao(
                DBConnectionORM.getInstance(),
                Tarea.class
        );
        DaoManager.registerDao(
                DBConnectionORM.getInstance(),
                daotareaORM
        );
    }
    @Override
    public void insertaTarea(Tarea tarea) {
        try {
            daotareaORM.queryForAll();
        }catch (SQLException throwables){}

    }

    @Override
    public List<Tarea> listaTareas() {
        try {
            return daotareaORM.queryForAll();
        }catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public void eliminarTarea(int id) {
        try {
            daotareaORM.queryForAll();
        }catch (SQLException throwables){}

    }
}
