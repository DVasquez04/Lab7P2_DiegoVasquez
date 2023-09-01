
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Vehiculo {
    private String Marca;
    private Color color;
    private String Modelo;
    private int Año;
    private double PrecioVenta;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, Color color, String Modelo, int Año, double PrecioVenta) {
        this.Marca = Marca;
        this.color = color;
        this.Modelo = Modelo;
        this.Año = Año;
        this.PrecioVenta = PrecioVenta;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    @Override
    public String toString() {
        return "Marca=" + Marca + "\nModelo=" + Modelo + "\nA\u00f1o=" + Año;
    }
    
}
