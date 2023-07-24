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
public class Celsius extends Temperatura {

    public Celsius() {
        super();
        anadirOperaciones();
    }

    private void anadirOperaciones() {
        anadirTemperatura("Celsius", "Fahrenheit", (valor1) -> {
            double celsius = Double.parseDouble(valor1);
            double fahrenheit = celsius * 9 / 5 + 32;
            return String.valueOf(fahrenheit);
        });
        anadirTemperatura("Celsius", "Kelvin", (valor1) -> {
            double celsius = Double.parseDouble(valor1);
            double kelvin = celsius + 273.15;
            return String.valueOf(kelvin);
        });

    }

 
    public String temperaturaObtenida(String escalaDestino, String temperaturaCelsiusValor) {
        Map<String, Operacion> temperaturasCelsius = Temperatura.get("Celsius");
        if (temperaturasCelsius != null) {
            Operacion operacion = temperaturasCelsius.get(escalaDestino);
            
//        System.out.println( operacion);
            if (operacion != null) {
                String temperaturaConvertida = operacion.operacion(temperaturaCelsiusValor);
                System.out.println("Temperatura en " + escalaDestino + ": " + temperaturaConvertida);
                return temperaturaConvertida;
            } else {
                System.out.println("No se encontró la operación de conversión");
                System.out.println(operacion + "Ahora vemos Operacion");
                return 0 + "";
            }
        } else {
            System.out.println("No se encontró la temperatura de origen");
            return 0 + "";
        }
    }
}
