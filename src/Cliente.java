/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Cliente {
    private String Nombre;
    private int Edad;
    private String Profesion;
    private int CarrosComprados;
    private double SueldoDisponible;

    public Cliente() {
    }

    public Cliente(String Nombre, int Edad, String Profesion, int CarrosComprados, double SueldoDisponible) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
        this.CarrosComprados = CarrosComprados;
        this.SueldoDisponible = SueldoDisponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getCarrosComprados() {
        return CarrosComprados;
    }

    public void setCarrosComprados(int CarrosComprados) {
        this.CarrosComprados = CarrosComprados;
    }

    public double getSueldoDisponible() {
        return SueldoDisponible;
    }

    public void setSueldoDisponible(double SueldoDisponible) {
        this.SueldoDisponible = SueldoDisponible;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nCarros Comprados=" + CarrosComprados;
    }
    
}
