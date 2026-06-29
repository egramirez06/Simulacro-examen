/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiantes;

/**
 *
 * @author Stef
 */
public class Estudiante {
    private String nombre;
    private String cedula;
    private String carrera;
    
    public String getNombre(){
        return this.nombre;
    }
    public String getCedula(){
        return this.cedula;
    }
    public String carrera(){
        return this.carrera;
    }
    public void setCarrera(String carrera) {
       this.carrera = carrera;
    }
    public Estudiante(String nombre, String cedula, String carrera){
        this.nombre = nombre;
        this.cedula= cedula;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + '}';
    }
    
    
    
}
