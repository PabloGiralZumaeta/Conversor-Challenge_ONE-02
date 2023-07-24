/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.cambioMoneda.moneda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public abstract class Moneda {

    public static Map<String, Map<String, Double>> monedas;

    public Moneda() {
        monedas = new HashMap<>();
    }

    protected void anadirDivisa(String pais1, String pais2, double ValorCambio) {
        if (!monedas.containsKey(pais1)) {
            monedas.put(pais1, new HashMap<String, Double>());
        }
        monedas.get(pais1).put(pais2, ValorCambio);
    }

    public String Operacion(String cambio, double valor) {
        BigDecimal tipoCambio = new BigDecimal(valor);
        BigDecimal resultado = null;
        BigDecimal divisa = new BigDecimal(cambio);
        resultado = tipoCambio.multiply(divisa);
        resultado = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return resultado.toString();

    }

    public double CambioRetornado(String moneda1, String moneda2) {
        if (!(monedas.containsKey(moneda1) || monedas.get(moneda1).containsKey(moneda2))) {
            return 0;
        }
        return monedas.get(moneda1).get(moneda2);

    }

}
