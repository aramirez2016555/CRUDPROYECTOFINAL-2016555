package modeloDAO;

import Configuración.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Persona;

public class PersonaDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona nPersona = new Persona();
    

    public List listar() {
        ArrayList<Persona> listaPersona = new ArrayList<>();
        String sql = "select * from persona";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Persona nuevaPersona = new Persona();
                nuevaPersona.setIdPersona(rs.getInt("idPersona"));
                nuevaPersona.setDpiPersona(rs.getString("dpiPersona"));
                nuevaPersona.setNombresPersona(rs.getString("nombresPersona"));
                listaPersona.add(nuevaPersona);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaPersona;
    }

    public Persona list(int id) {
        String sql = "select * from persona where idPersona =" + id;
    
    try{
        con = conect.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            nPersona.setIdPersona(rs.getInt("idPersona"));
            nPersona.setDpiPersona(rs.getString("dpiPersona"));
            nPersona.setNombresPersona(rs.getString("nombresPersona"));
        }
    }catch (Exception e){
        e.printStackTrace();
    }
        return nPersona;
    }


    public boolean add(Persona per) {
        String sql = "insert into persona(dpiPersona, nombresPersona) values ('"+per.getDpiPersona()+"','"+per.getNombresPersona()+"')"; 
        
    try{
        con = conect.getConnection();
        ps = con.prepareStatement(sql);
        ps.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
    }


    public boolean edit(Persona per) {
        String sql = "update persona set dpiPersona = '"+per.getDpiPersona()+"', nombresPersona= '"+per.getNombresPersona()+"'where idPersona= " +per.getIdPersona();
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public boolean eliminar(int id) {
        String sql = "delete from persona where idPersona = "+id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}