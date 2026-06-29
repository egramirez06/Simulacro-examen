/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;
import java.time.LocalTime;
import libros.Libro;
import estudiantes.Estudiante;

/**
 *
 * @author Stef
 */
public class Prestamo {
    
    private int numeroPrestamo;
    private LocalTime fecha;
    private Libro libro;
    private Estudiante estudiante;

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Prestamo(int numeroPrestamo, LocalTime fecha, Libro libro, Estudiante estudiante) {
        this.numeroPrestamo = numeroPrestamo;
        this.fecha = fecha;
        this.libro = libro;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numeroPrestamo=" + numeroPrestamo + ", fecha=" + fecha + ", libro=" + libro + ", estudiante=" + estudiante + '}';
    }
    
    
    
    
    
   
    
    
}
