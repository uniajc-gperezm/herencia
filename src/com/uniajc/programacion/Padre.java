/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniajc.programacion;

/**
 *
 * @author g.perezmoreno
 */
public class Padre extends Abuelo {
    
    String varPadre = "Padre";
    
    public void metodoPadre() {
        metodoAbuelo();
        System.out.println(varPadre);
    }
    
}
