/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.util;

import com.alura.Temperatura.tipos.Celsius;
import com.alura.Temperatura.Temperaturas;
import com.alura.Temperatura.tipos.Fahrenheit;
import com.alura.Temperatura.tipos.Kelvin;

/**
 *
 * @author Usuario
 */
public class TemperaturasAgrupadas {

    public Boolean BuscarTemperatura(String temperaturaBuscar) {
        for (Temperaturas tempertatura : Temperaturas.values()) {
            if (tempertatura.name() == temperaturaBuscar) {
                return true;
            }
        }
        return false;
    }

    public String OperaciónTemperatura(String temperatura1, String temperatura2, String valor) {
//        System.out.println(BuscarTemperatura(temperatura1) );
//        System.out.println(temperatura1 != temperatura2);
        if (BuscarTemperatura(temperatura1) && BuscarTemperatura(temperatura2) && temperatura1 != temperatura2) {
            if (temperatura1 == Temperaturas.Celcius.name()) {
                Celsius celsius = new Celsius();
                return celsius.temperaturaObtenida(temperatura2, valor);
            }
            if (temperatura1 == Temperaturas.Fahrenheit.name()) {               
                Fahrenheit fahrenheit = new Fahrenheit();
                return fahrenheit.temperaturaObtenida(temperatura2, valor);
            }
            if (temperatura1 == Temperaturas.Kelvin.name()) {
                Kelvin kelvin = new Kelvin();
                return kelvin.temperaturaObtenida(temperatura2, valor);
            }
        }
        return "Operación invalida, revisar las opciones";
    }

}
