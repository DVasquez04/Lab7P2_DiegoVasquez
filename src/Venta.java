/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Venta {
    private Vendedor vendedor;
    private Cliente cliente;
    private double Costo_Transaccion;
    private Vehiculo Carro;

    public Venta() {
    }

    public Venta(Vendedor vendedor, Cliente cliente, double Costo_Transaccion, Vehiculo Carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.Costo_Transaccion = Costo_Transaccion;
        this.Carro = Carro;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCosto_Transaccion() {
        return Costo_Transaccion;
    }

    public void setCosto_Transaccion(double Costo_Transaccion) {
        this.Costo_Transaccion = Costo_Transaccion;
    }

    public Vehiculo getCarro() {
        return Carro;
    }

    public void setCarro(Vehiculo Carro) {
        this.Carro = Carro;
    }
    
}
