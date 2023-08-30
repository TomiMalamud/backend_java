package ar.edu.utn.frc.backend;

public class Estudiante {
    private String nombre;
    private int edad;
    private int legajo;
    public Estudiante () {
        this.nombre = "Roberto (Por defecto)";
        this.edad = 0;
        this.legajo = 0;
    }
    public Estudiante (String nombre, int edad, int legajo){
        this.nombre = nombre;
        this.edad = edad;
        this.legajo = legajo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if (this.edad > 0)
            this.edad = edad;
        else
            this.edad=1; // default
    }
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        if (this.legajo > 0)
            this.legajo=legajo;
        else
            this.legajo = 1; // default
    }

    public void inscribir(String materia) {
        System.out.println(this.nombre + "se inscribió a " + materia);
    }
    public String toString(){
        return ("nombre: "+ this.nombre + "edad: " + this.edad + "Legajo: " + legajo);
    }
}
