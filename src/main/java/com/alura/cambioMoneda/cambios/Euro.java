package com.alura.cambioMoneda.cambios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.alura.cambioMoneda.enum_divisas.Divisas;
import com.alura.conversor.moneda.Moneda;

/**
 *
 * @author Usuario
 */
public class Euro extends Moneda {
    public Euro() {
		// TODO Auto-generated constructor stub
		agregarDivisas();
	}
	
	public void agregarDivisas() {
		String euro = Divisas.EURO.name();
		
		anadirDivisa(euro, Divisas.SOLES.name(),4.00);
		anadirDivisa(euro, Divisas.LIBRAS_ESTERLINAS.name(), 0.86);
		anadirDivisa(euro, Divisas.YEN.name(), 155.45);
		anadirDivisa(euro, Divisas.WON.name(), 1428.45);
		anadirDivisa(euro, Divisas.DOLAR.name(), 1.10);
        }
}
