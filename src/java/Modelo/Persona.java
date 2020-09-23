package Modelo;


public class Persona {
    int idPersona;
    String dpiPersona;
    String  nombresPersona;

    public Persona() {
    }

    public Persona(int idPersona, String dpiPersona, String nombresPersona) {
        this.idPersona = idPersona;
        this.dpiPersona = dpiPersona;
        this.nombresPersona = nombresPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDpiPersona() {
        return dpiPersona;
    }

    public void setDpiPersona(String dpiPersona) {
        this.dpiPersona = dpiPersona;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }
    
    
}
