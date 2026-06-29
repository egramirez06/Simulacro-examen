/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;

/**
 *
 * @author Stef
 */
public class Prestamo {
    
    private int codigo;
    private String titulo;
    private String autor;
    private double precio;
    
    public int getCodigo(){
        return this.codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Prestamo(int codigo, String titulo, String autor, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Prestamo{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
}
