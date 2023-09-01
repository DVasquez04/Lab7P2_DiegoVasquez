/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Vendedor {
    private String Nombre;
    private int CantVendidos;
    private double DineroGenerado;

    public Vendedor() {
    }

    public Vendedor(String Nombre, int CantVendidos, double DineroGenerado) {
        this.Nombre = Nombre;
        this.CantVendidos = CantVendidos;
        this.DineroGenerado = DineroGenerado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantVendidos() {
        return CantVendidos;
    }

    public void setCantVendidos(int CantVendidos) {
        this.CantVendidos = CantVendidos;
    }

    public double getDineroGenerado() {
        return DineroGenerado;
    }

    public void setDineroGenerado(double DineroGenerado) {
        this.DineroGenerado = DineroGenerado;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nCantidad de Vehiculos Vendidos=" + CantVendidos + "\nDinero Generado=" + DineroGenerado;
    }
    
}
