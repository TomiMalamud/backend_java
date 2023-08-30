package ar.edu.utn.frc.backend;

public class App {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante("El gena 🥰", 20, 89772);
        estudiante.inscribir("Matematica");
        System.out.println(estudiante);
    }
}
