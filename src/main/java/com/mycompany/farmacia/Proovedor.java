/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author young
 */
public class Proovedor {      //{}
    private String codigo;
    private String nombre;
    private String medicamentoProvisto;
    
    public Proovedor(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.medicamentoProvisto = "Ninguno";
    }  
    public void suministrar(String medicamento)  //parametro
    {
        this.medicamentoProvisto = medicamento;
        System.out.println("Proovedor "+ this.nombre + " sumninistro "+ medicamento);
    }
    //getters
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getMedicamentoProvisto() {
        return this.medicamentoProvisto;
    }
    
}
