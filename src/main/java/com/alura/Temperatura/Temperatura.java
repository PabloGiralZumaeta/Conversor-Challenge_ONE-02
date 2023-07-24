/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.Temperatura;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 *
 * @author Usuario
 */
public abstract class Temperatura {

//    protected static Map<String, Map<String, Operacion<Double, Double>>> Temperatura;

    /**
     *
     */
    public static Map<String, Map<String, Operacion>> Temperatura;

    public Temperatura() {
        Temperatura = new HashMap<>();
    }

    public void anadirTemperatura(String temperatura1, String temperatura2, Operacion formula) {
        if (!Temperatura.containsKey(temperatura1)){
            Temperatura.put(temperatura1, new HashMap<String, Operacion>());
        }
        Temperatura.get(temperatura1).put(temperatura2, formula);
    }
   
    

}
