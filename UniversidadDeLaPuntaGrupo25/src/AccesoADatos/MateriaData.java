package AccesoADatos;


import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
    private Connection con;

    public MateriaData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
           String sql = "INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar materia en la base de datos");
        }
        
    }
    
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = ("SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos: ");
        }

        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ? , año = ? WHERE idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la materia correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos");

        }
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia SET estado = ? WHERE idMateria = ?";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la materia");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja la materia");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la baja en la base de datos");
        }
    }
    
    public List<Materia> listarMaterias(){
        List<Materia> lista = new ArrayList<>();
        Materia materia = null;
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE estado=1";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
                lista.add(materia);
            }
          ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al cargar la baja en la base de datos");
        }
        
        return lista;
    }
    
    
    
}
