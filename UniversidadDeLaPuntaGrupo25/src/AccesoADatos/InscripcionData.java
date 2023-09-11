package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData alumData;

    public InscripcionData() {
        this.con= Conexion.getConexion();
    }
    
    
    public void guardarInscripcion(Inscripcion ins){
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }
        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> lista = new ArrayList<>();
        Inscripcion ins = null;
        String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                ins.setNota(rs.getInt("nota"));
                ins.setAlumno(alumData.buscarAlumnoPorId(rs.getInt("idAlumno")));
                ins.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                lista.add(ins);
            }
          ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }
        
        return lista;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
         List<Inscripcion> lista = new ArrayList<>();
         Inscripcion ins = null;
         String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion WHERE idAlumno = ?";
         PreparedStatement ps;
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {
                 ins = new Inscripcion();
                 ins.setIdInscripcion(rs.getInt("idInscripto"));
                 ins.setNota(rs.getInt("nota"));
                 ins.setAlumno(alumData.buscarAlumnoPorId(rs.getInt("idAlumno")));
                 ins.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                 lista.add(ins);
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
         }

         return lista;
    }
     
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> lista = new ArrayList<>();
        Materia materia = null;
        String sql = ("SELECT materia.idMateria, nombre, año, estado from materia join inscripcion on (materia.idMateria = inscripcion.idMateria) where idAlumno = ?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                lista.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }

        return lista;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
         List<Materia> lista = new ArrayList<>();
        Materia materia = null;
        String sql = ("SELECT materia.idMateria, nombre, año from materia join inscripcion on (materia.idMateria != inscripcion.idMateria) where idAlumno = ?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                lista.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }

        return lista;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la inscripcion");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja la inscripcion");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la nota correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo la nota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);

        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        List<Alumno> lista = new ArrayList<>();
        Alumno alumno = null;
       String sql=("SELECT alumno.idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM inscripcion join alumno on (inscripcion.idAlumno=alumno.idAlumno) WHERE idMateria=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                alumno= new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));        
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }

        return lista;
    }
}
