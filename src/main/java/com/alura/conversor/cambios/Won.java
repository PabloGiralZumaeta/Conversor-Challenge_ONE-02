/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.cambios;

import com.alura.cambioMoneda.enum_divisas.Divisas;
import com.alura.conversor.moneda.Moneda;



/**
 *
 * @author Usuario
 */
public class Won  extends Moneda{
    	public Won() {
		// TODO Auto-generated constructor stub
		agregarDivisas();
	}
	
	public void agregarDivisas() {
		String won = Divisas.WON.name();
		
		anadirDivisa(won, Divisas.EURO.name(),0.00070);
		anadirDivisa(won, Divisas.LIBRAS_ESTERLINAS.name(), 0.00060);
		anadirDivisa(won, Divisas.YEN.name(),0.11);
		anadirDivisa(won, Divisas.SOLES.name(),0.0028);
		anadirDivisa(won, Divisas.DOLAR.name(), 0.00077);

		//Nota añadir condicion para que si son iguales no se añadan
//		System.out.println(monedas.values());
		
		
	}
}
