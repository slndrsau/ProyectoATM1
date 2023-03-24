/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoatm1;

// @author slend

public class Deposito extends Transaccion{

    public Deposito() {
        super();
    }
    @Override
    public void ejecutar(){
    System.out.println("su deposito ha sido exitoso");
    }
}
