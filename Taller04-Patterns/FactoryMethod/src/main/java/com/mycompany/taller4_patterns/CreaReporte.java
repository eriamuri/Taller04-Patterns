/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4_patterns;

/**
 *
 * @author author
 */
public abstract class CreaReporte {
    public String texto;
    
    abstract Reporte CrearReport();
    
    public void Visualizar(){
        System.out.println("el texto");
    }
}
