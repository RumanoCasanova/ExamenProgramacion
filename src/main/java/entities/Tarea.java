package entities;

public class Tarea {
    private String nombre;
    private String descripcion;
    private String persona;
    private String telefono;

    public Tarea(String nombre, String descripcion, String persona, String telefono) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.persona = persona;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", persona='" + persona + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
