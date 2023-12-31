package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar alumno en la base de datos");
        }

    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?,fechaNacimiento = ? WHERE idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo los dato del alumno correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos");

        }
    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = false WHERE idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);      
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja al alumno");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja al alumno");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la baja en la base de datos");
        }
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> lista = new ArrayList<>();
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                lista.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar la lista de alumnos");
        }

        return lista;
    }

    public Alumno buscarAlumnoPorId(int id) {
        Alumno alumno = null;
        String sql = ("SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE idAlumno=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar del alumno");
        }

        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = ("SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar del alumno");
        }

        return alumno;
    }

    public void reActivarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = true WHERE idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de alta al alumno");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo reactivar al alumno");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error el alta al alumno la base de datos");
        }
    }
}
