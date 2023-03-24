/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoatm1;

// @author slend

public  abstract class Transaccion {
    private int monto;
    
    
    public int getMonto(){
    return monto;
    }
    
    public void setMonto(int monto){
        this.monto = monto;
    }
    
    public void ejecutar(){
        System.out.println("sse ejecuta la accion desde " + this.getClass().getSimpleName());
    }
}
