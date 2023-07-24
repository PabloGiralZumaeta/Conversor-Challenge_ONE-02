/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.cambioMoneda.cambios;


import com.alura.cambioMoneda.enum_divisas.Divisas;
import com.alura.cambioMoneda.moneda.Moneda;

/**
 *
 * @author Usuario
 */
public class Dolares extends Moneda {

    public Dolares() {
        // TODO Auto-generated constructor stub
        agregarDivisas();
    }

    public void agregarDivisas() {
        String dolar = Divisas.DOLAR.name();

        anadirDivisa(dolar, Divisas.EURO.name(), 0.91);
        anadirDivisa(dolar, Divisas.LIBRAS_ESTERLINAS.name(), 0.78);
        anadirDivisa(dolar, Divisas.YEN.name(), 142.07);
        anadirDivisa(dolar, Divisas.WON.name(), 1297.90);
        anadirDivisa(dolar, Divisas.SOLES.name(), 3.63);
    }
}
