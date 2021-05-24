package dao.persona;

import entities.Persona;

import java.util.List;

public interface DAOPersona {
    public void insertaPersona(Persona persona);
    public List<Persona> listaPersonas();
    public void eliminaPersona(int id);
}
