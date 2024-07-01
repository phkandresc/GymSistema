package org.gimnasio.daos;

import org.gimnasio.model.Clase;
import org.gimnasio.model.DBConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO implements CRUD<Clase>{
    @Override
    public List<Clase> obtenerListaDeDatos() throws SQLException {
        List<Clase> listaClases = new ArrayList<>();
        PreparedStatement ps = null;
        try{
            Connection connection = DBConexion.getConnection();
            ps = connection.prepareStatement("SELECT * FROM clases");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Clase clase = new Clase();
                clase.setId(rs.getInt("id"));
                clase.setIdTipoClase(rs.getInt("id_tipo_clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setDescripcion(rs.getString("descripcion"));
                clase.setCosto(rs.getDouble("costo"));
                clase.setIdInstructor(rs.getInt("id_instructor"));
                listaClases.add(clase);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (ps != null){
                ps.close();
            }
        }
        return listaClases;
    }

    @Override
    public boolean agregarDato(Clase dato) throws SQLException {
        PreparedStatement ps = null;
        try{
            Connection connection = DBConexion.getConnection();
            ps = connection.prepareStatement("INSERT INTO clases (id_tipo_clase, nombre, descripcion, costo, id_instructor) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, dato.getIdTipoClase());
            ps.setString(2, dato.getNombre());
            ps.setString(3, dato.getDescripcion());
            ps.setDouble(4, dato.getCosto());
            ps.setInt(5, dato.getIdInstructor());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        } finally {
            if (ps != null){
                ps.close();
            }
        }
    }

    @Override
    public boolean actualizarDato(Clase dato) throws SQLException {
        return false;
    }

    @Override
    public boolean eliminarDato(Clase dato) throws SQLException {
        PreparedStatement ps = null;
        try{
            Connection connection = DBConexion.getConnection();
            ps = connection.prepareStatement("DELETE FROM clases WHERE id = ?");
            ps.setInt(1, dato.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        } finally {
            if (ps != null){
                ps.close();
            }
        }
    }

    @Override
    public Clase buscarDatoPorId(int id) throws SQLException{
        PreparedStatement ps = null;
        Clase clase = null;
        try{
            Connection connection = DBConexion.getConnection();
            ps = connection.prepareStatement("SELECT * FROM clases WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                clase = new Clase();
                clase.setId(rs.getInt("id"));
                clase.setIdTipoClase(rs.getInt("id_tipo_clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setDescripcion(rs.getString("descripcion"));
                clase.setCosto(rs.getDouble("costo"));
                clase.setIdInstructor(rs.getInt("id_instructor"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (ps != null){
                ps.close();
            }
        }
        return clase;
    }
}
