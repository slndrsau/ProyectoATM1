/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoatm1;

// @author slend

import java.util.Scanner;


public class Teclado {
    private Scanner scann;
    
    public Teclado(){
        scann = new Scanner(System.in);
    }
    
    public int recibirEntrada(){
        return scann.nextInt();
    }
}
