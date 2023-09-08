/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ezequiel
 */
public class Inscripcion {

    private int idIncripcion;
    private int nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
    }

    public Inscripcion(int nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int idIncripcion, int nota, Alumno alumno, Materia materia) {
        this.idIncripcion = idIncripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdIncripcion() {
        return idIncripcion;
    }

    public void setIdIncripcion(int idIncripcion) {
        this.idIncripcion = idIncripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
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
        return "Inscripcion{" + "idIncripcion=" + idIncripcion + ", nota=" + nota + ", Apellido=" + alumno.getApellido() +", Nombre=" + alumno.getNombre()+ ", materia=" + materia.getNombre() + '}';
    }

    
}
