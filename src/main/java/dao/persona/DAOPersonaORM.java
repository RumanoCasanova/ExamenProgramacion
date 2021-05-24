package dao.persona;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import db.DBConnectionORM;
import entities.Persona;

import java.sql.SQLException;
import java.util.List;

public class DAOPersonaORM implements DAOPersona {
    Dao<Persona, String> daopersonaORM;

    public DAOPersonaORM() throws SQLException {
        this.daopersonaORM = DaoManager.createDao(
                DBConnectionORM.getInstance(),
                Persona.class
        );
        DaoManager.registerDao(
                DBConnectionORM.getInstance(),
                daopersonaORM
        );
    }

    @Override
    public void insertaPersona(Persona persona) {
        try {
            daopersonaORM.queryForAll();
        } catch (SQLException throwables) {

        }

    }

    @Override
    public List<Persona> listaPersonas() {
        try {
            return daopersonaORM.queryForAll();
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public void eliminaPersona(int id) {
        try {
            daopersonaORM.queryForAll();
        } catch (SQLException throwables) {

        }
    }
}
