package Entidades;

public class Inscripcion {

    private int idInscripcion;
    private double nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
    }

    public Inscripcion(double nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int idInscripcion, double nota, Alumno alumno, Materia materia) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idIncripcion) {
        this.idInscripcion = idIncripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idIncripcion=" + idInscripcion + ", nota=" + nota + ", Apellido=" + alumno.getApellido() +", Nombre=" + alumno.getNombre()+ ", materia=" + materia.getNombre() + '}';
    }

    
}
