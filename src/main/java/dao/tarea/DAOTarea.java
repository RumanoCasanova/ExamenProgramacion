package dao.tarea;

import entities.Persona;
import entities.Tarea;

import java.util.List;

public interface DAOTarea {
    public void insertaTarea(Tarea tarea);
    public List<Tarea> listaTareas();
    public void eliminarTarea(int id);
}
