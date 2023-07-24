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
public class Yen extends Moneda {
    	public Yen() {
		// TODO Auto-generated constructor stub
		agregarDivisas();
	}
	
	public void agregarDivisas() {
		String yen = Divisas.YEN.name();
		
		anadirDivisa(yen, Divisas.EURO.name(),0.0064);
		anadirDivisa(yen, Divisas.LIBRAS_ESTERLINAS.name(), 0.0055);
		anadirDivisa(yen, Divisas.SOLES.name(), 0.026);
		anadirDivisa(yen, Divisas.WON.name(), 9.19);
		anadirDivisa(yen, Divisas.DOLAR.name(), 0.0071);

		//Nota añadir condicion para que si son iguales no se añadan
//		System.out.println(monedas.values());
		
		
	}
}
