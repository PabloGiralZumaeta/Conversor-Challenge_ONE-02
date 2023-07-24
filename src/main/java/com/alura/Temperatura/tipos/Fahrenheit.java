/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.Temperatura.tipos;

import com.alura.Temperatura.Operacion;
import com.alura.Temperatura.Temperatura;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Fahrenheit extends Temperatura {

    public Fahrenheit() {
        super();
        anadirOperaciones();
    }

    private void anadirOperaciones() {
        anadirTemperatura("Fahrenheit", "Celcius", (valor1) -> {
            double fahrenheit = Double.parseDouble(valor1);
            double celsius = (fahrenheit - 32) * 5 / 9;
            return String.valueOf(celsius);
        });
        anadirTemperatura("Fahrenheit", "Kelvin", (valor1) -> {
            double fahrenheit = Double.parseDouble(valor1);
            double kelvin = (fahrenheit + 459.67)* 5/9;
            return String.valueOf(kelvin);
        });

    }
    
    
    public String temperaturaObtenida(String escalaDestino, String temperaturaFahrenheit) {
        Map<String, Operacion> temperaturasFahrenheit = Temperatura.get("Fahrenheit");
        if (temperaturasFahrenheit != null) {
            Operacion operacion = temperaturasFahrenheit.get(escalaDestino);
            if (operacion != null) {
                String temperaturaConvertida = operacion.operacion(temperaturaFahrenheit);
                System.out.println("Temperatura en " + escalaDestino + ": " + temperaturaConvertida);
                return temperaturaConvertida;
            } else {
                System.out.println("No se encontró la operación de conversión");
                return 0 + "";
            }
        } else {
            System.out.println("No se encontró la temperatura de origen");
            return 0 + "";
        }
    }
}
