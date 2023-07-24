/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.Temperatura.tipos;

import com.alura.Temperatura.Operacion;
import com.alura.Temperatura.Temperatura;
import static com.alura.Temperatura.Temperatura.Temperatura;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kelvin extends Temperatura {

    public Kelvin() {
        super();
        anadirOperaciones();
    }

    private void anadirOperaciones() {
        anadirTemperatura("Kelvin", "Celcius", (valor1) -> {
            double kelvin = Double.parseDouble(valor1);
            double celsius = kelvin - 273.15;
            return String.valueOf(celsius);
        });
        anadirTemperatura("Kelvin", "Fahrenheit", (valor1) -> {
            double kelvin = Double.parseDouble(valor1);
            double fahrenheit = (kelvin - 273.15)*1.8 + 32;
            return String.valueOf(fahrenheit);
        });
    }
    
    
    public String temperaturaObtenida(String escalaDestino, String temperaturaKelvin) {
        Map<String, Operacion> temperaturaskelvin = Temperatura.get("Kelvin");
        if (temperaturaskelvin != null) {
            Operacion operacion = temperaturaskelvin.get(escalaDestino);
            if (operacion != null) {
                String temperaturaConvertida = operacion.operacion(temperaturaKelvin);
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
