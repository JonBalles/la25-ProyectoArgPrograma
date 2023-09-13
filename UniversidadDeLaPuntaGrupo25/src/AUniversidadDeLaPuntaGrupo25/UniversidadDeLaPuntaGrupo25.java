package AUniversidadDeLaPuntaGrupo25;

import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Inscripcion;
import java.time.LocalDate;
import AccesoADatos.MateriaData;
import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.Conexion;

public class UniversidadDeLaPuntaGrupo25 {

    
    public static void main(String[] args) {
       Alumno nuevo = new Alumno(58585858, "Nito", "Fula", LocalDate.now(), true);
       Materia mat = new Materia("Filosofia", 2023,true);
       Inscripcion nueva = new Inscripcion(9,nuevo,mat);
       
       Conexion.getConexion();
       
       
       MateriaData Mdata = new MateriaData();
       AlumnoData AData = new AlumnoData();
      InscripcionData IData = new InscripcionData();
       
       
      AData.guardarAlumno(nuevo);
      Mdata.guardarMateria(mat);
      IData.guardarInscripcion(nueva);
      
      
      
      
      
       
    }
    
}
