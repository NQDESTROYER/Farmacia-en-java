/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author young
 */
public class Inventario {      //{}
    private String medicamentoActual;
    private String clienteActual;
    private String proovedorActual;
    private String registroVentas = "";
                                    // recibe un objeto Medicamento
    public void registrarMedicamento(Medicamento medicamento)
    {
        this.medicamentoActual = medicamento.getNombre();
    }        
    public void registrarCliente(Cliente cliente)
    {
        this.clienteActual = cliente.getNombre();
        registroVentas += "cliente: " + cliente.getNombre() +
                           "compro: " + cliente.getMedicamentoAdquirido();                     
    }
    public void registrarProovedor(Proovedor proovedor)  //Parametro
    {
        this.proovedorActual = proovedor.getNombre();
    }
    public void informeVenta()
    {
        System.out.println("****informe de Ventas****");
        System.out.println(registroVentas);
    }
}
