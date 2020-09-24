package interfaces;

import java.util.List;
import Modelos.Persona;

public interface CRUD {
    public List listar();
    public Persona list(int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}