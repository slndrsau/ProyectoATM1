/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyectoatm1;

// @author slend

public class ATM {

     private Dispensador oDispensador;
     private Pantalla oPantalla;
     private RanuraDeDeposito oRanura;
     private Teclado oTeclado;
     private Transaccion oDeposito;
     private Transaccion oRetiro;

    public ATM() {
        this.oDispensador = new Dispensador();
        this.oPantalla = new Pantalla();
        this.oRanura = new RanuraDeDeposito();
        this.oTeclado = new Teclado();
        this.oDeposito = new Deposito();
        this.oRetiro = new Retiro();
        this.inicializar();
    }
    
    
    public void despositar(int monto) {
        this.oDeposito.ejecutar();
        
    }

    public void acreditar(int monto) {
        
    }

    public void mostarSaldo(int numeroDeCuenta) {
        float saldo;
        Cuenta oCuenta = new Cuenta();
        saldo = oCuenta.consultar(numeroDeCuenta);
        this.oPantalla.mostrarMensaje(String.format("el saldo de su cuenta es: %s", saldo));
        
    }

    public void retirar(int monto) {
        
        this.oRetiro.ejecutar();
    }
    
    public void ejecutar(int opcion, int cuenta){
    int monto = 0 ;
    switch(opcion){
        case 1:
            this.mostarSaldo(cuenta);
            break;
        case 2:
            this.oPantalla.mostrarMensaje("ingrese un monto a retirar");
            monto = this.oTeclado.recibirEntrada();
            break;
        case 3:
            this.oPantalla.mostrarMensaje("ingrese un monto a depositar");
            monto = this.oTeclado.recibirEntrada();
            break;
        case 4:
            this.oPantalla.mostrarMensaje("hasta luego");
            break;
        default:
            this.oPantalla.mostrarMensaje("ingresa una opcion valido");
            break;
        }
    }

    public void debitar(int monto) {
        
    }

    public boolean autenticar(int nip, int numeroDeCuenta) {
        this.oPantalla.mostrarMensaje(String.format("el numero de cuenta que ingresaste es: %s \ntu nip es: %s\n", numeroDeCuenta, nip));
        return false;
    }
    
    private void inicializar(){
        int nip = 0;
        int numeroDeCuenta = 0;
        int op;
        this.oPantalla.mostrarMensaje("Bienvenido al Mejor Cajero Del Mundo \n");
        this.oPantalla.mostrarMensaje("Ingrese su Número de Cuenta:  ");
        numeroDeCuenta = this.oTeclado.recibirEntrada();
        this.oPantalla.mostrarMensaje("Ingrese su nip: ");
        nip = this.oTeclado.recibirEntrada();
        
        this.autenticar(nip, numeroDeCuenta);
        
        this.oPantalla.mostrarMenu();
        op = this.oTeclado.recibirEntrada();
        
        this.ejecutar(op, numeroDeCuenta);
    }
}