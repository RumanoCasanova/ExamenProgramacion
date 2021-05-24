package dao;

import dao.persona.DAOPersona;
import dao.persona.DAOPersonaORM;
import dao.persona.DAOPersonaSQL;
import dao.tarea.DAOTarea;
import dao.tarea.DAOTareaORM;
import dao.tarea.DAOTareaSQL;

import javax.xml.transform.Source;
import java.sql.SQLException;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOPersona daoPersona;
    private DAOTarea daoTarea;
    private Object Source;

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
}
/*NO entiendo porque me da error lo de SQL Y ORM que lo he pegado igual y mo va ;(
    public DAOPersona getDaoPersona(Source source) {
        if (daoPersona == null) {
            if (source == Source.SQL)
                daoPersona = new DAOPersonaSQL();
        } else if (source == Source.ORM) {
            try {
                daoPersona = new DAOPersonaORM();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return daoPersona;
    }

    public DAOTarea getDaoTarea(Source source) throws SQLException {
        if (daoTarea == null) {
            if (source == source.SQL)
                daoTarea = new DAOTareaSQL();
        } else if (Source == Source.ORM) {
            daoTarea = new DAOTareaORM();
        }
        return daoTarea;
    }

 */


