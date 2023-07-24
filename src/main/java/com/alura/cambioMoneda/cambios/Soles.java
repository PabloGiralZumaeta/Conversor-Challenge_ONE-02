/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.cambioMoneda.cambios;

import com.alura.cambioMoneda.enum_divisas.Divisas;
import com.alura.conversor.moneda.Moneda;

/**
 *
 * @author Usuario
 */
public class Soles extends Moneda {

    public Soles() {
        // TODO Auto-generated constructor stub

        agregarDivisas();
    }

    public void agregarDivisas() {
        String soles = Divisas.SOLES.name();

        anadirDivisa(soles, Divisas.EURO.name(), 0.25);
        anadirDivisa(soles, Divisas.LIBRAS_ESTERLINAS.name(), 0.21);
        anadirDivisa(soles, Divisas.YEN.name(), 38.80);
        anadirDivisa(soles, Divisas.WON.name(), 354.45);
        anadirDivisa(soles, Divisas.DOLAR.name(), 0.27);

        //Nota añadir condicion para que si son iguales no se añadan
//		System.out.println(monedas.values());
    }

}
