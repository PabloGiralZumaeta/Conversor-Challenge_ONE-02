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
public class Libras_Esterlinas extends Moneda {
    public Libras_Esterlinas() {
		// TODO Auto-generated constructor stub
		agregarDivisas();
	}
	public void agregarDivisas() {
		String librasEsterlinas = Divisas.LIBRAS_ESTERLINAS.name();
		
		anadirDivisa(librasEsterlinas, Divisas.EURO.name(),1.17);
		anadirDivisa(librasEsterlinas, Divisas.YEN.name(), 181.65);
		anadirDivisa(librasEsterlinas, Divisas.WON.name(), 1668.74);
		anadirDivisa(librasEsterlinas, Divisas.DOLAR.name(), 1.29);
		anadirDivisa(librasEsterlinas, Divisas.SOLES.name(), 4.67);

		//Nota añadir condicion para que si son iguales no se añadan
//		System.out.println(monedas.values());
		
		
	}
}
