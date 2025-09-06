/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmacia;

import java.util.Date;

/**
 *
 * @author young
 */
public class Farmacia {

    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("MED001", "Paracetamol", "analgesico", 10, new Date());
        Cliente cliente = new Cliente("21.614.341-8", "Peter Parker ");
        Proovedor proovedor = new Proovedor("PROV001", "Laboratorios Chile");
        Inventario inventario = new Inventario();
        
        proovedor.suministrar("Paracetamol"); //argumento del metodo suministrar
        inventario.registrarProovedor(proovedor);  //argumento del metodo registrarProovedor
        
        medicamento.vender(cliente);
        inventario.registrarMedicamento(medicamento);
        inventario.registrarCliente(cliente);
        
        inventario.informeVenta();
        
        cliente.devolverMedicamento();
        
        
        
    }
}
