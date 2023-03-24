/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoatm1;

// @author slend

public class Cuenta {
   private float saldo;
   private int numeroDeCuenta;
   private int nip;
   private Cliente cliente;
   
   public Cuenta(){
   
   }
   
   public Cuenta (int numeroCuenta){
       if (numeroCuenta > 9999 && numeroCuenta < 100000){
           this.numeroDeCuenta = numeroCuenta;
   }else{
           System.out.println("ingrese un numero de cuenta valido");
       }
   }
    
    // contructor; inicializa el estado del objeto 
    Cuenta(String nombre){
    System.out.println("bienvenido");
      }
    
   //private void acreditar (int monto){}
   //private void debitar(int monto){}
   //private float consultar(int numeroDecuenta){return 0.0f;}

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the numeroDeCuenta
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 10000){
            this.numeroDeCuenta = numeroDeCuenta;
        }else{
            System.out.println("Ingrese un numero de cuenta valido");
        }      
    }

    /**
     * @return the nip
     */
    public int getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(int nip) {
        this.nip = nip;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public float consultar(int numeroDecuenta){
    
        float consulta = 100000;
    
    return consulta;
    }
}
